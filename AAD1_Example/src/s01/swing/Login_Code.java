/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Login_Code extends JFrame {

    private final JLabel lblUserName;
    private final JLabel lblPassword;
    private final JTextField txtUserName;
    private final JPasswordField txtPassword;
    private final JButton btnLogin;

    public Login_Code() {
        //Thiết lập Layout cho Login_Code JFrame
        this.setLayout(null);
        
        //Tạo đối tượng JLabel: lblUserName
        lblUserName = new JLabel("User Name:");
        //Thiết lập vị trí cho Label này cách (trên 30, trái 30, rộng 90 cao 30)
        lblUserName.setBounds(30, 30, 90, 30);
        //Đưa lblUserName vào trong JFrame Login_Code
        this.getContentPane().add(lblUserName);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(30, 60, 70, 30);
        this.getContentPane().add(lblPassword);

        txtUserName = new JTextField();
        txtUserName.setBounds(120, 30, 200, 30);
        this.getContentPane().add(txtUserName);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 60, 200, 30);
        this.getContentPane().add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(120, 90, 70, 30);
        this.getContentPane().add(btnLogin);
        //Thêm sự kiện click chuột cho btnButton
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUserName.getText().equals(String.valueOf(txtPassword.getPassword()))) {
                    //Nếu nhập UserName và Password giống nhau hiển thị thông báo thành công
                    JOptionPane.showMessageDialog(null, "Login complete", "Login", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //Ngược lại hiển thị thông báo lỗi
                    JOptionPane.showMessageDialog(null, "User Name or Password is not valid.", "Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Thiết lập khi đóng cửa sổ JFrame thì thoát luôn ứng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 180);
        //Hiển thị JFrame giữa màn hình
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        //Tạo một đối tượng Login
        Login_Code login = new Login_Code();
        //Hiển thị JFrame login
        login.setVisible(true);
    }
}
