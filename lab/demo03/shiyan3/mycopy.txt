package Java.lab.demo03;
import java.io.*;
//字节输入输出流
public class MyIoExc {
    public static void main(String[] args) {
        String filein_pathname = "F:\\IJ-project\\cust\\src\\Java\\lab\\demo03\\MyIoExc.java";
        File filein = new File(filein_pathname);
        String fileout_pathname = "F:\\IJ-project\\cust\\src\\Java\\lab\\demo03\\shiyan3\\mycopy.txt";
        File fileout = new File(fileout_pathname);
        FileInputStream fis;
        try {
            if (!filein.exists())
                filein.createNewFile();
            if (!fileout.exists())
                fileout.createNewFile();
            fis = new FileInputStream(filein);
            FileOutputStream fos = new FileOutputStream(fileout);
            InputStreamReader in = new InputStreamReader(fis);
            OutputStreamWriter out = new OutputStreamWriter(fos);
            int is;
            while ((is = in.read()) != -1)
                out.write(is);
            System.out.println("Copy success！");
            in.close();
            out.close();
        }catch (IOException e){
            System.out.println("Copy fail！:");
            e.printStackTrace();
        }
        try {
            //读取mycopy.txt文件，并在命令行窗口中显示文件的全部内容
            byte[] bytes = new byte[512];
            File f = new File(fileout.getAbsolutePath());
            FileInputStream fis2 = new FileInputStream(f);
            //fis = new FileInputStream(fileout);
            int rs = 0;
            System.out.println("\nThe content of the mycopy.txt is :");
            while ((rs =fis2.read(bytes,0,512))>0){
                //在循环中读取输入流的数据
                String s = new String(bytes,0,rs);
                System.out.println(s);
            }
            fis2.close();
        }catch (IOException e){
            System.out.println("Read fail!：");
            e.printStackTrace();
        }
    }
}