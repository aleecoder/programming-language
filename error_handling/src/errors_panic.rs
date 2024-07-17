use std::{fs::File, io::ErrorKind};

#[test]
fn result_ok_err() {
    let f = File::open("hello.txt");
    let _ = match f {
        Ok(file) => file,
        Err(error) => panic!("Error opening the file: {:?}", error),
    };
}

#[test]
fn result_unwrap() {
    let _ = File::open("hello.txt").unwrap();
}

#[test]
fn result_expect() {
    let _ = File::open("hello.rs").expect("Error opening the file");
}

#[test]
fn result_err_match() {
    let f = File::open("hello.txt");
    let _ = match f {
        Ok(file) => file,
        Err(error) => match error.kind() {
            ErrorKind::NotFound => match File::create("hello.txt") {
                Ok(fc) => fc,
                Err(e) => panic!("Error creating the file: {:?}", e),
            },
            _ => panic!("Error opening the file: {:?}", error),
        },
    };
}

#[test]
fn result_err_closure_match_arm() {
    let _ = File::open("hello.txt").unwrap_or_else(|error| {
        if error.kind() == ErrorKind::NotFound {
            File::create("hello.txt").unwrap_or_else(|error| {
                panic!("Error creating the file: {:?}", error);
            })
        } else {
            panic!("Error opening the file: {:?}", error);
        }
    });
}
