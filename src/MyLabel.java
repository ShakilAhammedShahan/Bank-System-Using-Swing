/**
 * Created by shaha on 12/19/2016.
 */
import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);


        Container c =frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("logo.jpg");
        JLabel label=new JLabel(icon);

        label.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
        c.add(label);
    }
}

