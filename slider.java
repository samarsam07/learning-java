import javax.swing.event.ChangeEvent;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class slider {
    public static void main(String[] args) {
        new sliderdemo();
    }
}
class sliderdemo implements ChangeListener{
    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;
    sliderdemo(){
        frame =new JFrame("Slider TUtorial");
        label =new JLabel();
        panel=new JPanel();



        slider=new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);

        label.setText("C="+ slider.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,30));


        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C="+ slider.getValue());
}
}