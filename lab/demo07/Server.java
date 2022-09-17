package Java.lab.demo07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket you = null;
        while (true){
            try{
                serverSocket = new ServerSocket(2020);
            }catch(IOException e1){
                System.out.println("正在监听");     //ServerSocket对象不能重复创建
            }
            try{
                System.out.println("等待客户呼叫");
                you = serverSocket.accept();
                System.out.println("客户的地址："+you.getInetAddress());
            }catch(IOException e2){
                System.out.println("正在等待客户");
            }
            if (you!=null){
                new ServerThread(you).start();      //为每个客户启动一个专门的线程
            }
        }
    }
}
