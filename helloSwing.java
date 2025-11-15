package buoi1;

import javax.swing.JFrame;

public class helloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" chuong trinh dau tien voi java swing");
        // cai dat kich co
        frame.setSize(400, 300);
        // dat hanh dong khi bam nut x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hien thi cua so
        frame.setVisible(true);
    }
}
