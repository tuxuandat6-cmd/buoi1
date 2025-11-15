package buoi1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class chiao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GirdLayout demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,3));
        for(int i =1; i<=6; i++){
            frame.add(new JButton("nut "+i));
        }
        frame.setVisible(true);
    }
}
