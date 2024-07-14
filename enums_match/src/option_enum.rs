pub fn option_enum() {
    let some_number = Some(5);
    let some_string = Some("a string");
    let absent_number: Option<i32> = None;
    println!("{:?} {:?} {:?}", some_number, some_string, absent_number)
}

#[test]
fn option_t() {
    let x: i8 = 5;
    let y: Option<i8> = Some(10); // `y` may be None
    let sum = x + y.unwrap_or(0);
    // let _sum = x + y; // Cannot add `Option<i8>` to `i8`
    let _sum = match y {
        Some(y) => x + y,
        None => x,
    };
    assert_eq!(sum, 15);
}
