package com.msb.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


/**
 * 发送方
 * @author HuanyuLee
 * @date 2022/3/14
 */
public interface Send {
    /**
     * 发送数据
     * @param socket 发送方的套接字
     * @param receiver 接收方的对象
     * @param message 发送方发送的数据
     */
    void sendMsg(DatagramSocket socket,People receiver, String message);
}
