package Java.lab.demo07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
    Socket socket ;
    DataOutputStream out = null;
    DataInputStream in = null;
    String s = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
        try{
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
        }catch(IOException e){}
    }
    public void run(){
        while(true) {
            try{
                //堵塞状态，除非读取到信息
                double a= in.readDouble();
                double b= in.readDouble();
                double c= in.readDouble();
                double area = a*b*c;
                out.writeDouble(area);
            }
            catch (IOException e) {
                System.out.println("客户离开");
                return;
            }
        }
    }
}
