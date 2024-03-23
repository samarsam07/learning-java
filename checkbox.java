import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class checkbox {
    public static void main(String[] args) {
        new MYFRAME();
    }
}
class MYFRAME extends JFrame implements ActionListener{
    JButton button;
    JCheckBox check;
    ImageIcon tick;
    ImageIcon xicon;


    MYFRAME(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);
        tick=new ImageIcon("greenmark.png");
        xicon=new ImageIcon("xicon.png");

        check=new JCheckBox();
        check.setText("I am not a robot");
        check.setFocusable(false);
        check.setFont(new Font("Consolas",Font.PLAIN,20));
        // check.setIcon(xicon);
        // check.setSelectedIcon(tick);




        this.add(button);     
        this.add(check);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
           System.out.println(check.isSelected()); 
           this.dispose();
        }
    }

}