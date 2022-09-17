package Java.Test.重点程序.ch11_12_GUI.demo03;

import javax.swing.*;
import java.awt.event.*;
interface MyCommandListener extends ActionListener {
    public void setJTextField(JTextField text);
    public void setJTextArea(JTextArea area);

}
