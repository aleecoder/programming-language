package com.msb.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 服务类，实现Send和Receive接口
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class Server implements Send,Receive{
    @Override
    public void sendMsg(DatagramSocket socket,People receiver, String message){
        // 创建套接字： 指定发送方的端口号
        try {
            // 准备数据包
            byte[] bytes = message.getBytes();
            /*
             * DatagramPacket() 构造器需要传入4个参数：
             * @param   buf      the packet data.
             * @param   length   the packet length.
             * @param   address  the destination address.
             * @param   port     the destination port number.
             */
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName(receiver.getHost()), receiver.getPort());
            socket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String receiveMsg(DatagramSocket socket,People sender){
        // 创建套接字：指定接收方的端口
        try {
            // 创建空的数据包，用来接收发送方的数据包
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            // 接收发送方的数据包，然后放入datagramPacket数据包中填充
            socket.receive(datagramPacket);
            // 取出数据
            byte[] data = datagramPacket.getData();
            String s = new String(data, 0, datagramPacket.getLength());
            System.out.println(sender.getName() + ": " + s);
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
