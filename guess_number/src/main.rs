use rand::Rng;
use std::cmp::Ordering;
use std::io;

fn main() {
    println!("Start a guessing game with a range of [1,100].");
    let secret_number = rand::thread_rng().gen_range(1..101);
    loop {
        eprint!("Please guess a number: ");
        let mut guess_number = String::new();
        io::stdin()
            .read_line(&mut guess_number)
            .expect("unable to read rows");
        let guess_number = match guess_number.trim().parse::<u32>() {
            Ok(num) => num,
            Err(_) => continue,
        };
        print!("You guess number is: {} => ", guess_number);

        match guess_number.cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }
    }
}
