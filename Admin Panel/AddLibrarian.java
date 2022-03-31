package library.management.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class AddLibrarian extends JFrame implements ActionListener
{
    private JPanel contentPane;
    private JButton button1;
    private JButton button2;

    int x1=300, x2=450, font=13;

    public AddLibrarian()
    {
        super("");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Enter Librarian's Information");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l1.setBounds(290, 10, 700, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(0, 0, 0));
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(x1, 110, 100, 40);
        contentPane.add(l2);

        JPasswordField t2 = new JPasswordField(20);
        t2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, font));
        t2.setBounds(x2, 110, 250, 40);
        contentPane.add(t2);

        JLabel l3 = new JLabel("Password");
        l3.setForeground(new Color(0, 0, 0));
        l3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l3.setBounds(x1, 180, 200, 40);
        contentPane.add(l3);

        JTextField t3 = new JTextField(20);
        t3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, font));
        t3.setBounds(x2, 180, 250, 40);
        contentPane.add(t3);

        JLabel l4 = new JLabel("Email");
        l4.setForeground(new Color(0, 0, 0));
        l4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l4.setBounds(x1, 250, 200, 40);
        contentPane.add(l4);

        JTextField t4 = new JTextField(20);
        t4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, font));
        t4.setBounds(x2, 250, 250, 40);
        contentPane.add(t4);

        JLabel l5 = new JLabel("Address");
        l5.setForeground(new Color(0, 0, 0));
        l5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l5.setBounds(x1, 320, 200, 40);
        contentPane.add(l5);

        JTextField t5 = new JTextField(20);
        t5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, font));
        t5.setBounds(x2, 320, 250, 40);
        contentPane.add(t5);

        JLabel l6 = new JLabel("Contact No.");
        l6.setForeground(new Color(0, 0, 0));
        l6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l6.setBounds(x1, 390, 200, 40);
        contentPane.add(l6);

        JTextField t6 = new JTextField(20);
        t6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, font));
        t6.setBounds(x2, 390, 250, 40);
        contentPane.add(t6);

        button1 = new JButton("Add Librarian");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(420, 465, 170, 60);
        contentPane.add(button1);

        button2 = new JButton("Back");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(800, 600, 100, 50);
        contentPane.add(button2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(00, 00, 00), 2), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
        panel.setBounds(270, 10, 470, 550);
        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==button2)
        {
            this.setVisible(false);
            new Admin().setVisible(true);
        }
    }

    public static void main(String[] Args)
    {
        new AddLibrarian().setVisible(true);
    }

}