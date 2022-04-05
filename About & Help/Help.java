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

        JLabel l1 = new JLabel("Hello there! :D \n" +
                "Thanks for dropping by! \n" +
                "\n" +
                "If you're a student, press the \"Student View\" button. Then you'll get to view the books. \n" +
                "\n" +
                "If you're a librarian, then you can do several things. First, you'll press the librarian button. Then after giving your login information, you can add any books, issue books respect to the students or even delete the books also. \n" +
                "\n" +
                "If you're an admin, who can manage the students and the librarians, you can do a whole lot of stuff. After giving your login credentials, you can add any librarian. You can also delete them too! Even you can do the tasks of librarian also. \n" +
                "\n" +
                "Again thanks for using our software! :D");
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
        contentPane.add(button4);

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