import javax.swing.*;
import java.awt.*;

class Third_page{
    public static void main(String []args){
        JFrame jf = new JFrame("Login");
        JLabel jl1 = new JLabel("User ID:");
        JTextField jt = new JTextField(20);
        JLabel jl2 = new JLabel("PASSWORD:");
        JPasswordField jp = new JPasswordField(20);
        JButton jb = new JButton("LOGIN");
        jf.add(jl1);
        jf.add(jt);
        jf.add(jl2);
        jf.add(jp);
        jf.add(jb);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new FlowLayout());
        jf.setSize(400,400);
        jf.setVisible(true);
    }

}