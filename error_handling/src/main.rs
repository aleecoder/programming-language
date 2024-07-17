use crate::propagate_errors::read_username_from_file;

mod errors_panic;
mod propagate_errors;

fn main() {
    let result = read_username_from_file();
    match result {
        Ok(username) => println!("Username: {}", username),
        Err(error) => panic!("Error reading username: {}", error),
    }
}

// 如果要在main函数里使用传播错误？
// fn main() -> Result<(), Box<dyn Error>> {
//     let _ = File::open("hello.txt")?;
//     Ok(())
// }
