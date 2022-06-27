package LMP;

import net.proteanit.sql.DbUtils;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class adminScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField NameText;
	private JPanel AddLibrarianPanel;
	private JTextField Phone;
	private JTextField Email;
	private JPasswordField PasswordText;
	private DefaultTableModel table;
	private	JPanel tablep;
	private JTable table_2;
	private int flag=0;

	private JTextField textField1;

	private JLabel j;


	private JButton button1;
	private JButton button2;
	private JButton button3;

        
	public adminScreen() {
		setBounds(500, 120, 1150, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new Color(0xffffff));



		/////////////////////UUUUUIIIIIII//////////////////////



		JLabel l1 = new JLabel("Admin Panel");
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

		//This part of class sets the visibility of unrelated panels.
		button1 = new JButton("View Librarians");
		button1.setBounds(70, 260, 150, 35);
		button1.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e){
            flag=1;
			j.setVisible(false);
			AddLibrarianPanel.setVisible(false);
			tablep = new JPanel();
//			tablep.setBounds(450, 150, 600, 700);
//			tablep.setBackground(new Color(255,255,255));
//			contentPane.add(tablep);
//			String col[] = {"Id","Name","Phone","Email"};
//			table = new DefaultTableModel(col, 0);
//			table_2 = new JTable();
//			//table_2.setBounds(50, 372, 532, 153)
//
//
//
//
//
//
//			tablep.add(table_2);
//			table.addRow(col);
//			String temp[]=new String[4];
//			for(Librarian emp:Test.lib.getLibrarians()){
//				temp[0]=emp.toString();
//				temp[1]=emp.getName();
//				temp[2]=emp.getTelPhone();
//				temp[3]=emp.getEmail();
//				table.addRow(temp);
//			}
//
//			table_2.setModel(table);
//			table_2.setRowHeight(30);
//			table_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
//			table_2.getColumnModel().getColumn(3).setPreferredWidth(200);
//			table_2.getColumnModel().getColumn(2).setPreferredWidth(200);
//			table_2.setGridColor(new Color(244,233,34));
//			table_2.setSize(900,900);
//						//tablep.setVisible(true);


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
				String sql = "select * from vlibrarian";
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

		button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		button1.setForeground(new Color(46, 139, 87));
		button1.setBackground(new Color(250, 250, 210));
		contentPane.add(button1);


		//This part of class sets the visibility of unrelated panels.
		button2 = new JButton("Add librarian");
		button2.setBounds(70, 430, 150, 35);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(500, 120, 1150, 800);
				AddLibrarianPanel.setVisible(true);
                                if (flag==1)
                                    tablep.setVisible(false);
			}
		});
		button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		button2.setForeground(new Color(46, 139, 87));
		button2.setBackground(new Color(250, 250, 210));
		contentPane.add(button2);

		//This part of class sets the visibility of unrelated panels.
		button3 = new JButton("Logout");
		button3.setBounds(70, 600, 150, 35);
		button3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		button3.setForeground(new Color(46, 139, 87));
		button3.setBackground(new Color(250, 250, 210));
		contentPane.add(button3);

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
                        {  
                            dispose();
                            Test.main(null);
			}
		});                

		AddLibrarianPanel = new JPanel();
		AddLibrarianPanel.setBounds(300, 100, 850, 700);
		AddLibrarianPanel.setBackground(new Color(255,255,255));
		contentPane.add(AddLibrarianPanel);
		AddLibrarianPanel.setVisible(false);
		AddLibrarianPanel.setLayout(null);

		//When add button is selected a new librarian is added to the library.
		JButton AddButton = new JButton("Add Data");
		AddButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		AddButton.setBounds(315, 370, 130, 33);
		AddButton.setForeground(new Color(46, 139, 87));
		AddButton.setBackground(new Color(250, 250, 210));
		AddLibrarianPanel.add(AddButton);
		AddButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {


				try{
					setBounds(500, 120, 1150, 800);
				String name=NameText.getText();
				String password=PasswordText.getText();
				String email=Email.getText();
				String phone=Phone.getText();
				//Phone p=new Phone(Integer.parseInt(phone[0]),Integer.parseInt(phone[1]),Integer.parseInt(phone[2]));
				Librarian librarian=new Librarian(name,phone,email,password,Test.lib.getLibrarians().size()+1);
				//JOptionPane.showMessageDialog(null,"Librarian is added!!");
				Test.lib.addLibrarian(librarian);
				File file = new File("data/librarian.txt");
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));
				FileOutputStream fo = new FileOutputStream(file);
				for(Librarian e:Test.lib.getLibrarians())
				{
					pw.println(e.yazma());
				}
				pw.close();
				}

				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Wrong entry!!");
				}



				if(arg0.getSource() == AddButton){
					try{
						Connectivity connect = new Connectivity();
						String sql = "insert into vlibrarian(Librarian_ID, Name, Phone, Email, Password) values(?, ?, ?, ?, ?)";
						PreparedStatement st = connect.connection.prepareStatement(sql);
						st.setString(1, ""+textField1.getText());
						st.setString(2, NameText.getText());
						st.setString(3, Phone.getText());
						st.setString(4, Email.getText());
						st.setString(5, PasswordText.getText());


						int i = st.executeUpdate();

						if (i > 0){
							JOptionPane.showMessageDialog(null, "Successfully Added");
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





			}

		});



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
		ImageIcon c = new ImageIcon(b);
		v = new JLabel(c);
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










		JLabel l = new JLabel("Librarian_ID");
		l.setForeground(new Color(25, 25, 112));
		l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		l.setBounds(280, 60, 150, 25);
		AddLibrarianPanel.add(l);

		textField1 = new JTextField();
		Random random = new Random();
		textField1.setText("" + random.nextInt(1000 + 1));
		textField1.setEditable(false);
		textField1.setForeground(new Color(47, 79, 79));
		textField1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		textField1.setBounds(280, 90, 200, 25);
		AddLibrarianPanel.add(textField1);


		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(25, 25, 112));
		lblName.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblName.setBounds(280, 120, 150, 25);
		AddLibrarianPanel.add(lblName);

		NameText = new JTextField();
		NameText.setForeground(new Color(47, 79, 79));
		NameText.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		NameText.setBounds(280, 150, 200, 25);
		AddLibrarianPanel.add(NameText);
		NameText.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(25, 25, 112));
		lblPassword.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPassword.setBounds(280, 180, 150, 25);
		AddLibrarianPanel.add(lblPassword);

		Phone = new JTextField();
		Phone.setForeground(new Color(47, 79, 79));
		Phone.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		Phone.setBounds(280, 270, 200, 25);
		AddLibrarianPanel.add(Phone);
		Phone.setColumns(10);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setForeground(new Color(47, 79, 79));
		lblPhone.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPhone.setBounds(280, 240, 200, 25);
		AddLibrarianPanel.add(lblPhone);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(25, 25, 112));
		lblEmail.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblEmail.setBounds(280, 300, 150, 25);
		AddLibrarianPanel.add(lblEmail);

		Email = new JTextField();
		Email.setForeground(new Color(47, 79, 79));
		Email.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		Email.setBounds(280, 330, 200, 25);
		AddLibrarianPanel.add(Email);
		Email.setColumns(10);
		
		PasswordText = new JPasswordField();
		PasswordText.setForeground(new Color(47, 79, 79));
		PasswordText.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		PasswordText.setBounds(280, 210, 200, 25);
		AddLibrarianPanel.add(PasswordText);














	}
}
