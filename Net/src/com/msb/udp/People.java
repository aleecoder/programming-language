package com.msb.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 人的父类，继承Sever，具备通信的功能
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class People extends Server{
    private String name;
    private String host;
    private int port;
    private DatagramSocket socket;

    public People() {
    }

    public People(String name, String host, int port) {
        this.name = name;
        this.host = host;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public DatagramSocket getSocket() {
        return socket;
    }

    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }

    public void close(DatagramSocket socket){
        if (socket != null){
            this.socket.close();
        }
    }
}
