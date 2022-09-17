package com.msb.inet;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * InetSocketAddress 封装port
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class InetSocketAddressTest {
    public static void main(String[] args) {
        final InetSocketAddress isa = new InetSocketAddress("192.168.0.110", 8080);
        System.out.println("isa = " + isa);

        final String hostName = isa.getHostName();
        final int port = isa.getPort();
        System.out.println("hostName = " + hostName);
        System.out.println("port = " + port);

        final InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
