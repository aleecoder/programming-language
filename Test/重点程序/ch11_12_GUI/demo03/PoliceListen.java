package Java.Test.重点程序.ch11_12_GUI.demo03;

import java.awt.event.*;
import javax.swing.*;
public class PoliceListen implements MyCommandListener {
    JTextField textInput;
    JTextArea textShow;
    public void setJTextField(JTextField text) {
        textInput = text;
    }
    public void setJTextArea(JTextArea area) {
        textShow = area;
    }
    public void actionPerformed(ActionEvent e) {
        String str=textInput.getText();
        textShow.append(str+"的长度:"+str.length()+"\n");

    }
}
