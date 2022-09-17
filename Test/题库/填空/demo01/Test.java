package Java.Test.题库.填空.demo01;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    private int screenOffset = 80;
    public Test(){
        super("Concentric");    //调用父类的构造方法，使得窗口的标题为Concentric
        setSize(300,300);       //设置JFrame的大小为300*300
        show();     //使窗口为可见
    }
    public void paint(Graphics g){
        for (int i = 1; i <= 8; i++) {
            int origin = screenOffset+80-i*10;
            g.drawOval(origin,origin,i*20,i*20);
        }
    }

    public static void main(String[] args) {
        Test application = new Test();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
