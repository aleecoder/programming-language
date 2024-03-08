use std::sync::{Arc, Mutex};
use std::thread;

struct Point {
    x: i32,
    y: i32,
}

fn f() {
    let p = Arc::new(Mutex::new(Point { x: 0, y: 0 }));
    let mut handles = Vec::new();
    for i in 0..10 {
        let cp = Arc::clone(&p);
        let h = thread::spawn(move || {
            let mut guard = cp.lock().unwrap();
            match i % 2 {
                0 => guard.x += 1,
                _ => guard.y += 1,
            }
            println!("thread {} :: {} {}", i, guard.x, guard.y);
        });
        handles.push(h)
    }
    for handle in handles {
        handle.join().unwrap()
    }
    let final_lock = p.lock().unwrap();
    println!("threads done :: {} {}", final_lock.x, final_lock.y);
}

fn main() {
    f()
}
