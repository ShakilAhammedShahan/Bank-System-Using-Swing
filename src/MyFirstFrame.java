import javax.swing.*;
import java.awt.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*frame.setSize(400,300);
        frame.setLocation(100,100);*/
        frame.setBounds(100,100,300,400);
        frame.setTitle("My created Frame");
        ImageIcon icon=new ImageIcon("logo.jpg");
        frame.setIconImage(icon.getImage());

        Container c =frame.getContentPane();
        c.setBackground(Color.red);
        Label label=new Label();
        label.setBackground(Color.red);

        frame.setResizable(true);//it can made resizeable
        
    }
}
