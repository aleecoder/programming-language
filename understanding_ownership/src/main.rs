mod slice;

#[test]
fn string_test() {
    // 字符串字面值不可被修改
    let s = "Hello, world!";
    println!("{}", s)
}

#[test]
fn string_from() {
    // String类型的值可以修改
    let mut s = String::from("Hello");
    s.push_str(", I am a rust programmer!");
    println!("{}", s);

    // Rust会自动调用drop函数，将内存自动交还给OS
}

#[test]
fn move_borrow() {
    let x = 1024;
    let y = x; // x和y被压到了stack中
    println!("x = {}, y = {}", x, y);

    // 一个String由3部分组成
    //  - 一个指向存放字符串内容的内存的指针
    //  - 字符串内容的长度
    //  - 字符串内容的容量
    // 上面这些东西放在stack上，存放字符串内容的部分放在heap上
    let s1 = String::from("Hello, World!");
    let s2 = s1; // s1 value borrowed here after move
                 // println!("s1 = {}", s1);
    println!("s2 = {}", s2);
}

#[test]
fn heap_clone() {
    let s1 = String::from("Hello, World!");
    let s2 = s1.clone();
    println!("s1 = {}, s2 = {}", s1, s2);
}

#[test]
fn stack_copy() {
    let x = 1024;
    let y = x;
    println!("x = {}, y = {}", x, y);

    // 如果一个类型实现了copy这个trait，那么旧的变量在赋值后仍然可用
    // 如果一个类型或该类型的一部分实现了drop traits，那么Rust不允许让它再去实现copy trait了

    // 任何简单标量的组合类型都可以是copy的
    // 任何需要分配内存或者某种资源的都不是copy的
    // 一些拥有copy trait的类型
    //  - 所有的整数类型
    //  - 所有的浮点数类型
    //  - 布尔类型
    //  - 字符类型
    //  - 元组类型，只要元组中的所有元素都是copy的
}

fn take_ownership(s: String) {
    println!("running take ownership function, s = {}", s);
}

fn makes_copy(n: i32) {
    println!("running makes copy function, n = {}", n);
}

#[test]
fn fn_ownership() {
    let s = String::from("Hello, World!");
    take_ownership(s);
    // println!("s = {}", s); // value borrowed here after move

    let n = 1024;
    makes_copy(n);

    println!("n = {}", n);
}

fn gives_ownership() -> String {
    let some_string = String::from("Hello, World!");
    some_string
}

fn takes_and_gives_back(s: String) -> String {
    s
}

#[test]
fn fn_return_ownership() {
    let s1 = gives_ownership();
    let s2 = String::from("Hello, World!");
    let s3 = takes_and_gives_back(s2);

    println!("s1 = {}, s3 = {}", s1, s3);
}

// 如何让函数使用某个值，但不获得其所有权？
//  - 使用引用
//  - 使用可变引用
//  - 使用借用

fn cal_len(s: &String) -> usize {
    s.len()
}

#[test]
fn fn_reference() {
    let s = String::from("Hello, World!");
    let len = cal_len(&s);
    println!("s = {}, len = {}", s, len);
}

fn modify_cal_len(s: &mut String) -> usize {
    s.push_str(", I am a rust programmer!");
    s.len()
}

#[test]
fn fn_mut_reference() {
    let mut s = String::from("Hello, World!");
    let len = modify_cal_len(&mut s);
    println!("s = {}, len = {}", s, len);
}

#[test]
fn more_mut_reference() {
    let mut s = String::from("Hello, World!");
    {
        let _r1 = &mut s;
    }
    let _r2 = &mut s;
}

#[test]
fn more_reference() {
    let mut s = String::from("Hello, World!");
    let _r1 = &s;
    let _r2 = &s;
    let r3 = &mut s; // cannot borrow `s` as mutable because it is also borrowed
                     // println!("r1 = {}, r2 = {}, r3 = {}", r1, r2, r3)
    println!("r3 = {}", r3)
}

// 悬空引用，Rust编译器会禁止
// fn dangle() -> &String {
//     let s = String::from("Hello, World!");
//     &s
// }
//
// #[tests]
// fn fn_dangle() {
//     let _r = dangle();
// }

fn main() {}
