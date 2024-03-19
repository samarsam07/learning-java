import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;;

public class flowlayout {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));


        JPanel panel1=new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(250,250));
        panel1.setBackground(Color.lightGray);

     
        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel1.add(new JButton("4"));
        panel1.add(new JButton("5"));
        panel1.add(new JButton("6"));
        panel1.add(new JButton("7"));
        panel1.add(new JButton("8"));
        panel1.add(new JButton("9"));
        panel1.add(new JButton("10"));
        frame.add(panel1);
        frame.setVisible(true);

    }
}
