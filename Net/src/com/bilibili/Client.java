package com.bilibili;

import java.io.IOException;
import java.net.Socket;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/3  20:54
 * @Description: 客户端
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        try (final Socket socket = new Socket("localhost", 8080)){
            System.out.println("已连接到服务器端！");
        } catch (IOException e) {
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
    }
}
