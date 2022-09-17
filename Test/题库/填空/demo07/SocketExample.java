package Java.Test.题库.填空.demo07;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketExample {
    public static void main(String[] args) {
        ServerSocket server;
        Socket socket;
        ObjectOutputStream output;
        ObjectInputStream input;
        try {
            server = new ServerSocket(6000,50);
            socket = server.accept();
            output = new ObjectOutputStream(socket.getOutputStream());
            output.flush();
            input = new ObjectInputStream(socket.getInputStream());
            output.close();
            input.close();
            socket.close();
        }catch (IOException e){
            System.out.println("error");
        }
    }
}
