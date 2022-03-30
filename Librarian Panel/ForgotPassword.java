package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;



    public ForgotPassword() {

        super("Forgot Password");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Name");
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l1.setBounds(250, 83, 150, 29);
        contentPane.add(l1);

        JLabel l2 = new JLabel("User Name");
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(250, 122, 150, 21);
        contentPane.add(l2);


        JLabel l4 = new JLabel("Enter Email");
        l4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l4.setBounds(250, 192, 150, 21);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Password");
        l5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l5.setBounds(250, 224, 104, 21);
        contentPane.add(l5);

        t1 = new JTextField();
        t1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        t1.setForeground(new Color(105, 105, 105));
        t1.setBounds(375, 88, 139, 30);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setEditable(false);
        t2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        t2.setForeground(new Color(165, 42, 42));
        t2.setColumns(10);
        t2.setBounds(375, 123, 139, 30);
        contentPane.add(t2);

        t4 = new JTextField();
        t4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        t4.setForeground(new Color(205, 92, 92));
        t4.setColumns(10);
        t4.setBounds(375, 190, 139, 30);
        contentPane.add(t4);

        t5 = new JTextField();
        t5.setEditable(false);
        t5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        t5.setForeground(new Color(50, 205, 50));
        t5.setColumns(10);
        t5.setBounds(375, 225, 139, 30);
        contentPane.add(t5);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b1.setBounds(550, 85, 150, 35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Retrieve");
        b2.addActionListener(this);
        b2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b2.setBounds(550, 188, 150, 35);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b3.setBounds(600, 290, 101, 35);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Connectivity connect = new Connectivity();
            if(ae.getSource() == b1){
                String sql = "select * from librarian where Name=?";
                PreparedStatement st = connect.connection.prepareStatement(sql);

                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t2.setText(rs.getString("UserName"));
                    //t3.setText(rs.getString("Password"));
                }

            }

            if(ae.getSource() == b2){
                String sql = "select * from librarian where Email=?";
                PreparedStatement st = connect.connection.prepareStatement(sql);

                st.setString(1, t4.getText());
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    t5.setText(rs.getString("Password"));
                }
                else
                    JOptionPane.showMessageDialog(null, "Invalid Email...!");

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new LibrarianLogin().setVisible(true);

            }

        }

        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new ForgotPassword().setVisible(true);
    }

}