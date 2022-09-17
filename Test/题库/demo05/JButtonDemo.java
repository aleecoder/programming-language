package Java.Test.题库.demo05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo implements ActionListener {

    private JButton ok,cancel;
    private JTextField tf;
    private JButtonDemo(){
        JFrame f = new JFrame("测试按钮");
        f.setLayout(new FlowLayout());
        Container c = f.getContentPane();

        tf = new JTextField(20);
        ok = new JButton("OK");
        cancel = new JButton("Cancel");

        ok.addActionListener(this);
        cancel.addActionListener(this);
        c.add(tf);
        c.add(ok);
        c.add(cancel);
        f.setSize(400,150);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ok)
            tf.setText("您按了OK按钮！");
        else
            tf.setText("您按了Cancel按钮！");
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
