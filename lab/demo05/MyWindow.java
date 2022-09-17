package Java.lab.demo05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow extends JDialog implements ActionListener{
    JLabel str;
    int i=0;
    MyWindow(){
        super();
        setTitle("点击计数");
        JButton click=new JButton("点击");
        JButton clear=new JButton("清空计数");
        str=new JLabel("点击次数为："+i);
        //将两个按钮加入到一个面板中
        JPanel view=new JPanel();
        view.add(click);
        view.add(clear);
        //布局按钮和标签位置
        add(view,BorderLayout.NORTH);
        add(str,BorderLayout.CENTER);
        //为按钮添加监听器
        click.addActionListener(this);
        clear.addActionListener(this);
        setBounds(550,220,250,150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String t=e.getActionCommand();
        if(t.equals("点击")) {//如果按钮名字为"点击"
            i++;
            str.setText("点击次数："+i);//修改标签名字
        }
        else {
            i=0;
            str.setText("点击次数："+i);
        }
    }
}
