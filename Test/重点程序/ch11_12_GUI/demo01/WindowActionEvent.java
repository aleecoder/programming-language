package Java.Test.重点程序.ch11_12_GUI.demo01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowActionEvent extends JFrame {
    JTextField text;
    ActionListener listener;             //listener是监视器
    public WindowActionEvent() {
        setLayout(new FlowLayout());
        text = new JTextField(20);
        add(text);
        listener = new ReaderListen();       //创建责计算字符串长度的监视器
        text.addActionListener(listener);   //text是事件源,listener是监视器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        WindowActionEvent win=new WindowActionEvent();
        win.setTitle("处理ActionEvent事件");
        win.setBounds(100,100,310,260);
    }
}
