 package buoi1;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class xulysukienSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sự kiện trong Swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Nhập tên:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Chào!");

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Xử lý sự kiện nhấn nút
        button.addActionListener(new ActionListener() {  // addActionlistener bat su kien  khi an nut
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Xin chào, " + name + "!");   // hien thi hop thoai nho
            }
        });

        frame.setVisible(true);
    }
}
