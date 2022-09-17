package Java.lab.demo05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Test extends JFrame{
    MyWindow win=new MyWindow();
    public static void main(String[] args) {
        Test t=new Test();
        t.setBounds(400, 150,550,450);
        t.setVisible(true);

    }
    public Test() {
        setTitle("显示对话框");
        JMenuBar men=new JMenuBar();
        setJMenuBar(men);
        JMenu menu=new JMenu("菜单");
        men.add(menu);
        JMenuItem m1=new JMenuItem("打开对话框");
        menu.add(m1);
        JMenuItem m2=new JMenuItem("关闭对话框");
        menu.add(m2);//将菜单项添加到菜单栏中
        //为菜单项设置监听器两个菜单项同用一个监听器
        m1.addActionListener(new listen());
        m2.addActionListener(new listen());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new window());    //为窗体添加监听器
    }
    //内部类
    class listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actionCommandName=e.getActionCommand();
            //当按钮名字等于"打开对话框"时
            if(actionCommandName.equals("打开对话框")) {
                win.setVisible(true);   //窗体可见
            }
            else if(actionCommandName.equals("关闭对话框")){
                win.setVisible(false);  //窗体不可见
            }
        }
    }
    //内部类
    class window extends JDialog implements WindowListener{
        @Override
        public void windowOpened(WindowEvent e) {

        }
        public void windowClosing(WindowEvent e) {
            //设置确认对话框为有模式对话框
            int exit = JOptionPane.showConfirmDialog(this,"你要狠心离开吗","确认对话框",JOptionPane.YES_NO_OPTION );
            if(exit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }

    }
}
