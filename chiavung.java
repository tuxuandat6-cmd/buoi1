package buoi1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class chiavung {
    public static void main(String[] args) {
        JFrame frame = new JFrame("borderlayout demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("tren (north)"), BorderLayout.NORTH);
        frame.add(new JButton("duoi (south)"),BorderLayout.SOUTH);
        frame.add(new JButton("phai (east)"), BorderLayout.EAST);
        frame.add(new JButton("trai (west)"),BorderLayout.WEST);
        frame.add(new JButton("giua (center)"),BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
}
