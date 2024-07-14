use crate::people::struct_ownership;

mod people;
mod rectangle;
mod user;

#[test]
fn tuple_struct() {
    struct Color(i32, i32, i32);
    struct Point(i32, i32, i32);
    let _black = Color(0, 0, 0);
    let _origin = Point(0, 0, 0);
}

fn main() {
    struct_ownership();
}
