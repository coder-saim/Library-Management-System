package library.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class IssueBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    private JButton b1,b2,b3,b4;

    public IssueBook() {
        super("Issue Book");
        setBounds(500, 120, 1000, 800);
        contentPane = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);


        JLabel l = new JLabel("Issue Book");
        l.setForeground(new Color(204, 51, 102));
        l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l.setBounds(380, 15, 701, 80);
        contentPane.add(l);

        JLabel l1 = new JLabel("Book_ID");
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l1.setForeground(new Color(47, 79, 79));
        l1.setBounds(80, 100, 100, 23);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(47, 79, 79));
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(80, 130, 100, 23);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Author");
        l3.setForeground(new Color(47, 79, 79));
        l3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l3.setBounds(80, 160, 100, 23);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Publisher");
        l4.setForeground(new Color(47, 79, 79));
        l4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l4.setBounds(80, 190, 100, 23);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Quantity");
        l5.setForeground(new Color(47, 79, 79));
        l5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l5.setBounds(80, 220, 100, 23);
        contentPane.add(l5);


        t1 = new JTextField();
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t1.setBounds(190, 100, 86, 20);
        contentPane.add(t1);



        t2 = new JTextField();
        t2.setEditable(false);
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t2.setBounds(190, 130, 208, 20);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t3.setBounds(190, 160, 208, 20);
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setEditable(false);
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t4.setBounds(190, 190, 208, 20);
        contentPane.add(t4);

        t5 = new JTextField();
        t5.setEditable(false);
        t5.setForeground(new Color(47, 79, 79));
        t5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t5.setBounds(190, 220, 208, 20);
        contentPane.add(t5);



        JLabel l8 = new JLabel("Student_ID");
        l8.setForeground(new Color(47, 79, 79));
        l8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l8.setBounds(470, 100, 150, 23);
        contentPane.add(l8);

        JLabel l9 = new JLabel("Name");
        l9.setForeground(new Color(47, 79, 79));
        l9.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l9.setBounds(470, 130, 100, 23);
        contentPane.add(l9);


        JLabel l11 = new JLabel("Course");
        l11.setForeground(new Color(47, 79, 79));
        l11.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l11.setBounds(470, 160, 100, 23);
        contentPane.add(l11);

        JLabel l12 = new JLabel("Department");
        l12.setForeground(new Color(47, 79, 79));
        l12.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l12.setBounds(470, 190, 150, 23);
        contentPane.add(l12);

        JLabel l13 = new JLabel("Year");
        l13.setForeground(new Color(47, 79, 79));
        l13.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l13.setBounds(470, 220, 100, 23);
        contentPane.add(l13);

        JLabel l14 = new JLabel("Semester");
        l14.setForeground(new Color(47, 79, 79));
        l14.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l14.setBounds(470, 250, 100, 23);
        contentPane.add(l14);

        t8 = new JTextField();
        t8.setForeground(new Color(47, 79, 79));
        t8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t8.setBounds(610, 100, 86, 20);
        contentPane.add(t8);



        t9 = new JTextField();
        t9.setForeground(new Color(47, 79, 79));
        t9.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t9.setEditable(false);
        t9.setBounds(610, 130, 208, 20);
        contentPane.add(t9);


        t11 = new JTextField();
        t11.setForeground(new Color(47, 79, 79));
        t11.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t11.setEditable(false);
        t11.setBounds(610, 160, 208, 20);
        contentPane.add(t11);

        t12 = new JTextField();
        t12.setForeground(new Color(47, 79, 79));
        t12.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t12.setEditable(false);
        t12.setBounds(610, 190, 208, 20);
        contentPane.add(t12);

        t13 = new JTextField();
        t13.setForeground(new Color(47, 79, 79));
        t13.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t13.setEditable(false);
        t13.setBounds(610, 220, 208, 20);
        contentPane.add(t13);

        t14 = new JTextField();
        t14.setForeground(new Color(47, 79, 79));
        t14.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        t14.setEditable(false);
        t14.setBounds(610, 250, 208, 20);
        contentPane.add(t14);


        JLabel l15 = new JLabel(" Date of Issue ");
        l15.setForeground(new Color(105, 105, 105));
        l15.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l15.setBounds(80, 340, 170, 26);
        contentPane.add(l15);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(240, 340, 200, 27);
        contentPane.add(dateChooser);


        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b1.setBounds(308, 100, 90, 25);
        contentPane.add(b1);

        b2 = new JButton("Search");
        b2.addActionListener(this);
        b2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b2.setBounds(717, 100, 100, 25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        b3 = new JButton("Issue");
        b3.addActionListener(this);
        b3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b3.setBounds(470, 340, 118, 27);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        b4 = new JButton("Back");
        b4.addActionListener(this);
        b4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b4.setBounds(480, 450, 100, 27);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
    }




    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Connectivity connect = new Connectivity();
            if(ae.getSource() == b1){
                String sql = "select * from book where Book_ID = ?";
                PreparedStatement st = connect.connection.prepareStatement(sql);
                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t2.setText(rs.getString("Name"));
                    t3.setText(rs.getString("Author"));
                    t4.setText(rs.getString("Publisher"));
                    t5.setText(rs.getString("Quantity"));

                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b2){
                String sql = "select * from student where Student_Id = ?";
                PreparedStatement st = connect.connection.prepareStatement(sql);
                st.setString(1, t8.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t9.setText(rs.getString("Name"));
                    t11.setText(rs.getString("Course"));
                    t12.setText(rs.getString("Department"));
                    t13.setText(rs.getString("Year"));
                    t14.setText(rs.getString("Semester"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b3){
                try{
                    String sql = "insert into issueBook(Book_ID, BookName, Student_ID, StudentName, Course, Department, DateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = connect.connection.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, t8.getText());
                    st.setString(4, t9.getText());
                    st.setString(5, t11.getText());
                    st.setString(6, t12.getText());
                    st.setString(7, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    int i = st.executeUpdate();
                    if (i > 0)
                        JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
                    else
                        JOptionPane.showMessageDialog(null, "Error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(ae.getSource() == b4){
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
        new IssueBook().setVisible(true);

    }

}
