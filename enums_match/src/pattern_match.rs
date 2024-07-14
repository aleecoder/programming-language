enum Coin {
    Penny,
    Nickel,
    Dime,
    Quarter(UsState),
}

#[derive(Debug)]
enum UsState {
    Alabama,
    Alaska,
    // --snip--
}

fn value_in_cents(coin: Coin) -> u8 {
    match coin {
        Coin::Penny => 1,
        Coin::Nickel => 5,
        Coin::Dime => 10,
        Coin::Quarter(state) => {
            println!("State quarter from {:?}!", state);
            25
        }
    }
}

#[test]
fn value_in_cents_test(){
    assert_eq!(value_in_cents(Coin::Penny), 1);
    assert_eq!(value_in_cents(Coin::Nickel), 5);
    assert_eq!(value_in_cents(Coin::Dime), 10);
    assert_eq!(value_in_cents(Coin::Quarter(UsState::Alabama)), 25);
    assert_eq!(value_in_cents(Coin::Quarter(UsState::Alaska)), 25);
}