package com.msb.tcp;

import com.msb.util.ConnectionClose;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class Client {

    private static User login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("username: ");
        String username = sc.next();
        System.out.print("password: ");
        String password = sc.next();
        return new User(username,password);
    }

    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            System.out.println("请求连接服务端连接......");
            socket = new Socket("127.0.0.1", 8080);
            User user = login();
            // 客户端发送数据
            outputStream = socket.getOutputStream();
            // 客户端发送对象
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);

            // 客户端得到服务端响应
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            final String s = dataInputStream.readUTF();
            System.out.println("收到服务端响应: " + s);
            // 客户端解析服务器的对象响应
            final boolean b = dataInputStream.readBoolean();
            System.out.println( b ?  "登录成功!" : "登录失败!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ConnectionClose.close(dataInputStream);
            ConnectionClose.close(inputStream);
            ConnectionClose.close(objectOutputStream);
            ConnectionClose.close(outputStream);
            ConnectionClose.close(socket);
        }
    }
}
