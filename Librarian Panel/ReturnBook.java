package library.management.system;



import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;


public class ReturnBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JDateChooser dateChooser;


    public void delete() {
        try {
            Connectivity connect = new Connectivity();
            String sql = "delete from issueBook where book_id=?";
            PreparedStatement st = connect.connection.prepareStatement(sql);
            st.setString(1, textField.getText());
            int i = st.executeUpdate();
            if (i > 0)
                JOptionPane.showMessageDialog(null, "Book Returned Successfully");
            else
                JOptionPane.showMessageDialog(null, "Error in Deleting");
        }

        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }




    public ReturnBook() {
        super("Return Book");
        setBounds(500, 120, 1000, 800);
        contentPane = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);


        JLabel l = new JLabel("Return Book");
        l.setForeground(new Color(204, 51, 102));
        l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l.setBounds(380, 15, 701, 80);
        contentPane.add(l);

        JLabel l1 = new JLabel("Book_ID");
        l1.setForeground(new Color(0, 0, 0));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l1.setBounds(160, 100, 150, 24);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Student_ID");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(530, 100, 150, 24);
        contentPane.add(l2);

        JLabel l3 = new JLabel("BookName");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l3.setBounds(160, 130, 150, 24);
        contentPane.add(l3);

        JLabel l4 = new JLabel("StudentName");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l4.setBounds(530, 130, 150, 24);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Course");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l5.setBounds(160, 160, 150, 24);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Department");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l6.setBounds(530, 160, 150, 24);
        contentPane.add(l6);

        JLabel l7 = new JLabel("Date of Issue");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l7.setBounds(160, 190, 150, 29);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Date of Return");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l8.setBounds(160, 220, 150, 29);
        contentPane.add(l8);

        textField = new JTextField();
        textField.setForeground(new Color(105, 105, 105));
        textField.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField.setBounds(310, 100, 150, 25);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setForeground(new Color(105, 105, 105));
        textField_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField_1.setBounds(700, 100, 150, 25);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        button1 = new JButton("Search");
        button1.addActionListener(this);
        button1.setBounds(870, 100, 100, 25);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        contentPane.add(button1);

        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setForeground(new Color(0, 100, 0));
        textField_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField_2.setBounds(310, 130, 162, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setForeground(new Color(0, 100, 0));
        textField_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField_3.setColumns(10);
        textField_3.setBounds(700, 130, 179, 20);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setEditable(false);
        textField_4.setForeground(new Color(0, 100, 0));
        textField_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField_4.setColumns(10);
        textField_4.setBounds(310, 160, 162, 20);
        contentPane.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setForeground(new Color(0, 100, 0));
        textField_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField_5.setEditable(false);
        textField_5.setColumns(10);
        textField_5.setBounds(700, 160, 179, 20);
        contentPane.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setForeground(new Color(0, 100, 0));
        textField_6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField_6.setEditable(false);
        textField_6.setColumns(10);
        textField_6.setBounds(310, 190, 162, 20);
        contentPane.add(textField_6);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        dateChooser.setBounds(310, 220, 172, 29);
        contentPane.add(dateChooser);

        button2 = new JButton("Return");
        button2.addActionListener(this);
        button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button2.setBounds(280, 321, 150, 33);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        contentPane.add(button2);

        button3 = new JButton("Back");
        button3.addActionListener(this);
        button3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        button3.setBounds(500, 321, 150, 33);
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        contentPane.add(button3);


    }




    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Connectivity connect = new Connectivity();
            if(ae.getSource() == button1){
                String sql = "select * from issueBook where Student_ID = ? and Book_ID =?";
                PreparedStatement st = connect.connection.prepareStatement(sql);
                st.setString(1, textField_1.getText());
                st.setString(2, textField.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    textField_2.setText(rs.getString("BookName"));
                    textField_3.setText(rs.getString("StudentName"));
                    textField_4.setText(rs.getString("Course"));
                    textField_5.setText(rs.getString("Department"));
                    textField_6.setText(rs.getString("DateOfIssue"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == button2){
                String sql = "insert into returnBook(Book_ID, BookName, Student_ID,  StudentName, Course, Department, DateOfIssue, DateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = connect.connection.prepareStatement(sql);
                st.setString(1, textField.getText());
                st.setString(2, textField_2.getText());
                st.setString(3, textField_1.getText());
                st.setString(4, textField_3.getText());
                st.setString(5, textField_4.getText());
                st.setString(6, textField_5.getText());
                st.setString(7, textField_6.getText());
                st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());

                int i = st.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Processing...");
                    delete();
                }
                else
                    JOptionPane.showMessageDialog(null, "Error");

            }

            if(ae.getSource() == button3){
                this.setVisible(false);
                new Librarian().setVisible(true);

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }



    public static void main(String[] args) {
        new ReturnBook().setVisible(true);
    }
}
