package Java.Test.题库.填空.demo08;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample implements Runnable {
    private Socket m_socket;
    private int m_id;
    public ServerExample(Socket m_socket,int m_id){
        this.m_socket = m_socket;
        this.m_id = m_id;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(10000);
            System.out.println("Socket["+m_id+"] is closing.");
            m_socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int n = 1;
        ServerSocket server = null;
        try {
            server = new ServerSocket(5000);
            System.out.println("Server start.");
        }catch (IOException e){
            e.printStackTrace();
        }
        while (true){
            try {
                System.out.println("Wait NO."+n+" connection.");
                Socket s = server.accept();
                ServerExample t = new ServerExample(s,n++);
                Thread th = new Thread(t);
                th.start();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
