import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class newwindow {
    public static void main(String[] args) {
        Launchpage launchpage=new Launchpage();
    }
}
class Launchpage implements ActionListener{
    JFrame frame=new JFrame();
    JButton button =new JButton("new window");
    Launchpage(){
        button.setBounds(100,150,100,40);
        button.setFocusable(false);
        button.addActionListener(this);




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
           System.out.println("hello");
            NEWINDOW window=new NEWINDOW();
          
        }
     }
}
class NEWINDOW{
    JFrame frame=new JFrame();
    JLabel label1=new JLabel("hello");
    NEWINDOW(){
        label1.setBounds(0,0,100,50);
        label1.setFont(new Font("MV Boli",Font.BOLD,25));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(label1);
        frame.setVisible(true);
    }
}
