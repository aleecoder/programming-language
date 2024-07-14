// 一个函数它接收字符串作为参数，返回它在这个字符串里找到的第一个单词
// 如果函数没找到任何空格，那么整个字符串就被返回
fn first_word(s: &str) -> &str {
    let bytes = s.as_bytes();
    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &s[..i];
        }
    }
    &s[..]
}

#[test]
fn test_first_word() {
    let s = String::from("hello world");
    let word = first_word(&s);
    println!("the first word is: {}", word);
    
    let s = "hello world";
    let word = first_word(s);
    println!("the first word is: {}", word);
}

#[test]
fn test_slice() {
    let s = String::from("Hello World");
    assert_eq!(&s[0..5], "Hello");
    assert_eq!(&s[..5], "Hello");

    assert_eq!(&s[6..11], "World");
    assert_eq!(&s[6..=10], "World");
    assert_eq!(&s[6..s.len()], "World");
    assert_eq!(&s[6..], "World");

    assert_eq!(&s[..], "Hello World");
}
