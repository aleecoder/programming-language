package com.bilibili.transfer_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/3  21:57
 * @Description:
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) {
        try (final ServerSocket server = new ServerSocket(8081)){
            System.out.println("正在等待客户端连接...");
            final Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
            final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.print("接收到客户端数据：");
            System.out.println(reader.readLine());
            final OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("200");
            writer.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
