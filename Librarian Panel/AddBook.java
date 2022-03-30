package library.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;




public class AddBook extends JFrame implements ActionListener{

    private JPanel contentPane;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;


    private JButton button1;
    private JButton button2;

    public void random() {
        Random random = new Random();
        textField1.setText("" + random.nextInt(1000 + 1));
    }

    public AddBook(){

        super("Add Student");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);



        JLabel l = new JLabel("Add Book");
        l.setForeground(new Color(204, 51, 102));
        l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l.setBounds(380, 15, 701, 80);
        contentPane.add(l);


        JLabel l1 = new JLabel("Book_ID");
        l1.setForeground(new Color(25, 25, 112));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l1.setBounds(300, 100, 150, 25);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(25, 25, 112));
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(300, 130, 150, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Author");
        l3.setForeground(new Color(25, 25, 112));
        l3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l3.setBounds(300, 160, 150, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Publisher");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l4.setBounds(300, 190, 150, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Quantity");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l5.setBounds(300, 220, 150, 22);
        contentPane.add(l5);



        textField1 = new JTextField();
        textField1.setEditable(false);
        textField1.setForeground(new Color(47, 79, 79));
        textField1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField1.setBounds(430, 87, 198, 25);
        contentPane.add(textField1);


        textField2 = new JTextField();
        textField2.setForeground(new Color(47, 79, 79));
        textField2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField2.setBounds(430, 120, 198, 25);
        contentPane.add(textField2);


        textField3 = new JTextField();
        textField3.setForeground(new Color(47, 79, 79));
        textField3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField3.setBounds(430, 153, 198, 25);
        contentPane.add(textField3);


        textField4 = new JTextField();
        textField4.setForeground(new Color(47, 79, 79));
        textField4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField4.setBounds(430, 183, 198, 25);
        contentPane.add(textField4);

        textField5 = new JTextField();
        textField5.setForeground(new Color(47, 79, 79));
        textField5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField5.setBounds(430, 216, 198, 25);
        contentPane.add(textField5);



        button1 = new JButton("Add Data");
        button1.addActionListener(this);
        button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button1.setBounds(280, 321, 150, 33);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        contentPane.add(button1);

        button2 = new JButton("Back");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button2.setBounds(500, 321, 150, 33);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        contentPane.add(button2);



        random();



    }

    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Connectivity connect = new Connectivity();
            if(ae.getSource() == button1){
                String sql = "insert into book(Book_ID, Name, Author, Publisher, Quantity) values(?, ?, ?, ?, ?)";
                PreparedStatement st = connect.connection.prepareStatement(sql);
                st.setString(1, textField1.getText());
                st.setString(2, textField2.getText());
                st.setString(3, textField3.getText());
                st.setString(4, textField4.getText());
                st.setString(5, textField5.getText());

                int i = st.executeUpdate();

                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                }

                else {
                    JOptionPane.showMessageDialog(null, "Error");
                }


                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                st.close();
            }

            if(ae.getSource() == button2){
                this.setVisible(false);
                new Librarian().setVisible(true);

            }
            connect.connection.close();
        }

        catch(Exception e){
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        new AddBook().setVisible(true);
    }
}
