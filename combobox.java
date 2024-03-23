import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combobox {
    public static void main(String[] args) {
        new MYFRAME();
    }
}
class MYFRAME extends JFrame implements ActionListener{
    String[] animal={"dog","Cat","Snake"};
    JComboBox combo=new JComboBox<>(animal);
   
        MYFRAME(){
        
            this.setLayout(new FlowLayout());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            combo.addActionListener(this);
            this.add(combo);
            this.pack();
            this.setVisible(true);
        
        }
      
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==combo){
                System.out.print(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());

            }
          
        }
    
    }