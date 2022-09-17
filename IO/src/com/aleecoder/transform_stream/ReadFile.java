package com.aleecoder.transform_stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 文件 -> 字节流 -> InputStreamReader -> 字符流 -> 程序
 * @author HuanyuLee
 * @date 2022/3/24
 */
public class ReadFile {
    public static void main(String[] args) {
        final File file = new File("." + File.separator + "data" + File.separator +"test.txt");
        final File copyFile = new File("." + File.separator + "data" + File.separator +"copy3.txt");
        FileInputStream fis;
        FileOutputStream fos;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(copyFile);
            // 加入一个转换流，将字节流转换为字符流
            isr = new InputStreamReader(fis,"utf-8");
            osw = new OutputStreamWriter(fos,"gbk");
            // 缓冲数组
            char[] chars = new char[1024];
            int len;
            while ((len = isr.read(chars)) != -1){
                osw.write(chars,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 转换流属于处理流
            if (osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
