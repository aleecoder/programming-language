package Java.lab.demo07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Socket my_socket = null;
        DataInputStream in = null;
        DataOutputStream out = null;
        Thread readData;
        Read read = null;
        try{
            my_socket = new Socket();
            read = new Read();
            readData = new Thread(read);
            System.out.print("输入服务器的IP：");
            String IP = scanner.nextLine();
            System.out.print("输入端口号:");
            int port = scanner.nextInt();
            if (my_socket.isConnected()){

            }else {
                InetAddress address = InetAddress.getByName(IP);
                InetSocketAddress socketAddress = new InetSocketAddress(address,port);
                my_socket.connect(socketAddress);
                in = new DataInputStream(my_socket.getInputStream());
                out = new DataOutputStream(my_socket.getOutputStream());
                read.setDataInputStream(in);
                readData.start();
            }

        }catch(Exception e){
            System.out.println("服务器已经断开！"+e);
        }
        System.out.print("输入长、宽、高(退出请输入非数字)：");
        while(scanner.hasNext()) {
            double a=0,b=0,c=0 ;
            try {
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
            }
            catch(InputMismatchException exp){
                System.exit(0);
            }
            try {
                out.writeDouble(a);
                out.writeDouble(b);
                out.writeDouble(c);

            }
            catch(Exception e) {}


        }
    }
}
