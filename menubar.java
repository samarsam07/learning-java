import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menubar {
    public static void main(String[] args) {
       new Myframe();
    }
}
class Myframe extends JFrame implements ActionListener{
    JMenuBar menubar;
    JMenu file;
    JMenu edit;
    JMenu Help ;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;

    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        menubar=new JMenuBar();
        file=new JMenu("file");
        edit=new JMenu("Edit");
        Help =new JMenu("Help");

        load=new JMenuItem("load");
        save=new JMenuItem("Save");
        exit=new JMenuItem("Exit");

        file.setMnemonic(KeyEvent.VK_F);//alt+f for file menu
        edit.setMnemonic(KeyEvent.VK_E);//alt+e for edit menu
        Help.setMnemonic(KeyEvent.VK_H);//alt+h for help menu


        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        load.setMnemonic(KeyEvent.VK_L);//L for load
        save.setMnemonic(KeyEvent.VK_S);//S for save
        exit.setMnemonic(KeyEvent.VK_E);//e for exit


        file.add(load);
        file.add(save);
        file.add(exit);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(Help);
        
        
        this.setJMenuBar(menubar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==load){
        System.out.println("Loading a file");
      }
     if (e.getSource()==save) {
        System.out.println("Saving a File");
      }
     if (e.getSource()==exit) {
        System.exit(0);
      }

    }
    
}