package com.msb.util;

import java.io.*;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP连接关闭工具
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class ConnectionClose {

    public static void close(ServerSocket serverSocket){
        if (serverSocket != null){
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Socket socket){
        if (socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(DatagramSocket socket){
        if (socket != null) {
            socket.close();
        }
    }
    public static void close(DataInputStream dataInputStream){
        if (dataInputStream != null){
            try {
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ObjectInputStream objectInputStream){
        if (objectInputStream != null){
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(DataOutputStream dataOutputStream){
        if (dataOutputStream != null){
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ObjectOutputStream objectOutputStream){
        if (objectOutputStream != null){
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(InputStream inputStream){
        if (inputStream != null){
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(OutputStream outputStream){
        if (outputStream != null){
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
