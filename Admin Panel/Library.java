package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Library extends JFrame implements ActionListener
{
    private JPanel contentPane;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    int y1=570, y2=260;

    public Library()
    {
        super("Library Homepage");
        setBounds(200, 20, 1000, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));
/*
        JLabel l1 = new JLabel("Welcome to our");
        l1.setForeground(new Color(0xfffffff));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 60));
        l1.setBounds(450, 30, 700, 80);
        contentPane.add(l1);

        JLabel l12 = new JLabel("Library");
        l12.setForeground(new Color(0xfffffff));
        l12.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 60));
        l12.setBounds(580, 100, 700, 80);
        contentPane.add(l12);
*/
        JLabel l0 = new JLabel("");
        l0.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i01  = new ImageIcon("first.jpg");
        Image i02 = i01.getImage().getScaledInstance(990, 235,Image.SCALE_DEFAULT);
        ImageIcon i03 = new ImageIcon(i02);
        l0 = new JLabel(i03);
        l0.setBounds(5, 5, 990, 235);
        contentPane.add(l0);

        button1 = new JButton("Admin");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(80, y1, 200, 60);
        contentPane.add(button1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon("admin.png");
        Image i2 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, y2+10, 300, 300);
        contentPane.add(l2);

        JLabel l3 = new JLabel("");
        l3.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i4  = new ImageIcon("librarian.png");
        Image i5 = i4.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(380, y2, 300, 300);
        contentPane.add(l3);

        button2 = new JButton("Librarian");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(390, y1, 220, 60);
        contentPane.add(button2);

        JLabel l4 = new JLabel("");
        l4.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i7  = new ImageIcon("student.png");
        Image i8 = i7.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(670, y2, 300, 300);
        contentPane.add(l4);

        button3 = new JButton("Student");
        button3.addActionListener(this);
        button3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(720, y1, 200, 60);
        contentPane.add(button3);

        JLabel l5 = new JLabel("");
        l5.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i10  = new ImageIcon("about.png");
        Image i11 = i10.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(5, 650, 50, 50);
        contentPane.add(l5);
/*
        button4 = new JButton("About");
        button4.addActionListener(this);
        button4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setBounds(760, y1, 167, 44);
        contentPane.add(button4);
*/
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==button1)
        {
            this.setVisible(false);
            new AdminLogin().setVisible(true);
        }
        if (ae.getSource()==button2)
        {
            this.setVisible(false);
            new Librarian().setVisible(true);
        }
    }

    public static void main(String[] args)
    {
        new Library().setVisible(true);
    }
}