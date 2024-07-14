use std::net::{Ipv4Addr, Ipv6Addr};

enum IpAddrKind {
    V4(Ipv4Addr),
    V6(Ipv6Addr),
}

fn route(ip: IpAddrKind) {
    match ip {
        IpAddrKind::V4(addr) => println!("Routing IPv4 address: {}", addr),
        IpAddrKind::V6(addr) => println!("Routing IPv6 address: {}", addr),
    }
}

pub fn ip_kind() {
    route(IpAddrKind::V4(Ipv4Addr::new(127, 0, 0, 1)));
    route(IpAddrKind::V6(Ipv6Addr::LOCALHOST));
}
