package buoi1;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class taoformdangnhap {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Đăng Nhập");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(700, 400); // ra giữa màn hình

        // --- Tạo các thành phần ---
        JLabel lblUser = new JLabel("Tên đăng nhập:");
        JTextField txtUser = new JTextField(15);
        JLabel lblPass = new JLabel("Mật khẩu:");
        JPasswordField txtPass = new JPasswordField(15);
        JButton btnLogin = new JButton("Đăng nhập");
        JButton btnCancel = new JButton("Hủy");

        // --- Panel để bố trí layout ---
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPass);
        panel.add(txtPass);
        panel.add(btnLogin);
        panel.add(btnCancel);

        // --- Thêm panel vào frame ---
        frame.add(panel);

        // --- Xử lý sự kiện ---
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = txtUser.getText();
                String pass = new String(txtPass.getPassword());

                if (user.equals("admin") && pass.equals("123")) {
                    JOptionPane.showMessageDialog(frame, "Đăng nhập thành công!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Sai tài khoản hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnCancel.addActionListener(e -> {
            txtUser.setText("");
            txtPass.setText("");
        });

        frame.setVisible(true);
    }
}
