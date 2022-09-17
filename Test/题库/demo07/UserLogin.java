package Java.Test.题库.demo07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UserLogin extends Frame implements ActionListener, ItemListener {
    Panel panel1,panel2;    //定义两个面板
    Label userType,userLabel,pswLabel;  //分别定义用户类型、用户名和密码标签
    TextField username,psw; //分别定义用户名和密码文本框
    Button yesBtn,cancelBtn,exitBtn;    //分别定义确定、取消和退出按钮
    Choice userSelect;  //用户类型下拉框
    int userID = 0; //定义用户类型标志变量，0表示学生用户，1表示教师用户
    public UserLogin(){
        super("用户登录");
        userType = new Label("用户类型",Label.CENTER);
        userSelect = new Choice();
        userSelect.add("学生用户");
        userSelect.add("教师用户");
        userSelect.addItemListener(this);
        userLabel = new Label("用户名："+Label.CENTER);
        pswLabel = new Label("密码："+Label.CENTER);
        username = new TextField(10);
        psw = new TextField(10);
        yesBtn = new Button("确定");
        cancelBtn = new Button("取消");
        exitBtn = new Button("退出");
        yesBtn.addActionListener(this);
        cancelBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        panel1 = new Panel();
        panel1.setLayout(new GridLayout(3,2));
        panel2 =  new Panel();
        panel2.setLayout(new BorderLayout());

        panel1.add(userType);
        panel1.add(userSelect);
        panel1.add(userLabel);
        panel1.add(username);
        panel1.add(pswLabel);
        panel1.add(psw);
        add(panel1,BorderLayout.CENTER);

        panel2.add(yesBtn);
        panel2.add(cancelBtn);
        panel2.add(exitBtn);
        add(panel2,BorderLayout.SOUTH);

        setBounds(300,300,200,160);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelBtn){
            username.setText("");
            psw.setText("");
            return;
        }
        if (e.getSource() == exitBtn)
            System.exit(0);
        else {
            if (username.getText().trim().equals("")){
                System.out.println("用户名不可为空！");
                return;
            }if (psw.getText().trim().equals("")){
                System.out.println("密码不可为空！");
                return;
            }
            switch (userID){
                case 0:
                    if (username.getText().trim().equals("s") && psw.getText().trim().equals("s")){
                        System.out.println("学生用户登录成功！");
                        break;
                    }
                case 1:
                    if (username.getText().trim().equals("t") && psw.getText().trim().equals("t")){
                        System.out.println("教师用户登录成功！");
                        break;
                    }
                default:
                    System.out.println("用户不存在或密码不正确！");
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        userID = userSelect.getSelectedIndex();
    }

    public static void main(String[] args) {
        new UserLogin();
    }
}
