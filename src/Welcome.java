import javax.swing.*;
import java.awt.*;

public class Welcome{
    public static void main(String []args){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(150,150,1000,500);
        Container c = frame.getContentPane();
        frame.setResizable(true);
        c.setLayout(null);
        JLabel label =new JLabel();
        label.setText("WELCOME");
        label.setBounds(400,150,200,80);
        Font f = new Font("Arial",Font.BOLD,30);
        label.setFont(f);
        c.add(label);
        label.setBackground(Color.RED);

    }
}