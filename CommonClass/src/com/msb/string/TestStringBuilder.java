package com.msb.string;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/6  22:47
 * @Description: StringBuilder
 * @version: 1.0
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello java");
        sb.delete(3,6); // 删除位置在[3,6)上的字符
        sb.deleteCharAt(2); // 删除位置在2上的字符
        sb.insert(2,"llo-");
        sb.replace(5,6," ");   // //在下标[5,6)位置上插入字符串
        System.out.println("sb = " + sb);   // sb = hello java
        sb.replace(5,5," my");
        System.out.println("sb = " + sb);   // sb = hello my java
        sb.setCharAt(7,'!');
        System.out.println("sb = " + sb);

        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i) + " ");
        }   // h e l l o   m !   j a v a
        System.out.println();

        String substring = sb.substring(0, 5);  //截取[0,5)返回的是一个新的String，对StringBuilder没有影响
        System.out.println("substring = " + substring); // substring = hello
    }
}
