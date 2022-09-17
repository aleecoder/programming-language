package Java.Test.题库.demo01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
创建一个Frame，有两个Button按钮和一个TestField,
点击按钮，在TestField上显示Button信息
 */
public class TestButton extends JFrame implements ActionListener{

    JButton jb1,jb2;
    JTextField jt;
    public TestButton(){
        super("TestButton");
        jb1 = new JButton("JButton1");
        jb2 = new JButton("JButton2");
        jt = new JTextField(20);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        Container c = getContentPane();
        setLayout(new FlowLayout());
        add(jt);
        add(jb1);
        add(jb2);
        setBounds(200,200,500,375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * Invoked when an action occurs.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb1)
            jt.setText(jb1.getActionCommand());
        if (e.getSource()==jb2)
            jt.setText(jb2.getActionCommand());
    }

    public static void main(String[] args) {
        TestButton button = new TestButton();
        button.setVisible(true);
    }
}
