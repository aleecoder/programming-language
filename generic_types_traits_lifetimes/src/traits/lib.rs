use std::fmt::{Debug, Display};

pub trait Summary {
    fn summarize(&self) -> String;

    fn summarize_author(&self) -> String;
    fn summ(&self) -> String {
        format!("(Read more from {}...)", self.summarize_author())
    }
}

// pub fn notify(item: impl Summary) {
//     println!("Breaking news! {}", item.summarize())
// }

// pub fn notify<T: Summary + Display>(item: T) {
//     println!("Breaking news! {}", item.summarize())
// }

pub fn notify<T, U>(a: T, _: U) -> String
where
    T: Summary + Display,
    U: Clone + Debug,
{
    format!("Breaking news! {}", a.summarize())
}

struct Pair<T> {
    x: T,
    y: T,
}

impl<T> Pair<T> {
    fn new(x: T, y: T) -> Self {
        Self { x, y }
    }
}

impl<T: Display + PartialOrd> Pair<T> {
    fn cmp_display(&self) {
        if self.x >= self.y {
            println!("The largest member is x = {}", self.x);
        } else {
            println!("The largest member is y = {}", self.y);
        }
    }
}
