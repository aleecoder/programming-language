use std::fmt::Display;

#[test]
fn dangling_references() {
    // {
    //     let r;
    //     {
    //         let x = 5;
    //         r = &x; // borrowed value does not live long enough
    //     }
    //     println!("r: {}", r);
    // }
}

#[test]
fn generic_lifetimes() {
    let s1 = String::from("golang");
    {
        let s2 = "xyz";

        let res = longest(s1.as_str(), s2);
    }
    // println!("the longest string is {}", res)
}

fn longest<'a>(x: &'a str, y: &'a str) -> &'a str {
    std::cmp::max_by(x, y, |a, b| a.len().cmp(&b.len()))
}

struct ImportantExcerpt<'a> {
    part: &'a str,
}

impl<'a> ImportantExcerpt<'a> {
    fn level(&self) -> i32 {
        3
    }

    fn announce_and_return_part(&self, announcement: &str) -> &str {
        println!("Attention please: {}", announcement);
        self.part
    }
}

fn function() {
    let novel = String::from("Call me Ishmael. Some years ago...");
    let first_sentence = novel.split('.').next().expect("Could not find a '.'");
    let i = ImportantExcerpt {
        part: first_sentence,
    };
    println!("{}", i.part);
}

fn longest_with_announcement<'a, T>(x: &'a str, y: &'a str, ann: T) -> &'a str
where
    T: Display,
{
    println!("Announcement! {}", ann);
    std::cmp::max_by(x, y, |a, b| a.len().cmp(&b.len()))
}
