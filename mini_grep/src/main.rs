use log::error;
use mini_grep::{run, Config};
use std::{env, process};

fn main() {
    env_logger::init();
    let args: Vec<String> = env::args().collect();
    let config = Config::new(&args).unwrap_or_else(|err| {
        // eprintln!("problem parsing arguments: {}", err);
        error!("problem parsing arguments: {}", err);
        process::exit(1);
    });

    if let Err(e) = run(config) {
        error!("application error: {}", e);
        process::exit(1);
    }
}
