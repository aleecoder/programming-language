package Java.Test.题库.demo02;

import javax.swing.*;
import java.awt.*;

public class ColorSelect extends JFrame {
    private JButton ok,cancel;
    private JCheckBox background,foreground;
    private JComboBox colorList;
    private JPanel panel,panel2;
    private Container c;

    public ColorSelect(){
        super("ColorSelect");
        c = getContentPane();
        c.setLayout(new BorderLayout());
        colorList = new JComboBox();
        colorList.addItem("REB");
        c.add(colorList,BorderLayout.NORTH);
        panel = new JPanel();
        background = new JCheckBox("Background");
        foreground = new JCheckBox("Foreground");
        panel.add(background);
        panel.add(foreground);
        c.add(panel,BorderLayout.CENTER);
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        panel2 = new JPanel();
        panel2.add(ok);
        panel2.add(cancel);
        c.add(panel2,BorderLayout.SOUTH);
        setSize(300,125);
        setVisible(true);
    }

    public static void main(String[] args) {
        ColorSelect app = new ColorSelect();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
