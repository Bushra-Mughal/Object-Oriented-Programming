import java.awt.*;
import javax.swing.*;
public class gui{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400, 400);
        JLabel uname = new JLabel();
        uname.setText("Use Name");
        uname.setBounds(60, 60, 60, 30);
        frame.add(uname);
        frame.setTitle("First pragram");
        frame.setVisible(true);   //to make it visible
        frame.setLocationRelativeTo(null);  //to appear in center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}