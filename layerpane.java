import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;
public class layerpane {
    public static void main(String[] args) {
          JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        JLabel label=new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.blue);
        label.setBounds(50,50,200,200);
        JLabel label1=new JLabel();
        JLabel label3=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(100,100,200,200);
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);
        

        JLayeredPane layer =new JLayeredPane();
        layer.setBounds(0,0,500,500);
        layer.add(label,Integer.valueOf(4));
        layer.add(label1,Integer.valueOf(5));
        layer.add(label3,Integer.valueOf(6));





        frame.add(layer);
        frame.setVisible(true);
    }
}
