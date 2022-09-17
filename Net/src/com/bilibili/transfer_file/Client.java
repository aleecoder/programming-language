package com.bilibili.transfer_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/4  10:47
 * @Description: 客户端发送文件
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        try (final Socket socket = new Socket("192.168.0.108", 8089)){
            final FileInputStream inputStream = new FileInputStream("av.flv");
            final OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int i;
            while ((i = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,i);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("服务器连接失败！");
            e.printStackTrace();
        }
    }
}
