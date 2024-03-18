import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.*;

public class swing {
    public static void main(String[] args) {
        Frame frame=new Frame();
        JLabel label=new JLabel();
        Border border= BorderFactory.createLineBorder(Color.GRAY);
        ImageIcon iamge=new ImageIcon("logo.png");
        label.setText("hello world");
        label.setIcon(iamge);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(250,0,0));
        label.setFont(new Font("MV Boli",Font.ITALIC,20));
        label.setIconTextGap(25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);;
        frame.setLayout(null);
        frame.add(label);
        // frame.pack();
      
   
    }
}
class Frame extends JFrame{
    Frame(){
        this.setSize(420,420);
        // this.setResizable(false);
        this.setTitle("swing tutorial");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        ImageIcon image=new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(250,250,250));
    }
}
