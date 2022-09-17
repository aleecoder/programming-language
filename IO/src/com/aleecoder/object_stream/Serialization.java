package com.aleecoder.object_stream;

import java.io.*;

/**
 * 序列化和反序列化
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class Serialization {
    public static void main(String[] args) {
        final Person p = new Person("LiLi", 18);
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        String pathname = "." + File.separator + "data" + File.separator +"save3.txt";
        try {
            oos = new ObjectOutputStream(new FileOutputStream(pathname));
            oos.writeObject(p);

            ois = new ObjectInputStream(new FileInputStream(pathname));
            final Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
