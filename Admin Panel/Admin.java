package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame implements ActionListener
{
    private JPanel contentPane;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public Admin()
    {
        super("Admin Panel");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Admin Section");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l1.setBounds(340, 15, 701, 80);
        contentPane.add(l1);

        button1 = new JButton("Add Librarian");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(70, 450, 167, 44);
        contentPane.add(button1);

        button2 = new JButton("Delete Librarian");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(310, 450, 167, 44);
        contentPane.add(button2);

        button3 = new JButton("View Librarian");
        button3.addActionListener(this);
        button3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(520, 450, 167, 44);
        contentPane.add(button3);

        button4 = new JButton("Logout");
        button4.addActionListener(this);
        button4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setBounds(760, 450, 167, 44);
        contentPane.add(button4);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==button1)
        {
            this.setVisible(false);
            new AddLibrarian().setVisible(true);
        }
        if (ae.getSource()==button2)
        {
            this.setVisible(false);
            new DeleteLibrarian().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new Admin().setVisible(true);
    }
}