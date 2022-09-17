package Java.lab.demo07;

import java.io.*;

public class Read implements Runnable {
    DataInputStream in;

    public void setDataInputStream(DataInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        double result = 0;
        while (true){
            try{
                result = in.readDouble();
                System.out.println("立方体的体积:"+result);
                System.out.print("【显示多次】输入长、宽、高(退出请输入非数字):");
            }catch(IOException e){
                System.out.println("与服务器已断开"+e);
                break;
            }
        }
    }
}
