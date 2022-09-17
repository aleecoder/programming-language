package com.bilibili.transfer_data;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/3  21:58
 * @Description: 客户端发送数据给服务器，并收到服务器的返回
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        try (final Socket socket = new Socket("localhost",8081)){
            System.out.println("已连接到服务端！");
            final Scanner sc = new Scanner(System.in);
            final OutputStream stream = socket.getOutputStream();
            final OutputStreamWriter writer = new OutputStreamWriter(stream);
            System.out.println("请输入要发送给服务端的内容：");
            final String text = sc.nextLine();
            writer.write(text + '\n');     //因为服务器端是readLine()这里加个换行符
            writer.flush();
            System.out.println("数据已发送："+text);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("收到服务器返回："+reader.readLine());
        } catch (IOException e) {
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }finally {
            System.out.println("客户端断开连接！");
        }
    }
}
