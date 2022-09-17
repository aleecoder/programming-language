package com.aleecoder;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class Test01 {
    public static int aMethod(int i) throws Exception{
        try {
            return i/10;
        } catch (Exception ex) {
            throw new Exception("exception in a aMethod");
        } finally {
            System.out.printf("finally");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception e) {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
