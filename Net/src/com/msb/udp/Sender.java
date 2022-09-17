package com.msb.udp;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * 发送方：student
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class Sender extends People{
    public Sender(String name, String host, int port) {
        super(name, host, port);
    }

    public static void main(String[] args) {
        Sender student = new Sender("学生","127.0.0.1",801);
        Receiver teacher = new Receiver("老师","127.0.0.1",802);
        System.out.println(student.getName() + "上线了......");
        Scanner sc = new Scanner(System.in);
        try (DatagramSocket socket = new DatagramSocket(student.getPort())) {
            while (true){
                // 学生发送数据
                System.out.print(student.getName() + ": ");
                String message = sc.next();
                student.sendMsg(socket, teacher, message);
                if ("bye".equals(message)){
                    System.out.println("byebye~");
                    break;
                }
                // 学生接收数据
                student.receiveMsg(socket, teacher);
            }

        } catch (SocketException e) {
            e.printStackTrace();
        }finally {
            sc.close();
        }
    }
}
