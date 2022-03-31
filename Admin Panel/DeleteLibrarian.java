package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class DeleteLibrarian extends JFrame implements ActionListener
{
    private JPanel contentPane;

    private JButton button1;
    private JButton button2;

    public DeleteLibrarian() {
        super("Admin");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Admin Panel");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l1.setBounds(400, 80, 701, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Enter ID:");
        l2.setForeground(new Color(0, 0, 0));
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(300, 210, 500, 40);
        contentPane.add(l2);

        JTextField t1 = new JTextField(20);
        t1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t1.setBounds(500, 210, 200, 40);
        contentPane.add(t1);

        JLabel l3 = new JLabel("Enter Name:");
        l3.setForeground(new Color(0, 0, 0));
        l3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l3.setBounds(300, 300, 500, 40);
        contentPane.add(l3);

        JTextField t2 = new JTextField(20);
        t2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t2.setBounds(500, 300, 200, 40);
        contentPane.add(t2);

        button1 = new JButton("Delete");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(450, 400, 100, 50);
        contentPane.add(button1);

        button2 = new JButton("Back");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(800, 550, 100, 50);
        contentPane.add(button2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(00, 00, 00), 2), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
        panel.setBounds(280, 50, 445, 450);
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
        new DeleteLibrarian().setVisible(true);
    }
}