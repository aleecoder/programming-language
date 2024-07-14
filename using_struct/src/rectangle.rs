#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn area(&self) -> u32 {
        self.width * self.height
    }

    fn can_hold(&self, other: &Rectangle) -> bool {
        self.width >= other.width && self.height >= other.height
    }

    fn square(size: u32) -> Rectangle {
        Rectangle {
            width: size,
            height: size,
        }
    }

    fn new(width: u32, height: u32) -> Rectangle {
        Rectangle { width, height }
    }
}

#[test]
fn rectangle_area() {
    let rect = Rectangle::new(30, 50);
    println!(
        "The area of the rectangle is {} square pixels.",
        rect.area()
    );
    println!("{:?}", rect);

    let rect_2 = Rectangle::square(20);
    let rect_3 = Rectangle { width: 40, ..rect };
    assert!(rect.can_hold(&rect_2));
    assert!(!rect.can_hold(&rect_3));
}
