package com.msb.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress 封装IP
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress 不能直接new对象，因为构造方法是被default修饰的
        final InetAddress ia = InetAddress.getByName("192.168.0.110");
        System.out.println("ia = " + ia);

        final InetAddress ia2 = InetAddress.getByName("www.baidu.com");
        // 获取域名
        final String hostName = ia2.getHostName();
        // 获取IP地址
        final String hostAddress = ia2.getHostAddress();
        System.out.println("hostName = " + hostName);
        System.out.println("hostAddress = " + hostAddress);
    }
}
