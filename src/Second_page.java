import javax.swing.*;
import java.awt.*;

/**
 * Created by shaha on 12/19/2016.
 */
public class Second_page {
    public Second_page() {
        JFrame frame = new JFrame();
        JButton b = new JButton("LOGIN");
        JButton b1 = new JButton("CREATE AN ACCOUNT");
        JButton b2 = new JButton("ADMIN PANEL");
        b.setBounds(50,100,180,50);
        b1.setBounds(250,100,180,50);
        b2.setBounds(150,200,180,50);
        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

    public static void main(String[] args) {
        new Second_page();
    }
}
