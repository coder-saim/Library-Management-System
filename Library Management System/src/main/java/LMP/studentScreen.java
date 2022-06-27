package LMP;

import net.proteanit.sql.DbUtils;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class studentScreen extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel table;
	private	JPanel tablep;
	private	JPanel tablep1;
	private JTable table_1;
	private JTable table_3;

	private JLabel j;

	public studentScreen(Student c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 120, 1150, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new Color(0xffffff));




		/////////////////////UUUUUIIIIIII//////////////////////



		JLabel l1 = new JLabel("Student Panel");
		l1.setForeground(new Color(250, 51, 102));
		l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
		l1.setBounds(450, 10, 701, 80);
		contentPane.add(l1);

		JLabel l2 = new JLabel("");
		l2.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon i1  = new ImageIcon("icon/studenti.png");
		Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l2 = new JLabel(i3);
		l2.setBounds(100, 150, 100, 100);
		contentPane.add(l2);

		JLabel l3 = new JLabel("");
		ImageIcon i4  = new ImageIcon("icon/viewstudent.png");
		Image i5 = i4.getImage().getScaledInstance(90, 90,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		l3 = new JLabel(i6);
		l3.setBounds(100, 330, 90, 90);
		contentPane.add(l3);

		JLabel l4 = new JLabel("");
		ImageIcon i7  = new ImageIcon("icon/logout.png");
		Image i8 = i7.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		l4 = new JLabel(i9);
		l4.setBounds(90, 500, 100, 100);
		contentPane.add(l4);



		/////////////////////////////////////////////////////



		//This function creates table of borrowed books by their deadline.
		JButton Deadline = new JButton("View Books");
		Deadline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.setVisible(false);
				setBounds(500, 120, 1150, 800);
				tablep1 = new JPanel();
//				tablep1.setBounds(350, 150, 800, 700);
//				tablep1.setBackground(new Color(255,255,255));
//				contentPane.add(tablep1);
//				String col[] = {"ID","Title","Author","Page"};
//				table = new DefaultTableModel(col, 0);
//				table_1 = new JTable();
//				table_1.setBounds(50, 372, 532, 153);
//				tablep1.add(table_1);
//				table.addRow(col);
//				String temp[]=new String[4];
//				for(Book b:Test.lib.getBooks())
//				{
//					temp[0]=""+b.getId();
//                                        temp[1]=b.getTitle();
//					temp[2]=b.getAuthor();
//					temp[3]=""+b.getPageCount();
//					table.addRow(temp);
//				}
//				table_1.setModel(table);
//				table_1.setRowHeight(30);
//				table_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
//				table_1.getColumnModel().getColumn(0).setPreferredWidth(50);
//				table_1.getColumnModel().getColumn(1).setPreferredWidth(270);
//				table_1.getColumnModel().getColumn(2).setPreferredWidth(230);
//				table_1.setGridColor(new Color(244,233,34));
//				table_1.setSize(900,900);


				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(325, 150, 800, 500);
				scrollPane.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 50));
				contentPane.add(scrollPane);

				JTable table = new JTable();
				table.setBackground(new Color(240, 248, 255));
				table.setForeground(Color.DARK_GRAY);
				table.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
				scrollPane.setViewportView(table);

				try {
					Connectivity connect = new Connectivity();
					String sql = "select * from vbook";
					PreparedStatement st = connect.connection.prepareStatement(sql);
					ResultSet rs = st.executeQuery();

					table.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					st.close();
					connect.connection.close();
				}
				catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		Deadline.setBounds(70, 260, 150, 35);
		Deadline.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		Deadline.setForeground(new Color(46, 139, 87));
		Deadline.setBackground(new Color(250, 250, 210));
		contentPane.add(Deadline);
		
		//This function creates table of borrowed books.
		JButton listborrowed = new JButton("List Issued Book");
		listborrowed.setBounds(60, 430, 170, 35);
		listborrowed.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		listborrowed.setForeground(new Color(46, 139, 87));
		listborrowed.setBackground(new Color(250, 250, 210));
		listborrowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.setVisible(false);
				setBounds(500, 120, 1150, 800);
				tablep = new JPanel();
//				tablep.setBounds(300, 150, 900, 700);
//				tablep.setBackground(new Color(255,255,255));
//				contentPane.add(tablep);
//				String col[] = {"Id","Title","Author","PageCount","Deadline"};
//				table = new DefaultTableModel(col, 0);
//				table_3 = new JTable();
//				table_3.setBounds(50, 372, 532, 153);
//				tablep.add(table_3);
//				table.addRow(col);
//				String temp[]=new String[5];
//				for(BorrowedBook b:c.getStudentBorrowedBook())
//				{
//					temp[0]=Integer.toString(b.getBook().getId());
//					temp[1]=b.getBook().getTitle();
//					temp[2]=b.getBook().getAuthor();
//					temp[3]=Integer.toString(b.getBook().getPageCount());
//					temp[4]=b.getDeliveryDate();
//					table.addRow(temp);
//				}
//				table_3.setModel(table);
//				table_3.setRowHeight(30);
//				table_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
//				table_3.getColumnModel().getColumn(0).setPreferredWidth(50);
//				table_3.getColumnModel().getColumn(1).setPreferredWidth(150);
//				table_3.getColumnModel().getColumn(2).setPreferredWidth(250);
//				table_3.getColumnModel().getColumn(3).setPreferredWidth(150);
//				table_3.getColumnModel().getColumn(4).setPreferredWidth(150);
//				table_3.setGridColor(new Color(244,233,34));
//				table_3.setSize(900,900);


				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(325, 150, 800, 500);
				scrollPane.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 50));
				contentPane.add(scrollPane);

				JTable table = new JTable();
				table.setBackground(new Color(240, 248, 255));
				table.setForeground(Color.DARK_GRAY);
				table.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
				scrollPane.setViewportView(table);

				try {
					Connectivity connect = new Connectivity();
					String sql = "select * from vissuebook";
					PreparedStatement st = connect.connection.prepareStatement(sql);
					ResultSet rs = st.executeQuery();

					table.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					st.close();
					connect.connection.close();
				}
				catch (Exception e1) {
					System.out.println(e1);
				}


			}
		});
		contentPane.add(listborrowed);
                
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(70, 600, 150, 35);
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(46, 139, 87));
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
                        {
                            dispose();
                            Test.main(null);
			}
		});
		contentPane.add(btnNewButton);


		j = new JLabel("");
		ImageIcon x  = new ImageIcon("icon/Library.gif");
		Image y = x.getImage().getScaledInstance(550, 550,Image.SCALE_DEFAULT);
		ImageIcon z = new ImageIcon(y);
		j = new JLabel(z);
		j.setBounds(470, 150, 550, 550);
		contentPane.add(j);



		JLabel v = new JLabel("");
		ImageIcon a  = new ImageIcon("icon/vertical.png");
		Image b = a.getImage().getScaledInstance(300, 680,Image.SCALE_DEFAULT);
		ImageIcon cc = new ImageIcon(b);
		v = new JLabel(cc);
		v.setBounds(0, 100, 300, 680);
		v.setVerticalAlignment(JLabel.CENTER);
		v.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(v);


		JLabel h = new JLabel("");
		ImageIcon e  = new ImageIcon("icon/horizontal.png");
		Image f = e.getImage().getScaledInstance(1150, 100,Image.SCALE_DEFAULT);
		ImageIcon g = new ImageIcon(f);
		h = new JLabel(g);
		h.setBounds(0, 0, 1150, 100);
		contentPane.add(h);

	}
}
