package com.aleecoder.systemio;

import java.io.*;

/**
 * 从键盘录入数据，保存到文件中
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class SaveFile {
    public static void main(String[] args) {
        // System.in属于字节流
        final InputStream in = System.in;
        // 字节流 -> 字符流
        final InputStreamReader isr = new InputStreamReader(in);
        // 字符流 -> 缓冲流
        final BufferedReader br = new BufferedReader(isr);

        BufferedWriter bw = null;

        try {
            final FileWriter fw = new FileWriter("." + File.separator + "data" + File.separator +"save.txt");
            bw = new BufferedWriter(fw);

            String line;
            while (!"exit".equals(line = br.readLine())){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
