package com.msb.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class Server {
    public static void main(String[] args) {
        Socket socket;
        int count = 0;
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("正在等待客户端连接......");
            while (true){
                socket = serverSocket.accept();
                System.out.println("当前是第" + ++count + "个用户访问，IP地址: " + socket.getInetAddress());
                new ServerThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
