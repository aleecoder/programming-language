package com.aleecoder.file;

import java.io.File;
import java.io.IOException;

/**
 * File对文件的操作
 * @author HuanyuLee
 * @date 2022/3/23
 */
public class Test {

    public static void main(String[] args) throws IOException {
        /*
         * 将文件封装成一个File类对象
         *  pathname参数：
         *      形式 1："d:\\test.txt"
         *      形式 2："d:/test.txt"
         *      形式 3："d:" File.separator + "test.txt"       推荐，实现跨平台
         */
        final File file = new File("." + File.separator + "data" + File.separator +"test.txt");

        /*
         * 常用方法
         *
         */
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.length());

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file);


        // ================================================================
        final File file2 = new File("." + File.separator + "data" + File.separator +"hello");
        if (!file2.exists()){
            file2.mkdirs();
        }
        // 获取文件夹下目录/文件对应的名字的数组
        final String[] list = file2.list();
        for (String s : list){
            System.out.println(s);
        }

        final File[] files = file2.listFiles();
        for (File f : files){
            System.out.println(f.getName() + " >>> " + f.getPath());
        }
    }
}
