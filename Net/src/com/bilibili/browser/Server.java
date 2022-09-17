package com.bilibili.browser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/4  11:42
 * @Description: 浏览器访问Socket服务器
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) {
        try (final ServerSocket serverSocket = new ServerSocket(8088)){
            System.out.println("正在等待客户端连接...");
            final Socket socket = serverSocket.accept();
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
            /*final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("接收到客户端数据：");
            while (reader.ready()){
                System.out.println(reader.readLine());
            }*/
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("HTTP/1.1 200 Accepted\r\n");
//            writer.write("Content-Type:text/html");
            writer.write("\r\n");
            writer.write("hello!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class A{
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)){    //将服务端创建在端口8080上
            System.out.println("正在等待客户端连接...");
            Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
            InputStream in = socket.getInputStream();  //通过
            System.out.println("接收到客户端数据：");
            while (true){
                int i = in.read();
                if(i == -1) break;
                System.out.print((char) i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}