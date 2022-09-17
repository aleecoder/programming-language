package com.aleecoder.data_stream;

import java.io.*;

/**
 * DataOutputStream: 将内存中的基本数据类型和字符串的变量写入到文件中
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class Base {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        String pathname = "." + File.separator + "data" + File.separator +"save2.txt";
        try {
            dos = new DataOutputStream(new FileOutputStream(pathname));
            dos.writeUTF("你好~~~");
            dos.writeBoolean(false);
            dos.writeDouble(3.14);

            dis = new DataInputStream(new FileInputStream(pathname));
            // 顺序必须一致
            System.out.println(dis.readUTF());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readDouble());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dos != null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
