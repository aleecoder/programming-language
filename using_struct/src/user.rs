#[derive(Debug)]
struct User {
    username: String,
    email: String,
    sign_in_count: u64,
    active: bool,
}

fn build_user(email: String, username: String) -> User {
    User {
        email,
        username,
        active: false,
        sign_in_count: 0,
    }
}

#[test]
fn struct_test() {
    let mut hoare = build_user(String::from("hoare@gamil.com"), String::from("tom"));
    hoare.username = String::from("Graydon Hoare");
    hoare.sign_in_count = 500;
    hoare.active = true;

    let pike = User {
        username: String::from("Rob Pike"),
        email: String::from("pike@gamil.com"),
        ..hoare
    };
    println!("{:#?}", pike);
}
