package Java.Test.题库.demo04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JTextField a;
    private JTextField b;
    private JButton button;
    private int result;
    public Convert(){
        super("加法运算");
        label = new JLabel("结果是");
        a = new JTextField(10);
        b = new JTextField(10);
        button = new JButton("Count");
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        int left = Integer.parseInt(a.getText());
                        int right = Integer.parseInt(b.getText());
                        result = left + right;
                        label.setText(String.valueOf(result));
                    }
                }
        );
        panel = new JPanel();
        panel.add(a);
        panel.add(b);
        panel.add(label);
        panel.add(button);

        Container container = getContentPane();
        container.add(panel);
        setSize(225,150);
        show();
    }

    public static void main(String[] args) {
        Convert app = new Convert();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
