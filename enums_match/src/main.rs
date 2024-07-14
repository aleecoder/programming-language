use crate::ip_enum::ip_kind;
use crate::msg_enum::debug_msg;
use crate::option_enum::option_enum;

mod if_let;
pub mod ip_enum;
pub mod msg_enum;
pub mod option_enum;
mod pattern_match;

fn main() {
    ip_kind();
    debug_msg();
    option_enum();
}
