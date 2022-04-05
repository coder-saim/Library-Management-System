package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Help extends JFrame implements ActionListener
{
    private JPanel contentPane;

    private JButton button1;

    int y1=570, y2=260;

    public Help()
    {
        super("Help");
        setBounds(200, 20, 1000, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Hello there!");
        JLabel l2 = new JLabel("Thanks for dropping by! ");
        JLabel l3 = new JLabel("If you're a student, press the Student View button. ");
        JLabel l4 = new JLabel("Then you'll get to view the books.");
        JLabel l5 = new JLabel("If you're a librarian, then you can do several things. ");
        JLabel l6 = new JLabel("First, you'll press the librarian button. ");
        JLabel l7 = new JLabel("Then after giving your login information, you can add any books, issue books respect to the students or even delete the books also. ");
        JLabel l8 = new JLabel("If you're an admin, who can manage the students and the librarians, you can do a whole lot of stuff. ");
        JLabel l9 = new JLabel("After giving your login credentials, you can add any librarian. ");
        JLabel l10 = new JLabel("You can also delete them too, even you can do the tasks of librarian also!");
        JLabel l11 = new JLabel("Again thanks for using our software! :D");



        l1.setForeground(new Color(0xfffffff));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 60));
        l1.setBounds(450, 30, 700, 80);
        contentPane.add(l1);


        button1 = new JButton("Back");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(760, y1, 167, 44);
        contentPane.add(button1);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==button1)
        {
            this.setVisible(false);
            new Library().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Help().setVisible(true);
    }
}