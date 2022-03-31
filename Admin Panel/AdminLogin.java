package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class AdminLogin extends JFrame implements ActionListener
{
    private JPanel contentPane;
    private JButton button1;

    int x=80;

    public AdminLogin()
    {
        super("Admin");
        setBounds(500, 20, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Admin Panel Login");
        l1.setForeground(new Color(0x000000));
        l1.setFont(new Font("Segoe UI Semilight", Font.BOLD|Font.ITALIC, 20));
        l1.setBounds(x, 130, 700, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Enter Name:");
        l2.setForeground(new Color(0, 0, 0));
        l2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
        l2.setBounds(x, 220, 500, 40);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Enter Password:");
        l3.setForeground(new Color(0, 0, 0));
        l3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
        l3.setBounds(x, 340, 500, 40);
        contentPane.add(l3);

        JTextField t1 = new JTextField(20);
        t1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
        t1.setBounds(x, 260, 300, 40);
        contentPane.add(t1);

        JPasswordField t2 = new JPasswordField(20);
        t2.setFont(new Font("Serif", Font.PLAIN, 14));
        t2.setBounds(x, 380, 300, 40);
        contentPane.add(t2);

        button1 = new JButton("Login");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        button1.setBounds(x, 475, 300, 40);
        contentPane.add(button1);

        JLabel l03 = new JLabel("");
        ImageIcon i04  = new ImageIcon("side.jpeg");
        Image i05 = i04.getImage().getScaledInstance(540, 768,Image.SCALE_DEFAULT);
        ImageIcon i06 = new ImageIcon(i05);
        l03 = new JLabel(i06);
        l03.setBounds(460, 0, 540, 768);
        contentPane.add(l03);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==button1)
        {
            this.setVisible(false);
            new Admin().setVisible(true);
        }
    };

    public static void main(String[] Args)
    {
        new AdminLogin().setVisible(true);
    }
}