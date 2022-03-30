package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Librarian extends JFrame implements ActionListener {
    private JPanel contentPane;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;

    public Librarian(){
        super("Librarian Panel");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setBackground(new Color(0xffffff));

        JLabel l1 = new JLabel("Librarian Panel");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l1.setBounds(380, 15, 701, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon("fourth.png");
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, 140, 159, 152);
        contentPane.add(l2);

        JLabel l3 = new JLabel("");
        ImageIcon i4  = new ImageIcon("second.png");
        Image i5 = i4.getImage().getScaledInstance(150, 130,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(300, 160, 134, 128);
        contentPane.add(l3);

        JLabel l4 = new JLabel("");
        ImageIcon i7  = new ImageIcon("seventh.png");
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(480, 140, 225, 152);
        contentPane.add(l4);

        JLabel l5 = new JLabel("");
        l5.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i10  = new ImageIcon("fifth.png");
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(750, 140, 159, 152);
        contentPane.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i13  = new ImageIcon("sixth.png");
        Image i14 = i13.getImage().getScaledInstance(150, 130,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(60, 450, 134, 128);
        contentPane.add(l6);

        JLabel l7 = new JLabel("");
        ImageIcon i16  = new ImageIcon("third.png");
        Image i17 = i16.getImage().getScaledInstance(200, 180,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(250, 450, 225, 152);
        contentPane.add(l7);

        JLabel l8 = new JLabel("");
        ImageIcon i19  = new ImageIcon("tenth.png");
        Image i20 = i19.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(550, 450, 137, 150);
        contentPane.add(l8);

        JLabel l9 = new JLabel("");
        ImageIcon i22  = new ImageIcon("nineth.png");
        Image i23 = i22.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(750, 430, 180, 180);
        contentPane.add(l9);


        button1 = new JButton("Add Student");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        //button1.setBorder(new RoundedBorder(10)); //10 is the radius
        button1.setBounds(60, 320, 159, 44);
        contentPane.add(button1);

        button2 = new JButton("Add Book");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(300, 320, 139, 44);
        contentPane.add(button2);

        button3 = new JButton("View Students");
        button3.addActionListener(this);
        button3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(510, 320, 167, 44);
        contentPane.add(button3);

        button4 = new JButton("View Books");
        button4.addActionListener(this);
        button4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setBounds(750, 320, 167, 44);
        contentPane.add(button4);

        button5 = new JButton("Issue Book");
        button5.addActionListener(this);
        button5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button5.setBackground(Color.BLACK);
        button5.setForeground(Color.WHITE);
        button5.setBounds(60, 620, 159, 44);
        contentPane.add(button5);

        button6 = new JButton("View Issued Books");
        button6.addActionListener(this);
        button6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button6.setBackground(Color.BLACK);
        button6.setForeground(Color.WHITE);
        button6.setBounds(280, 620, 180, 44);
        contentPane.add(button6);

        button7 = new JButton("Return Book");
        button7.addActionListener(this);
        button7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button7.setBackground(Color.BLACK);
        button7.setForeground(Color.WHITE);
        button7.setBounds(530, 620, 159, 44);
        contentPane.add(button7);

        button8 = new JButton("Delete Book");
        button8.addActionListener(this);
        button8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button8.setBackground(Color.BLACK);
        button8.setForeground(Color.WHITE);
        button8.setBounds(760, 620, 159, 44);
        contentPane.add(button8);

        button8 = new JButton("Log Out");
        button8.addActionListener(this);
        button8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button8.setBackground(Color.BLACK);
        button8.setForeground(Color.WHITE);
        button8.setBounds(760, 700, 159, 44);
        contentPane.add(button8);

    }

    @Override
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == button1){
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }

        if(ae.getSource() == button2){
            this.setVisible(false);
            new AddBook().setVisible(true);
        }

        if(ae.getSource() == button3){
            this.setVisible(false);
            new ViewStudents().setVisible(true);
        }

        if(ae.getSource() == button4){
            this.setVisible(false);
            new ViewBooks().setVisible(true);
        }

        if(ae.getSource() == button5){
            this.setVisible(false);
            new IssueBook().setVisible(true);

        }

        if(ae.getSource() == button6){
            this.setVisible(false);


        }

        if(ae.getSource() == button7){
            this.setVisible(false);
            new ReturnBook().setVisible(true);

        }

        if(ae.getSource() == button8){
            this.setVisible(false);

        }

    }

    public static void main(String[] args){
        new Librarian().setVisible(true);
    }
}
