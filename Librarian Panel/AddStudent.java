package library.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;


public class AddStudent extends JFrame implements ActionListener{

    private JPanel contentPane;

    private JTextField textField1;
    private JTextField textField2;

    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;

    private JButton button1;
    private JButton button2;

    public void random() {
        Random random = new Random();
        textField1.setText("" + random.nextInt(1000 + 1));
    }


    public AddStudent(){
        super("Add Student");
        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel l = new JLabel("Add Student");
        l.setForeground(new Color(204, 51, 102));
        l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l.setBounds(380, 15, 701, 80);
        contentPane.add(l);


        JLabel l1 = new JLabel("Student_ID");
        l1.setForeground(new Color(25, 25, 112));
        l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l1.setBounds(300, 100, 150, 25);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(25, 25, 112));
        l2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l2.setBounds(300, 130, 150, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Course");
        l3.setForeground(new Color(25, 25, 112));
        l3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l3.setBounds(300, 160, 150, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Department");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l4.setBounds(300, 190, 150, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Year");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l5.setBounds(300, 220, 150, 22);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Semester");
        l6.setForeground(new Color(25, 25, 112));
        l6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        l6.setBounds(300, 250, 150, 22);
        contentPane.add(l6);



        textField1 = new JTextField();
        textField1.setEditable(false);
        textField1.setForeground(new Color(47, 79, 79));
        textField1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField1.setBounds(430, 100, 156, 20);
        contentPane.add(textField1);


        textField2 = new JTextField();
        textField2.setForeground(new Color(47, 79, 79));
        textField2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        textField2.setBounds(430, 130, 156, 20);
        contentPane.add(textField2);


        comboBox1 = new JComboBox();
        comboBox1.setModel(new DefaultComboBoxModel(new String[] {  "CSE","EEE", "IIT","Mechanical", "Civil", "Other" }));
        comboBox1.setForeground(new Color(47, 79, 79));
        comboBox1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        comboBox1.setBounds(430, 160, 154, 25);
        contentPane.add(comboBox1);

        comboBox2 = new JComboBox();
        comboBox2.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
        comboBox2.setForeground(new Color(47, 79, 79));
        comboBox2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        comboBox2.setBounds(430, 190, 154, 25);
        contentPane.add(comboBox2);

        comboBox3 = new JComboBox();
        comboBox3.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd" }));
        comboBox3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        comboBox3.setForeground(new Color(47, 79, 79));
        comboBox3.setBounds(430, 220, 154, 25);
        contentPane.add(comboBox3);

        comboBox4 = new JComboBox();
        comboBox4.setModel(new DefaultComboBoxModel(new String[] { "B.Sc", "MBA", "BBA", "BCA", "M.Sc", "B.Com", "M.Com" }));
        comboBox4.setForeground(new Color(47, 79, 79));
        comboBox4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        comboBox4.setBounds(430, 250, 154, 25);
        contentPane.add(comboBox4);


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

            if(ae.getSource() == button1){
                try{
                    Connectivity connect = new Connectivity();
                    String sql = "insert into student(Student_ID, Name, Course, Department, Year, Semester) values(?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = connect.connection.prepareStatement(sql);
                    st.setString(1, textField1.getText());
                    st.setString(2, textField2.getText());
                    st.setString(3, (String) comboBox4.getSelectedItem());
                    st.setString(4, (String) comboBox1.getSelectedItem());
                    st.setString(5, (String) comboBox2.getSelectedItem());
                    st.setString(6, (String) comboBox3.getSelectedItem());

                    int i = st.executeUpdate();

                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        this.setVisible(false);
                        new Librarian().setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error");
                    }

                    st.close();
                    connect.connection.close();
                 }

                catch(Exception e){
                    e.printStackTrace();
                }
            }

            if(ae.getSource() == button2){
                this.setVisible(false);
                new Librarian().setVisible(true);
            }

        }



        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new AddStudent().setVisible(true);
    }
}
