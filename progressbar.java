import java.awt.*;
import javax.swing.*;


public class progressbar {
    public static void main(String[] args) {
        new progressbardemo();
        
    }
}
class progressbardemo{
    JFrame frame;
    JProgressBar bar;



    progressbardemo(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);


        bar=new JProgressBar();
        bar.setValue(0);
        frame.setLayout(null);
        bar.setBounds(0, 0, 420, 40);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.PLAIN,15));
        bar.setForeground(new Color(0,0,0));
        bar.setBackground(new Color(0x123456));
        frame.add(bar);
        frame.setVisible(true);
        fill();
    }
    public  void fill(){
        int counter=0;
        while (counter<=100) {
            bar.setValue(counter);
            try{
                Thread.sleep(25);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            counter+=1;
        }
        bar.setString("Done");
    }
}
