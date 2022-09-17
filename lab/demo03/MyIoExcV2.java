package Java.lab.demo03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//字符输入输出流
public class MyIoExcV2 {
    public static void main(String[] args) {
        String filein_pathname = "F:\\IJ-project\\cust\\src\\Java\\lab\\demo03\\MyIoExcV2.java";
        File filein = new File(filein_pathname);
        String fileout_pathname = "F:\\IJ-project\\cust\\src\\Java\\lab\\demo03\\shiyan3\\mycopy2.txt";
        File fileout = new File(fileout_pathname);
        try {
            FileReader fr = new FileReader(filein);
            if (!fileout.exists())
                fileout.createNewFile();
            FileWriter fw = new FileWriter(fileout);
            int is;
            while ((is=fr.read())!=-1){
                fw.write(is);
            }
            System.out.println("拷贝成功！");
            fr.close();
            fw.close();
            //读取mycopy2.txt文件，并在命令行窗口中显示文件的全部内容
            FileReader fr2 = new FileReader(fileout);
            char[] data = new char[512];
            int rs;
            System.out.println("\nmycopy2.txt的内容是：");
            while ((rs=fr2.read(data))>0){
                String str = new String(data,0,rs);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}