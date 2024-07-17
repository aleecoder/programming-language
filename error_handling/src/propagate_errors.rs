use std::{fs::File, io, io::Read};

// pub fn read_username_from_file() -> Result<String, io::Error> {
//     let f = File::open("hello.txt");
//     let mut f = match f {
//         Ok(file) => file,
//         Err(e) => return Err(e),
//     };
//
//     let mut s = String::new();
//     match f.read_to_string(&mut s) {
//         Ok(_) => Ok(s),
//         Err(e) => Err(e),
//     }
// }

// 传播错误
// pub fn read_username_from_file() -> Result<String, io::Error> {
//     let mut f = File::open("hello.txt")?;
//     let mut s = String::new();
//     f.read_to_string(&mut s)?;
//     Ok(s)
// }

// 链式调用
pub fn read_username_from_file() -> Result<String, io::Error> {
    let mut s = String::new();
    File::open("D:/space/programming-language/learn-rust/error_handling/hello.txt")?
        .read_to_string(&mut s)?;
    Ok(s)
}
