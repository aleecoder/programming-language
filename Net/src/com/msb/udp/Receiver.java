package com.msb.udp;

import java.net.DatagramSocket;
import java.util.Scanner;

/**
 * 接收方：teacher
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class Receiver extends People{
    public Receiver(String name, String host, int port) {
        super(name, host, port);
    }

    public static void main(String[] args) {
        Sender student = new Sender("学生","127.0.0.1",801);
        Receiver teacher = new Receiver("老师","127.0.0.1",802);
        System.out.println(teacher.getName() + "上线了......");
        Scanner sc = new Scanner(System.in);
        try (DatagramSocket socket = new DatagramSocket(teacher.getPort())) {
            while (true){
                // 老师接收数据
                final String s = teacher.receiveMsg(socket, student);
                if ("bye".equals(s)){
                    System.out.println("byebye~");
                    break;
                }
                // 老师发送数据
                System.out.print(teacher.getName()+ ": ");
                String message = sc.next();
                teacher.sendMsg(socket, student,message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sc.close();
        }
    }
}
