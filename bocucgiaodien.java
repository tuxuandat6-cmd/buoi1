package buoi1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class bocucgiaodien {
    public static void main(String[] args) {
        JFrame frame = new JFrame("flowlayout demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // dat layout
        frame.setLayout(new FlowLayout());  // bo cuc
        frame.add(new JButton("nut 1"));  // jbutton nut bam
        frame.add(new JButton("nut 2"));
        frame.add(new JButton("nut 3"));
        frame.add(new JButton("nut 4"));
frame.setVisible(true);
    }
}
