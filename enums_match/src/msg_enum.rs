enum Message {
    Quit,
    Move { x: i32, y: i32 },
    Write(String),
    ChangeColor(i32, i32, i32),
}

impl Message {
    fn call(&self) {
        match self {
            Message::Quit => println!("quit variant called"),
            _ => self.call(),
        }
    }
}

pub fn debug_msg() {
    let q = Message::Quit;
    let _m = Message::Move { x: 12, y: 24 };
    let _w = Message::Write(String::from("Hello World!"));
    let _c = Message::ChangeColor(0, 255, 255);
    q.call()
}
