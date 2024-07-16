// Rust的核心语言层面，只有一个字符串类型，即：字符串切片str（或&str）
// String类型，来自标准库std::string::String
// - 可增长、可修改、可拥有
// - UTF-8编码

#[test]
fn string_test() {
    let mut s = String::new();
    s.push_str("hello");

    let data = "initial contents";
    let s = data.to_string();
    println!("{}", s);

    let mut s = String::from("foo");
    s.push_str("bar");
    s.push('!');
    println!("{}", s);

    // 字符串的拼接 +
    let s1 = String::from("Hello, ");
    let s2 = String::from("world!");
    let s3 = s1 + &s2; // s1被移动了，不能再使用
    println!("{}", s3);

    // 字符串的拼接 format！使用宏更加灵活，并且不会取得参数的所有权
    let s1 = String::from("tic");
    let s2 = String::from("tac");
    let s3 = String::from("toe");
    let s = format!("{}-{}-{}", s1, s2, s3);
    println!("{}", s);
}

#[test]
fn string_visit() {
    let hello = String::from("Здравствуйте");
    // let hello = String::from("我爱你");
    println!("the length of '{}' is {}", hello, hello.len());
    
    let w = "नमस्ते"; // 梵文书写的印度单词
    for b in w.bytes() {
        println!("{}", b);
    }
    for b in w.chars() {
        println!("{}", b);
    }
}

// 切割String必须谨慎，如果切割越过了字符边界，会panic
#[test]
fn string_split() {
    let hello = "Здравствуйте";
    let s = &hello[0..4];
    println!("{}", s);
}