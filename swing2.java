import javax.swing.*;
import java.awt.*;
public class swing2 {
    public static void main(String[] args) {
        ImageIcon iamge=new ImageIcon("image.png");
        JPanel panel1=new JPanel();
        panel1.setBackground(new Color(0x123456));
        panel1.setBounds(0,0,250,250);
        panel1.setLayout(new BorderLayout());
        JPanel panel2=new JPanel();
        panel2.setBackground(new Color(0x654321));
        panel2.setBounds(250,0,250,250);
        JPanel panel3=new JPanel();
        panel3.setBackground(new Color(0x163828));
        panel3.setBounds(0,250,500,250);
        panel3.setLayout(new BorderLayout());
        JLabel label=new JLabel();
        label.setText("Hi");
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.gray);
        label.setIconTextGap(25);
        label.setIcon(iamge);
        label.setVerticalAlignment(JLabel.TOP);
        // label.setBounds(100,100,100,100);
        panel3.add(label);
        
        

        JFrame frame=new JFrame();        
        frame.setTitle("swing tutorial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        ImageIcon image=new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(250,250,250));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }   
}