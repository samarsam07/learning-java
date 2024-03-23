import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Joption {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null,"ERROR","system", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"ERROR","system", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"ERROR","system", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"ERROR","system", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null,"ERROR","system", JOptionPane.ERROR_MESSAGE);

        //  int ans =   JOptionPane.showConfirmDialog(null, "BRO<DO YOU EVEN CODE?","?", JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(ans);
    
        // String name=JOptionPane.showInputDialog("enter your name");
        // System.out.println("hello "+name);

        String[] resp={"yes","yes","yes"};
        ImageIcon icon=new ImageIcon("logo.png");
        JOptionPane.showOptionDialog(null,"Manjeet,are you gay?","gay", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, 
        resp, 0);
    
    
    
    
    
        }
}
