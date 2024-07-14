use core::fmt;

pub struct People<'a> {
    pub username: &'a str,
    pub email: &'a str,
    pub sign_in_count: u64,
    pub active: bool,
}

impl fmt::Debug for People<'_> {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        f.debug_struct("People")
            .field("username", &self.username)
            .field("email", &self.email)
            .field("sign_in_count", &self.sign_in_count)
            .field("active", &self.active)
            .finish()
    }
}

pub fn struct_ownership() {
    let stu = People {
        username: "James Gosling",
        email: "gosling@gamil.com",
        sign_in_count: 900,
        active: true,
    };
    println!("{:#?}", stu);
}
