package buoi1;

import javax.swing.*;

public class themthanhphangiaodien {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" vi du giao dien SWing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // tao cac thanh phan
        JLabel label = new JLabel("nhap ten cua ban: ");    // Jlabel hien thi chu tinh
        JTextField textField = new JTextField(20);   //Jtextfield cho phep nguoi dung nhap van ban
        JButton button = new JButton("chao bro! ");    //jbutton nut bam
        // them thanh phan giao dien
        frame.setLayout(new java.awt.FlowLayout());   //flowlayout sap xep cac thanh phan theo hang ngang
        frame.add(label);
        frame.add(textField);
        frame.add(button );
        frame.setVisible(true);
    }
}
