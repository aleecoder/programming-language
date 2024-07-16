#[test]
fn build_vector() {
    let mut vec = Vec::<i32>::new();
    vec.push(1);
    vec.push(2);
    vec.push(3);
    println!("{:?}", vec);
}
#[test]
fn build_vector_2() {
    let mut vec = Vec::new();
    vec.push("hello"); // 自动推断类型
}
#[test]
fn build_vector_3() {
    let v = vec![1, 2, 3, 4, 5]; // 使用宏
    let third = &v[2]; // 使用索引读取Vector，当索引越界时panic
    println!("The third element is {}", third);

    // 使用get方法读取Vector，当索引越界时返回None
    match v.get(20) {
        Some(third) => println!("The third element is {}", third),
        None => println!("There is no third element."),
    }
}

// 所有权和借用规则：不能在同一作用域内同时拥有可变和不可变引用
#[test]
fn build_vector_4() {
    let v = vec![1, 2, 3, 4, 5];
    let first = &v[0]; // 借用Vector的第一个元素
                       // v.push(6); // cannot borrow `v` as mutable because it is also borrowed as immutable
    println!("The first element is: {}", first); // 使用first时panic
}

// 遍历Vector
#[test]
fn build_vector_5() {
    let mut v = vec![1, 2, 3, 4, 5];

    for i in &mut v {
        *i += 50;
    }

    for i in &v {
        println!("{}", i);
    }
}

#[derive(Debug)]
enum SpreadsheetCell {
    Int(i32),
    Float(f64),
    Text(String),
}
#[test]
fn build_vector_6() {
    let row = vec![
        SpreadsheetCell::Int(3),
        SpreadsheetCell::Text(String::from("blue")),
        SpreadsheetCell::Float(10.12),
    ];
    println!("{:?}", row);
}
