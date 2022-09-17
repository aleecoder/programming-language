package Java.lab.demo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PoliceListen implements ActionListener{
    JTextField inputText;
    JTextArea textShow;
    int count=0;    //计数
    //设置文本行
    public void setInputText(JTextField inputText) {
        this.inputText = inputText;
    }
    //设置文本域
    public void setTextShow(JTextArea textShow) {
        this.textShow = textShow;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String textField=inputText.getText();
        String textArea=textShow.getText();
        //获取触发按钮的名字
        String actionCommandName=e.getActionCommand();
        //如果点击按钮"OK"
        if(actionCommandName.equals("OK")) {
            int sum=0,i=0;
            String[] str=textArea.split("[^0-9]",0);//以非数字为分隔符
            while(i<str.length)
                sum += Integer.parseInt(str[i++]);
            textShow.setText(null);//清空文本域中的内容
            textShow.append("\n文本区中全部数据的个数="+str.length+"\n求和的结果="+sum);//输出加和结果
        }
        else{
            count++;
            if(count%5==0)      //当输出5个数后换行
                textShow.append(textField+"\n");
            else
                textShow.append(textField+" ");
            //如果用户输入C或c,则清空文本区
            if(textField.equals("c") || textField.equals("C"))
                textShow.setText(null);
            //在文本行敲回车,清空文本行
            inputText.setText(null);
        }
    }
}
