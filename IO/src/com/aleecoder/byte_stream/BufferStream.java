package com.aleecoder.byte_stream;

import java.io.*;

/**
 * 缓冲流 效率最高
 * @author HuanyuLee
 * @date 2022/3/24
 */
public class BufferStream {
    public static void main(String[] args) {
        final File file = new File("." + File.separator + "data" + File.separator +"image.jpg");
        final File copyfile = new File("." + File.separator + "data" + File.separator +"copy2.jpg");
        FileInputStream fis;
        FileOutputStream fos;
        // 处理流
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(copyfile);
            // 相当于在fis"管道"外面又嵌套一个功能更强的bos"管道"
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[1024*2];
            int len;
            // 缓冲区大小默认为 8192，底层自动刷新
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 处理流包裹着节点流，只要关闭高级流（处理流）即可，里面的字节流会随之关闭
            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
