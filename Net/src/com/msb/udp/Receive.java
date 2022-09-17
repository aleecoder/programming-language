package com.msb.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 接收方
 * @author HuanyuLee
 * @date 2022/3/14
 */
public interface Receive {
    /**
     * 接收数据
     * @param socket 接收方的套接字
     * @param sender 发送方的对象
     * @return java.lang.String
     */
    String receiveMsg(DatagramSocket socket,People sender);
}
