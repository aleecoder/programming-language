package com.aleecoder.byte_stream;

import java.io.*;

/**
 * 字节流读取文件、写文件
 * @author HuanyuLee
 * @date 2022/3/24
 */
public class ReadWriteFile {
    public static void main(String[] args) {
        final File file = new File("." + File.separator + "data" + File.separator +"image.jpg");
        final File copyfile = new File("." + File.separator + "data" + File.separator +"copy.jpg");
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        int count = 0;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(copyfile);
            int n;
            // 方式 1 一个字节一个字节的读取
            /*while (inputStream.read() != -1){
                count++;
            }
            System.out.println("count = " + count);*/

            // 方式 2 使用缓冲数组每次读取多个字节
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,len);
                count++;
            }
            System.out.println("count = " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
