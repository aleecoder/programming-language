use rand::Rng;
use std::cmp;

#[test]
fn shadowing() {
    let x = 5;
    let x = x + 1;
    println!("the value of x is {}", x);

    let spaces = "    ";
    let spaces = spaces.len();
    println!("{}", spaces)
}

#[test]
fn val_type() {
    const MAX_POINTS: i32 = 1000_000;
    println!("the const value is {}", MAX_POINTS);
    let guess = "42".parse::<u32>().expect("not a number");
    println!("guess: {}", guess);

    let x = 3.14;
    let y: f32 = 3.14;
    use std::any::type_name_of_val;
    println!("x: {}, type: {}", x, type_name_of_val(&x));
    println!("y: {}, type: {}", y, type_name_of_val(&y));
    println!("{}", 3 / 2);
    println!("{}", true);

    let a = 'a';
    let b: char = 'ℳ';
    let c = '😂';
    println!("{} {} {}", a, b, c);
}

#[test]
fn val_tuple() {
    let tup = (500, 3.14, true, "rust", 'c');
    // TODO: 如何解决？
    // no method named `iter` found for tuple `({integer}, {float}, bool, &str, char)`
    // in the current scope [E0599] method not found in `({integer}, {float}, bool, &str, char)`
    // for t in tup.iter() {
    //     println!("{}", t)
    // }
    println!("{} {} {}", tup.0, tup.1, tup.4);
    // 使用模式匹配解构元组
    let (a, b, c, d, e) = tup;
    println!("{:?} {:?} {:?} {:?} {:?}", a, b, c, d, e)
}

#[test]
fn val_array() {
    // 如果你想让数据存放到stack上而不是heap上，
    // 或者想保证有固定数量的元素，请使用数组
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    let num = [3; 5]; // [3, 3, 3, 3, 3]
    println!("arr = {:?}", arr);
    for i in 0..arr.len() {
        println!("arr[{}]: {}", i, arr[i])
    }
    println!("num = {:?}", num);
    // 编译时不会报错，运行时才会报错
    println!("num[{}] will panic", num[arr[5]])
}

#[test]
fn val_vector() {}

fn foo(x: i32) -> bool {
    x < 1024
}

#[test]
fn compound() {
    let y = {
        let x = 1024;
        let _ = x + 3;
    };
    println!("{:?}", y)
}

#[test]
fn branches() {
    let n = rand::thread_rng().gen_range(1..=4096);
    let n = if n < 2048 { n } else { 2048 };
    if n % 4 == 0 {
        println!("number {} is divisible by 4", n)
    } else if n % 3 == 0 {
        println!("number {} is divisible by 3", n)
    } else if n % 2 == 0 {
        println!("number {} is divisible by 2", n)
    } else {
        println!("number {} is not divisible by 4, 3 or 2", n)
    }
}

#[test]
fn branches_refactor() {
    let n = cmp::min(rand::thread_rng().gen_range(1..=4096), 2048);
    match n {
        n if n % 4 == 0 => println!("number {} is divisible by 4", n),
        n if n % 3 == 0 => println!("number {} is divisible by 3", n),
        n if n % 2 == 0 => println!("number {} is divisible by 2", n),
        _ => println!("number {} is not divisible by 4, 3 or 2", n),
    }
}

#[test]
fn loop_case() {
    let mut counter = 0;
    let result = loop {
        counter += 1;
        if counter == 10 {
            break counter * 2;
        }
    };
    println!("the result is: {}", result)
}

#[test]
fn while_case() {
    let mut counter = 5;
    while counter != 0 {
        println!("{}", counter);
        counter -= 1;
    }
    println!("LIFTOFF!!!")
}

#[test]
fn for_liftoff() {
    for counter in (1..=5).rev() {
        println!("{}", counter)
    }
    println!("LIFTOFF!!!")
}

#[test]
fn for_case() {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    for v in arr.iter() {
        println!("the value is: {}", v)
    }
    // 返回索引和值
    for (i, v) in arr.iter().enumerate() {
        println!("the value of arr[{}] is: {}", i, v)
    }
}

fn main() {
    println!("{}", foo(2048))
}
