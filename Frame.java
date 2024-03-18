import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Frame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    Frame(){
        ImageIcon icon2=new ImageIcon("image.png");
        ImageIcon icon =new ImageIcon("logo.png");
        label=new JLabel();
        label.setIcon(icon2);
        label.setBounds(100,200,100,100);
        label.setVisible(false);
        button=new JButton();
        button.setBounds(50,100,200,100);
        button.addActionListener(this);
        button.setText("HI");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createLineBorder(Color.black));



        this.setSize(420,420);
        this.setTitle("swing tutorial");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        ImageIcon image=new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.add(button);
        this.add(label);
    }
    public static void main(String[] args) {
        new Frame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println("hello");
            // button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
