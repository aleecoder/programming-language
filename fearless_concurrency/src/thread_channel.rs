use std::sync::{mpsc, Arc, Mutex};
use std::thread;
use std::time::Duration;

pub fn it_work_spsc() {
    let (tx, rx) = mpsc::channel();

    thread::spawn(move || {
        let v = String::from("Hello");
        tx.send(v).unwrap();
    });

    let received = rx.recv().unwrap();
    println!("Got: {}", received)
}

pub fn thread_channel() {
    let (tx, rx) = mpsc::channel();

    thread::spawn(move || {
        let vs = vec![
            String::from("Hello"),
            String::from("from"),
            String::from("the"),
            String::from("thread"),
        ];
        for v in vs {
            tx.send(v).unwrap();
            thread::sleep(Duration::from_secs(2));
        }
    });

    for received in rx {
        println!("Got: {}", received)
    }
}

pub fn thread_mutex() {
    let counter = Arc::new(Mutex::new(0));
    let mut handles = vec![];

    for _ in 0..10 {
        let counter = Arc::clone(&counter);
        let handle = thread::spawn(move || {
            let mut num = counter.lock().unwrap();
            *num += 1;
        });
        handles.push(handle);
    }

    for handle in handles {
        handle.join().unwrap();
    }

    println!("Result: {}", *counter.lock().unwrap())
}

#[cfg(test)]
mod tests {
    use crate::thread_channel::it_work_spsc;
    use crate::thread_channel::thread_channel;
    use crate::thread_channel::thread_mutex;
    use std::sync::Mutex;

    #[test]
    fn it_work() {
        it_work_spsc()
    }

    #[test]
    fn it_work_mpsc() {
        thread_channel()
    }

    #[test]
    fn it_work_mutex() {
        let m = Mutex::new(5);
        {
            let mut num = m.lock().unwrap();
            *num = 6;
        }
        println!("m = {:?}", m)
    }

    #[test]
    fn it_work_thread_mutex() {
        thread_mutex()
    }
}
