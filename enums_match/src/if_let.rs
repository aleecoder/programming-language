#[test]
fn if_let_test(){
    let some_u8_value = Some(0u8);
    match some_u8_value {
        Some(3) => println!("three"),
        _ => (),
    }

    if let Some(3) = some_u8_value {
        println!("three")
    }
    if let Some(3) = some_u8_value { println!("three") } else { println!("others") }
}