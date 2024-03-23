import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radiobutton {
    public static void main(String[] args) {
       new MYFRAME(); 
    }
}
class MYFRAME extends JFrame implements ActionListener{
JRadioButton radio1=new JRadioButton("pizza");
JRadioButton radio2=new JRadioButton("burger");
JRadioButton radio3=new JRadioButton("hotdog");
ButtonGroup group=new ButtonGroup();
ImageIcon icon =new ImageIcon("tick.png");
    MYFRAME(){
    
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        radio1.addActionListener(this);
        radio2.addActionListener(this);
        radio3.addActionListener(this);

        // radio1.setIcon(icon);
        this.add(radio1);
        this.add(radio2);
        this.add(radio3);
        this.pack();
        this.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==radio1) {
            System.out.println("you ordered pizza");
        }
        else if(e.getSource()==radio2){
            System.out.println("you ordered burger");
        }
        else if(e.getSource()==radio3){
            System.out.println("you order hotdog");
        }
    }

}
