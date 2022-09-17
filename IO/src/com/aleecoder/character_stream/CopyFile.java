package com.aleecoder.character_stream;

import java.io.*;

/**
 * 案例：文件的复制     字符流
 * 文本文件：建议使用字符流
 * 非文本文件：使用字节流
 * @author HuanyuLee
 * @date 2022/3/24
 */
public class CopyFile {
    public static void main(String[] args) {
        final File file = new File("." + File.separator + "data" + File.separator +"test.txt");
        final File copyFile = new File("." + File.separator + "data" + File.separator +"copy.txt");
        FileReader reader = null;
        FileWriter writer = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            reader = new FileReader(file);
            writer = new FileWriter(copyFile,true);
            br = new BufferedReader(reader);
            bw = new BufferedWriter(writer);
            // 读取方式 1 每次读一个字符、写一个字符
            int n;
            /*while ((n = reader.read()) != -1){
                writer.write((char) n);
            }*/
            // 读取方式 2 利用缓冲数组，每次读多个字符、转成字符串，每次写字符串
            char[] ch = new char[5];
            int len;
            /*while ((len = reader.read(ch)) != -1){
                String str = new String(ch,0,len);
                writer.write(str);
            }*/
            // 读取方式 3 使用缓冲区
            /*while ((len = br.read(ch)) != -1){
                bw.write(ch,0,len);
            }*/
            // 字符流特有的，每次读一行、写一行
            String str;
            while ((str = br.readLine()) != null){
                bw.write(str);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 防止空指针异常
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
