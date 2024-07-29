use crate::thread_channel::{it_work_spsc, thread_channel, thread_mutex};

mod thread_channel;
mod thread_example;

fn main() {
    it_work_spsc();
    thread_channel();
    thread_mutex();
}
