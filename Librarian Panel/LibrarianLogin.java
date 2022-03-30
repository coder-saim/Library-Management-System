package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LibrarianLogin extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;


    public LibrarianLogin() {

        super("Librarian Login");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0xffffff));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l = new JLabel("Librarian Login Panel");
        l.setForeground(new Color(204, 51, 102));
        l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l.setBounds(380, 15, 701, 80);
        contentPane.add(l);


        JLabel l1 = new JLabel("UserName : ");
        l1.setBounds(300, 100, 160, 30);
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        contentPane.add(l1);

        JLabel l2 = new JLabel("Password  : ");
        l2.setBounds(300, 130, 150, 30);
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        contentPane.add(l2);

        textField = new JTextField();
        textField.setBounds(430, 100, 160, 30);
        textField.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        contentPane.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(430, 135, 160, 30);
        passwordField.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        contentPane.add(passwordField);



        b1 = new JButton("Login");
        b1.addActionListener(this);
        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(250, 250, 210));
        b1.setBounds(450, 180, 113, 39);
        b1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        contentPane.add(b1);


        b2 = new JButton("Forgot Password");
        b2.addActionListener(this);
        b2.setForeground(new Color(205, 92, 92));
        b2.setBackground(new Color(253, 245, 230));
        b2.setBounds(420, 250, 179, 39);
        b2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        contentPane.add(b2);



    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            Boolean status = false;
            try {
                Connectivity connect = new Connectivity();
                String sql = "select * from librarian where UserName=? and Password=?";
                PreparedStatement st = connect.connection.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Successfull...");
                    this.setVisible(false);
                    new Loading().setVisible(true);
                }

                else
                    JOptionPane.showMessageDialog(null, "Invalid Login...!.");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        if(ae.getSource() == b2){
            setVisible(false);
            new ForgotPassword().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new LibrarianLogin().setVisible(true);
    }

}