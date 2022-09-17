package com.aleecoder.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/28  13:37
 * @Description: 异常
 * @version: 1.0
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input the first Integer: ");
            int a = sc.nextInt();
            System.out.print("Input the second Integer: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("The result of dividing two numbers: "+c);
        }catch (InputMismatchException | ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("The next code can be executed normally!");
    }
}