use rand::Rng;
use std::cmp::Ordering;
use std::io;

struct Guess {
    value: i32,
}

impl Guess {
    fn new(value: i32) -> Guess {
        if value < 1 || value > 100 {
            panic!("Guess value must be between 1 and 100, got {}.", value);
        }
        Guess { value }
    }

    fn value(&self) -> i32 {
        self.value
    }
}

fn main() {
    println!("Start a guessing game with a range of [1,100].");
    let secret_number = rand::thread_rng().gen_range(1..101);
    loop {
        eprint!("Please guess a number: ");
        let mut guess_number = String::new();
        io::stdin()
            .read_line(&mut guess_number)
            .expect("unable to read rows");
        let guess_number = match guess_number.trim().parse::<i32>() {
            Ok(num) => num,
            Err(_) => continue,
        };
        let guess_number = Guess::new(guess_number);
        print!("You guess number is: {} => ", guess_number.value());

        match guess_number.value().cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }
    }
}
