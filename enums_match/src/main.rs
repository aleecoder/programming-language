mod if_let;
mod ip_enum;
mod msg_enum;
mod option_enum;

fn main() {
    ip_enum::ip_kind();
    msg_enum::debug_msg();
    option_enum::option_enum();
}
