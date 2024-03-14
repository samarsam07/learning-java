import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class swingtut {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        JLabel label=new JLabel();
        label.setText("HELLO");
        label.setBackground(new Color(50,59,80));
      

        frame.setSize(250,250);
        frame.add(label);
        frame.setVisible(true);
    }
}
