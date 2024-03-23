import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textfield {
    public static void main(String[] args) {
        new MYFRAME();
    }
}
class MYFRAME extends JFrame implements ActionListener{
    JButton button;
    JTextField text;
    MYFRAME(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button= new JButton("submit");
        button.addActionListener(this);


        text=new JTextField();
        text.setPreferredSize(new Dimension(250,50));
        text.setForeground(new Color(0x000000));
        text.setFont(new Font("MV Boli",Font.ITALIC,30));
        text.setCaretColor(Color.GRAY);
        text.setText("username");
    



        this.add(text);
        this.add(button);
      
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
        System.out.println( "WELCOME "+text.getText());   
        text.setEditable(false);
        button.setEnabled(false);
        this.dispose();
            
        }
    }

}
