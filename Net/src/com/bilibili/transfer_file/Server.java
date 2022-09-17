package com.bilibili.transfer_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/4  10:47
 * @Description: 服务端接受文件
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) {
        try (final ServerSocket server = new ServerSocket(8080)){
            final Socket socket = server.accept();
            final InputStream inputStream = socket.getInputStream();
            final FileOutputStream fileOutputStream = new FileOutputStream("save.txt");
            byte[] bytes = new byte[1024];
            int i;
            while ((i = inputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
