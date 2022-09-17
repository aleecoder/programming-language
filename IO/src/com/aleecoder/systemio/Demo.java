package com.aleecoder.systemio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 键盘的输入    字节流
        final InputStream in = System.in;
        final int read = in.read();
        System.out.println(read);
        // Scanner是扫描器
        final Scanner sc = new Scanner(new FileInputStream("." + File.separator + "data" + File.separator +"test.txt"));
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
