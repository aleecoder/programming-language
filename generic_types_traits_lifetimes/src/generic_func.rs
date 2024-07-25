#[derive(Debug)]
struct Point<T, U> {
    x: T,
    y: U,
}

impl<T, U> Point<T, U> {
    fn x(&self) -> &T {
        &self.x
    }

    fn y(&self) -> &U {
        &self.y
    }

    fn mix_up<K, V>(self, other: Point<K, V>) -> Point<T, V> {
        Point {
            x: self.x,
            y: other.y,
        }
    }
}

#[test]
fn generic_func_test() {
    let p1 = Point { x: 5, y: 10 };
    let p2 = Point { x: 5, y: 3.14 };
    let p3 = Point {
        x: true,
        y: "hello",
    };
    println!("{} {}", p1.x(), p1.y());
    println!("{} {}", p2.x(), p2.y());
    println!("{} {}", p3.x(), p3.y());
    println!("{:?}", p3.mix_up(p2));
}
