package Java.lab.demo04;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends JFrame{
    JTextField inputText;
    JTextArea textShow;
    JButton button;
    PoliceListen listener;
    public Window() {
        init();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体的关闭的功能，按下后结束程序
    }
    void init() {
        setTitle("求和");
        JPanel panel_text,panel_area ;      //创建文本行、文本域的面板
        panel_text=new JPanel();
        button=new JButton("OK");
        inputText=new JTextField();
        inputText.setColumns(20);
        //将文本行和按钮添加到面板
        panel_text.add(inputText);
        panel_text.add(button);
        //BorderLayout布局
        getContentPane().add(panel_text,BorderLayout.NORTH);
        panel_area=new JPanel();
        textShow=new JTextArea();
        textShow.setColumns(30);
        textShow.setRows(20);
        textShow.setLineWrap(true);     //设置问本域可自动换行
        panel_area.add(textShow);       //将文本域添加到面板中
        add(panel_area,BorderLayout.CENTER);    //将面板添加到BorderLayout布局管理器的中间
    }
    void setMyCommandListener(PoliceListen listener) {
        this.listener = listener;
        listener.setInputText(inputText);
        listener.setTextShow(textShow);
        inputText.addActionListener(listener);  //inputText是事件源,listener是监视器
        button.addActionListener(listener);     //button是事件源,listener是监视器
    }
    //测试
    public static void main(String[] args) {
        Window win=new Window();
        PoliceListen listen=new PoliceListen();
        win.setMyCommandListener(listen);
        win.setBounds(200,200,560,460);
        win.setVisible(true);
    }
}

