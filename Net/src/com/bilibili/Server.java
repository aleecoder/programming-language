package com.bilibili;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/3  20:51
 * @Description: 服务端
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) {
        try (final ServerSocket server = new ServerSocket(8080)){   // 将服务端创建在端口 8080上
            System.out.println("正在等待客户端连接...");
            while (true){
                final Socket socket = server.accept();      // 当没有客户端连接时，线程会阻塞，直到有客户端连接为止
                System.out.println("客户端已连接，IP地址为: " + socket.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
