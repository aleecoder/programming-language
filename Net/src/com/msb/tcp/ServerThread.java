package com.msb.tcp;

import com.msb.util.ConnectionClose;

import java.io.*;
import java.net.Socket;

/**
 * 专门处理客户端请求的线程
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class ServerThread extends Thread{
    Socket socket;
    InputStream inputStream = null;
    DataInputStream dataInputStream = null;
    OutputStream outputStream = null;
    DataOutputStream dataOutputStream = null;
    ObjectInputStream objectInputStream = null;

    public ServerThread(Socket socket){
        this.socket = socket;

    }
    @Override
    public void run() {

        try {
            // 服务端接受数据
            inputStream = socket.getInputStream();
            // 服务端接收对象
            objectInputStream = new ObjectInputStream(inputStream);
            User user = (User)(objectInputStream.readObject());
            System.out.println("客户端发送的数据: " + user.toString());
            boolean flag = "admin".equals(user.getUsername()) && "123123".equals(user.getPassword());
            // 服务端响应数据
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("200");
            dataOutputStream.writeBoolean(flag);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionClose.close(dataOutputStream);
            ConnectionClose.close(outputStream);
            ConnectionClose.close(objectInputStream);
            ConnectionClose.close(dataInputStream);
            ConnectionClose.close(inputStream);
        }
    }
}
