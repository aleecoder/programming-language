package Java.Test.题库.填空.demo05;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrameCanExit extends Frame implements WindowListener {
    public MyFrameCanExit(String string){
        super(string);
    }
    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }
    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }
    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }
    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }
    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }

    public static void main(String[] args) {
        MyFrameCanExit fr = new MyFrameCanExit("Hello");
        fr.addWindowListener(fr);       //注册窗口事件监听器
        fr.setSize(200,200);
        fr.setVisible(true);
    }
}
