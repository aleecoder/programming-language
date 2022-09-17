package Java.Test.题库.填空.demo02;

import java.io.File;
/*
该程序的作用是扫描C盘下所有的文件，并将文件的路径打印
 */
public class Test {
    public static void main(String[] args) {
        scanFiles("C:");
    }

    private static void scanFiles(String path) {
        if (path == null)
            return;
        File f = new File(path);        //创建path的File对象，对象引用名为f
        if (!f.exists())
            return;
        if (f.isFile())     //判断f的对象是否为文件
            System.out.println(f.getAbsolutePath());
        else {
            File dir[] = f.listFiles();
            for (int i = 0; i < dir.length; i++) {
                scanFiles(dir[i].getAbsolutePath());    //递归调用scanFiles方法
            }
        }
    }
}
