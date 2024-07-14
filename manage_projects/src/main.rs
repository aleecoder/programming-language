mod front_of_house;

pub use crate::front_of_house::hosting; // 重导出
use std::{fmt::Result, io::Result as IoResult};
// use std::io;
// use std::io::Write;
// use std::io::*;

fn f1() -> Result {
    Ok(())
}

fn f2() -> IoResult<()> {
    Ok(())
}

pub fn eat_at_restaurant() {
    hosting::add_to_waitlist();
    hosting::add_to_waitlist();
    hosting::add_to_waitlist();
}

fn main() {
    f1().unwrap();
    f2().unwrap();
}
