package Java.Test.题库.demo06;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestEdit extends Frame implements ActionListener {
    TextArea text;
    Button save,cancel,exit;
    String filename = "myText.txt";
    public TestEdit(){
        setTitle("文本编辑器");
        text = new TextArea();
        text.setText(readFile(filename));
        save = new Button("保存");
        save.addActionListener(this);
        cancel = new Button("取消");
        cancel.addActionListener(this);
        exit = new Button("退出");
        exit.addActionListener(this);
        Panel panel = new Panel();
        panel.add(save);
        panel.add(cancel);
        panel.add(exit);
        add(text,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);
        setSize(400,200);
        setVisible(true);
    }

    private String readFile(String filename) {
        StringBuffer str = new StringBuffer();
        try{
            File file = new File(filename);
            if (!file.exists())
                file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null){
                str.append(line+"\r\n");
                line = br.readLine();
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return str.toString();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save){
            try {
                PrintWriter out = new PrintWriter(new FileWriter(filename));
                out.println(text.getText());
                out.close();
                System.out.println("文件保存成功！");
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }else if (e.getSource() == cancel){
            text.setText("");
            return;
        }else if (e.getSource() == exit){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TestEdit();
    }
}
