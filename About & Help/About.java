package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener
{
    private JPanel contentPane;

    private JButton button1;


    int y1=570, y2=260;

    public About()
    {
        super("About us");
        setBounds(200, 20, 1000, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Hello, ours is a library management software. It's our vision to transform all our libraries to a digital one. For the first step of that, we're here with an awesome helping hand of the librarians out there. \n" +
                "\n" +
                "With the help of this software, librarians can keep the track of the books and issue them also digitally. And also students can easily find out which book is available and which is not. So it's a win-win situation for both end. \n" +
                "\n" +
                "We sincerely wish all of our vision come true, all the libraries of our country become digital someday. We, the dreamers are sincerely hereby: \n" +
                "\n" +
                "Md. Saim Ahmmed Utso\n" +
                "Md. Sadmin Tahmid Khan\n" +
                "Md. Imran Shorif Shuvo");
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

    public static void main(String[] args)
    {
        new about().setVisible(true);
    }
}