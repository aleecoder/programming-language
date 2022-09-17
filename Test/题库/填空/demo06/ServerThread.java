package Java.Test.题库.填空.demo06;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    Socket socket = null;
    int clientnum;
    public ServerThread(Socket socket,int clientnum){
        this.socket = socket;
        this.clientnum = clientnum;
    }

    @Override
    public void run() {
        try {
            String line;
            InputStream in = socket.getInputStream();   //得到socket的输入流
            BufferedReader is = new BufferedReader(new InputStreamReader(in));
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            //由系统标准输入设备构造BufferedReader对象
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Client-"+clientnum+":"+is.readLine());
            line = sin.readLine();
            while (! line.equals("bye")){
                os.println(line);
                // 刷新输出流，使Client马上收到该字符串
                os.flush();
                System.out.println("Server:"+line);
                System.out.println("Client-"+clientnum+":"+is.readLine());
                line = sin.readLine();
            }
            os.close();
            is.close();
            socket.close();
        }catch (IOException e){
            System.out.println("Error:"+e.toString() );
        }
    }
}
