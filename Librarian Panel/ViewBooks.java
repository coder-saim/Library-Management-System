package library.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.awt.event.*;


public class ViewBooks extends JFrame{

    private JPanel contentPane;
    private JTable table;


    public void Book() {
        try {
            Connectivity connect = new Connectivity();
            String sql = "select * from book";
            PreparedStatement st = connect.connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            connect.connection.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }



    public ViewBooks(){
        super("View Books");
        setBounds(500, 120, 1000, 800);
        contentPane = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(100, 130, 800, 500);
        scrollPane.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 50));
        contentPane.add(scrollPane);

        table = new JTable();
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        scrollPane.setViewportView(table);


        JLabel l = new JLabel("Book Details");
        l.setForeground(new Color(204, 51, 102));
        l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
        l.setBounds(380, 15, 701, 80);
        contentPane.add(l);


        Book();
    }




    public static void main(String[] args) {
        new ViewBooks().setVisible(true);
    }
}
