package LMP;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

public class librarianScreen extends JFrame {

	private JPanel contentPane;
	private JTextField BookTittleForAdd, authorName, pageCount, nameTextCust, textPhonecust, textemailCust;
	private JPasswordField textPasswordCust;
        private JPanel panelAddcust, addBookPanel;
	private JTextField studentID, textbookID, textgiveDate, pickupDate;
	private JPanel giveBookPanel;
	private DefaultTableModel table;        
	private	JPanel tablep,tablep1, tablep2;
	private JTable table_1, table_2, table_3;

	private JLabel j;
	int flag1=0, flag2=0, flag3=0;
	public JTextField textField1,textField2;
	public String gname,gtitle;

	private JScrollPane scrollPane1,scrollPane2,scrollPane3;
	private JTable table1,table2,table3;

	public librarianScreen(Librarian emp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 120, 1150, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new Color(0xffffff));






		/////////////////////UUUUUIIIIIII//////////////////////



		JLabel l1 = new JLabel("Librarian Panel");
		l1.setForeground(new Color(204, 51, 102));
		l1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
		l1.setBounds(450, 10, 701, 80);
		contentPane.add(l1);



		JLabel l3 = new JLabel("");
		ImageIcon i4  = new ImageIcon("icon/booki.png");
		Image i5 = i4.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		l3 = new JLabel(i6);
		l3.setBounds(115, 105, 60, 60);
		contentPane.add(l3);



		JLabel l5 = new JLabel("");
		l5.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon i10  = new ImageIcon("icon/studenti.png");
		Image i11 = i10.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		l5 = new JLabel(i12);
		l5.setBounds(115, 200, 60, 60);
		contentPane.add(l5);

		JLabel l6 = new JLabel("");
		ImageIcon i13  = new ImageIcon("icon/viewbook.png");
		Image i14 = i13.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);
		l6 = new JLabel(i15);
		l6.setBounds(115, 300, 60, 60);
		contentPane.add(l6);

		JLabel l7 = new JLabel("");
		ImageIcon i16  = new ImageIcon("icon/viewstudent.png");
		Image i17 = i16.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		ImageIcon i18 = new ImageIcon(i17);
		l7 = new JLabel(i18);
		l7.setBounds(115, 400, 60, 60);
		contentPane.add(l7);

		JLabel l8 = new JLabel("");
		ImageIcon i19  = new ImageIcon("icon/issuebook.png");
		Image i20 = i19.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		ImageIcon i21 = new ImageIcon(i20);
		l8 = new JLabel(i21);
		l8.setBounds(115, 500, 60, 60);
		contentPane.add(l8);


		JLabel l4 = new JLabel("");
		ImageIcon i7  = new ImageIcon("icon/viewissue.png");
		Image i8 = i7.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		l4 = new JLabel(i9);
		l4.setBounds(110, 600, 60, 60);
		contentPane.add(l4);





		j = new JLabel("");
		ImageIcon x  = new ImageIcon("icon/Library.gif");
		Image y = x.getImage().getScaledInstance(550, 550,Image.SCALE_DEFAULT);
		ImageIcon z = new ImageIcon(y);
		j = new JLabel(z);
		j.setBounds(470, 150, 550, 550);
		contentPane.add(j);





		/////////////////////////////////////////////////////







		
		JButton button = new JButton("View Books");

                button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                flag1=1;
				setBounds(500, 120, 1150, 800);
				j.setVisible(false);
				panelAddcust.setVisible(false);
				addBookPanel.setVisible(false);
				giveBookPanel.setVisible(false);
                                if (flag2==1)
                                    tablep.setVisible(false);
                                if (flag3==1)
                                    tablep2.setVisible(false);
								tablep1 = new JPanel();
				tablep1.setBounds(350, 150, 800, 700);
				tablep1.setBackground(new Color(255,255,255));
				contentPane.add(tablep1);
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
//					temp[1]=b.getTitle();
//					temp[2]=b.getAuthor();
//					temp[3]=""+b.getPageCount();
//					table.addRow(temp);
//					System.out.println("okk");
//				}
//				table_1.setModel(table);
//				table_1.setRowHeight(30);
//				table_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
//				table_1.getColumnModel().getColumn(0).setPreferredWidth(50);
//				table_1.getColumnModel().getColumn(1).setPreferredWidth(270);
//				table_1.getColumnModel().getColumn(2).setPreferredWidth(230);
//				table_1.setGridColor(new Color(244,233,34));
//				table_1.setSize(900,900);



				scrollPane1 = new JScrollPane();
				scrollPane1.setBounds(325, 150, 800, 500);
				scrollPane1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 50));
				tablep1.add(scrollPane1);

				table1 = new JTable();
				table1.setBackground(new Color(240, 248, 255));
				table1.setForeground(Color.DARK_GRAY);
				table1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
				scrollPane1.setViewportView(table1);

				try {
					Connectivity connect = new Connectivity();
					String sql = "select * from vbook";
					PreparedStatement st = connect.connection.prepareStatement(sql);
					ResultSet rs = st.executeQuery();

					table1.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					st.close();
					connect.connection.close();
				}
				catch (Exception e1) {
					System.out.println(e1);
				}


                                
			}
		});
		button.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		button.setForeground(new Color(46, 139, 87));
		button.setBackground(new Color(250, 250, 210));
		button.setBounds(70, 370, 150, 25);
		contentPane.add(button);








		JButton button_1 = new JButton("View Students");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                flag2=1;
				setBounds(500, 120, 1150, 800);
				j.setVisible(false);
				panelAddcust.setVisible(false);
				addBookPanel.setVisible(false);
				giveBookPanel.setVisible(false);
                                if (flag1==1)
                                    tablep1.setVisible(false);
                                if (flag3==1)
                                    tablep2.setVisible(false);                                
				tablep = new JPanel();
				tablep.setBounds(350, 150, 800, 700);
				tablep.setBackground(new Color(255,255,255));
				contentPane.add(tablep);
//				String col[] = {"ID","Name","Telephone","Email"};
//				table = new DefaultTableModel(col, 0);
//				table_2 = new JTable();
//				table_2.setBounds(50, 372, 532, 153);
//				tablep.add(table_2);
//				table.addRow(col);
//				String temp[]=new String[4];
//
//				Set<Student> arrayList = new HashSet<Student>();
//				arrayList.clear();
//				for(Student c:Test.lib.getStudents()){
//					arrayList.add(c);
//				}
//
//				System.out.println(arrayList);
//
//				for(Student c:Test.lib.getStudents()){
//					temp[0]=""+c.getStudentId();
//					temp[1]=c.getName();
//					temp[2]=c.getTelPhone();
//					temp[3]=c.getEmail();
//					table.addRow(temp);
//				}
//				table_2.setModel(table);
//				table_2.setRowHeight(30);
//				table_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
//				table_2.getColumnModel().getColumn(0).setPreferredWidth(50);
//				table_2.getColumnModel().getColumn(1).setPreferredWidth(200);
//				table_2.getColumnModel().getColumn(2).setPreferredWidth(200);
//				table_2.getColumnModel().getColumn(3).setPreferredWidth(200);
//				table_2.setGridColor(new Color(244,233,34));
//				table_2.setSize(900,900);


				scrollPane2 = new JScrollPane();
				scrollPane2.setBounds(325, 150, 800, 500);
				scrollPane2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 50));
				tablep.add(scrollPane2);

				table2 = new JTable();
				table2.setBackground(new Color(240, 248, 255));
				table2.setForeground(Color.DARK_GRAY);
				table2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
				scrollPane2.setViewportView(table2);

				try {
					Connectivity connect = new Connectivity();
					String sql1 = "select * from vstudent";
					PreparedStatement st = connect.connection.prepareStatement(sql1);
					ResultSet rsr = st.executeQuery();

					table2.setModel(DbUtils.resultSetToTableModel(rsr));
					rsr.close();
					st.close();
					connect.connection.close();
				}
				catch (Exception e1) {
					System.out.println(e1);
				}



			}
		});
		button_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		button_1.setForeground(new Color(46, 139, 87));
		button_1.setBackground(new Color(250, 250, 210));
		button_1.setBounds(70, 470, 150, 25);
		contentPane.add(button_1);





		//This part of class sets the visibility of unrelated panels.
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(500, 120, 1150, 800);
				j.setVisible(false);
				panelAddcust.setVisible(false);
				addBookPanel.setVisible(true);
				giveBookPanel.setVisible(false);
                                if (flag1==1)
                                    tablep1.setVisible(false);
                                if (flag2==1)
                                    tablep.setVisible(false);
                                if (flag3==1)
                                    tablep2.setVisible(false);                                
                        }
		});
		btnAddBook.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		btnAddBook.setForeground(new Color(46, 139, 87));
		btnAddBook.setBackground(new Color(250, 250, 210));
		btnAddBook.setBounds(70, 170, 150, 25);
		contentPane.add(btnAddBook);





		//This part of class sets the visibility of unrelated panels.
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		btnAddStudent.setForeground(new Color(46, 139, 87));
		btnAddStudent.setBackground(new Color(250, 250, 210));
		btnAddStudent.setBounds(70, 270, 150, 25);
		contentPane.add(btnAddStudent);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(500, 120, 1150, 800);
				j.setVisible(false);
				panelAddcust.setVisible(true);
				addBookPanel.setVisible(false);
				giveBookPanel.setVisible(false);
                                if (flag1==1)
                                    tablep1.setVisible(false);
                                if (flag2==1)
                                    tablep.setVisible(false);
                                if (flag3==1)
                                    tablep2.setVisible(false);
                        }
		});







		//This part of class sets the visibility of unrelated panels.
		JButton btnNewButton = new JButton("View Issued Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                flag3=1;
				setBounds(500, 120, 1150, 800);
				j.setVisible(false);
				panelAddcust.setVisible(false);
				addBookPanel.setVisible(false);
				giveBookPanel.setVisible(false);
                                if (flag1==1)
                                    tablep1.setVisible(false);                              
                                if (flag2==1)
                                    tablep.setVisible(false);
				tablep2 = new JPanel();
				tablep2.setBounds(300, 150, 900, 700);
				tablep2.setBackground(new Color(255,255,255));
				contentPane.add(tablep2);
//				String col[] = {"ISB ID","Name","Title","Issued Date", "Return Date"};
//				table = new DefaultTableModel(col, 0);
//				table_3 = new JTable();
//				table_3.setBounds(50, 372, 532, 153);
//				tablep2.add(table_3);
//				table.addRow(col);
//				String temp[]=new String[5];
//				for(BorrowedBook bb:Test.lib.getBorrowedBook())
//				{
//                                        temp[0]=""+bb.getId();
//                                        temp[1]=bb.getStudent().getName();
//                                        temp[2]=bb.getBook().getTitle();
//                                        temp[3]=bb.getPickUpDate();
//                                        temp[4]=bb.getDeliveryDate();
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


				scrollPane3 = new JScrollPane();
				scrollPane3.setBounds(325, 150, 800, 500);
				scrollPane3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 50));
				tablep2.add(scrollPane3);

				table3 = new JTable();
				table3.setBackground(new Color(240, 248, 255));
				table3.setForeground(Color.DARK_GRAY);
				table3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
				scrollPane3.setViewportView(table3);

				try {
					Connectivity connect = new Connectivity();
					String sql2 = "select * from vissuebook";
					PreparedStatement st = connect.connection.prepareStatement(sql2);
					ResultSet rsf = st.executeQuery();

					table3.setModel(DbUtils.resultSetToTableModel(rsf));
					rsf.close();
					st.close();
					connect.connection.close();
				}
				catch (Exception e1) {
					System.out.println(e1);
				}


			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(46, 139, 87));
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setBounds(60, 670, 170, 25);
		contentPane.add(btnNewButton);






		//This part of class sets the visibility of unrelated panels.
		JButton btnNewButton_1 = new JButton("Issue Book");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(500, 120, 1150, 800);
				j.setVisible(false);
				panelAddcust.setVisible(false);
				addBookPanel.setVisible(false);
				giveBookPanel.setVisible(true);
                                if (flag1==1)
                                    tablep1.setVisible(false);
                                if (flag2==1)
                                    tablep.setVisible(false);
                                if (flag3==1)
                                    tablep2.setVisible(false);
                        }
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		btnNewButton_1.setForeground(new Color(46, 139, 87));
		btnNewButton_1.setBackground(new Color(250, 250, 210));
		btnNewButton_1.setBounds(70, 570, 150, 25);
		contentPane.add(btnNewButton_1);




		JButton BackButton = new JButton("Logout");
		BackButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		BackButton.setForeground(new Color(46, 139, 87));
		BackButton.setBackground(new Color(250, 250, 210));
		BackButton.setBounds(70, 710, 150, 25);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
                        {
                            dispose();
                            Test.main(null);
			}
		});
		contentPane.add(BackButton);                
                
		panelAddcust = new JPanel();
		panelAddcust.setBounds(300, 100, 850, 700);
		panelAddcust.setBackground(new Color(255,255,255));
		contentPane.add(panelAddcust);
		panelAddcust.setLayout(null);


		//////.........................


		JLabel l = new JLabel("Student_ID");
		l.setForeground(new Color(25, 25, 112));
		l.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		l.setBounds(280, 60, 150, 25);
		panelAddcust.add(l);

		textField1 = new JTextField();
		Random random = new Random();
		textField1.setText("" + random.nextInt(1000 + 1));
		textField1.setEditable(false);
		textField1.setForeground(new Color(47, 79, 79));
		textField1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		textField1.setBounds(280, 90, 200, 25);
		panelAddcust.add(textField1);

		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(25, 25, 112));
		lblName.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblName.setBounds(280, 120, 150, 25);
		panelAddcust.add(lblName);

		JTextField NameText = new JTextField();
		NameText.setForeground(new Color(47, 79, 79));
		NameText.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		NameText.setBounds(280, 150, 200, 25);
		panelAddcust.add(NameText);
		NameText.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(25, 25, 112));
		lblPassword.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPassword.setBounds(280, 180, 150, 25);
		panelAddcust.add(lblPassword);

		JTextField Phone = new JTextField();
		Phone.setForeground(new Color(47, 79, 79));
		Phone.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		Phone.setBounds(280, 270, 200, 25);
		panelAddcust.add(Phone);
		Phone.setColumns(10);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setForeground(new Color(47, 79, 79));
		lblPhone.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPhone.setBounds(280, 240, 200, 25);
		panelAddcust.add(lblPhone);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(25, 25, 112));
		lblEmail.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblEmail.setBounds(280, 300, 150, 25);
		panelAddcust.add(lblEmail);

		JTextField Email = new JTextField();
		Email.setForeground(new Color(47, 79, 79));
		Email.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		Email.setBounds(280, 330, 200, 25);
		panelAddcust.add(Email);
		Email.setColumns(10);

		JTextField PasswordText = new JPasswordField();
		PasswordText.setForeground(new Color(47, 79, 79));
		PasswordText.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		PasswordText.setBounds(280, 210, 200, 25);
		panelAddcust.add(PasswordText);



		
		//This function adds student to the library.
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=NameText.getText();
				String phone=Phone.getText();
				String email= Email.getText();
				String password=PasswordText.getText();
				Student c=new Student(name, phone, email, password, Test.lib.getStudents().size()+1, true);
				Test.lib.addStudent(c);
				//JOptionPane.showMessageDialog(null,"Student is added!!");

				/// Inserting data to sql.....
				try {
					if(arg0.getSource() == btnAdd){
						try{
							Connectivity connect = new Connectivity();
							String sql = "insert into vstudent(Student_ID, Name, Phone, Email,Password) values(?, ?, ?, ?,?)";
							PreparedStatement st = connect.connection.prepareStatement(sql);
							st.setString(1, textField1.getText());
							st.setString(2, name);
							st.setString(3, phone);
							st.setString(4, email);
							st.setString(5, password);

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

				catch (Exception e){
					System.out.println(e);
				}



				try {
					File file = new File("data/student.txt");
					PrintWriter pw = new PrintWriter(new FileOutputStream(file));
					FileOutputStream fo = new FileOutputStream(file);
					for(Student cust: Test.lib.getStudents())
					{
						pw.println(cust.toString());
					}
					pw.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				

			}
		});
		btnAdd.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		btnAdd.setBounds(315, 370, 130, 33);
		btnAdd.setForeground(new Color(46, 139, 87));
		btnAdd.setBackground(new Color(250, 250, 210));
		panelAddcust.add(btnAdd);
		

		
		addBookPanel = new JPanel();
		addBookPanel.setBounds(300, 100, 850, 700);
		addBookPanel.setBackground(new Color(255,255,255));
		contentPane.add(addBookPanel);
		addBookPanel.setLayout(null);


		JLabel la = new JLabel("Book_ID");
		la.setForeground(new Color(25, 25, 112));
		la.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		la.setBounds(280, 60, 150, 25);
		addBookPanel.add(la);

		textField2 = new JTextField();
		Random randoms = new Random();
		textField2.setText("" + randoms.nextInt(1000 + 1));
		textField2.setEditable(false);
		textField2.setForeground(new Color(47, 79, 79));
		textField2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		textField2.setBounds(280, 90, 200, 25);
		addBookPanel.add(textField2);


		BookTittleForAdd = new JTextField();
		BookTittleForAdd.setForeground(new Color(25, 25, 112));
		BookTittleForAdd.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		BookTittleForAdd.setBounds(280, 150, 200, 25);
		addBookPanel.add(BookTittleForAdd);
		BookTittleForAdd.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setForeground(new Color(25, 25, 112));
		lblTitle.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblTitle.setBounds(280, 120, 150, 25);
		addBookPanel.add(lblTitle);
		
		authorName = new JTextField();
		authorName.setForeground(new Color(25, 25, 112));
		authorName.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		authorName.setBounds(280, 210, 200, 25);		addBookPanel.add(authorName);
		authorName.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setForeground(new Color(25, 25, 112));
		lblAuthor.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblAuthor.setBounds(280, 180, 150, 25);		addBookPanel.add(lblAuthor);
		
		pageCount = new JTextField();
		pageCount.setForeground(new Color(25, 25, 112));
		pageCount.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		pageCount.setBounds(280, 270, 200, 25);		addBookPanel.add(pageCount);
		pageCount.setColumns(10);
		
		JLabel lblPageCount = new JLabel("Page Count");
		lblPageCount.setForeground(new Color(25, 25, 112));
		lblPageCount.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPageCount.setBounds(280, 240, 150, 25);
		addBookPanel.add(lblPageCount);
		
		//This function adds book to the library.
		JButton bookAdd = new JButton("Add");
		bookAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String title=BookTittleForAdd.getText();
				String author=authorName.getText();
				int page=Integer.parseInt(pageCount.getText());	
				Book b=new Book(Test.lib.getBooks().size()+1,title,author,page,true);					
						//JOptionPane.showMessageDialog(null,"Book is added!!");
						Test.lib.addBook(b);

				/// Inserting data to sql.....
				try {
					if(arg0.getSource() == bookAdd){
						try{
							Connectivity connect = new Connectivity();
							String sql = "insert into vbook(Book_ID, Title, Author,Page) values(?, ?, ?, ?)";
							PreparedStatement st = connect.connection.prepareStatement(sql);
							st.setString(1, textField2.getText());
							st.setString(2, title);
							st.setString(3, author);
							st.setString(4, ""+page);


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

				catch (Exception e){
					System.out.println(e);
				}


				try {
					File file = new File("data/books.txt");
					PrintWriter pw = new PrintWriter(new FileOutputStream(file));
					FileOutputStream fo = new FileOutputStream(file);
					for(Book book:Test.lib.getBooks())
					{
						pw.println(book.yazma());
					}
					pw.close();
				} catch (FileNotFoundException e) {
                                    e.printStackTrace();
				}
			}
		});
		bookAdd.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		bookAdd.setForeground(new Color(46, 139, 87));
		bookAdd.setBackground(new Color(250, 250, 210));
		bookAdd.setBounds(320, 315, 110, 25);
		addBookPanel.add(bookAdd);
		
		  
		giveBookPanel = new JPanel();
		giveBookPanel.setBounds(300, 100, 850, 700);
		giveBookPanel.setBackground(new Color(255,255,255));
		contentPane.add(giveBookPanel);
		giveBookPanel.setLayout(null);

//////////////////////////////////////


		///////////////////////////////////////////


		JLabel lblNam = new JLabel("Student ID");
		lblNam.setForeground(new Color(25, 25, 112));
		lblNam.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblNam.setBounds(280, 120, 150, 25);
		giveBookPanel.add(lblNam);

		JTextField NamText = new JTextField();
		NamText.setForeground(new Color(47, 79, 79));
		NamText.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		NamText.setBounds(280, 150, 200, 25);
		giveBookPanel.add(NamText);
		NamText.setColumns(10);

		JLabel lblPasswor = new JLabel("Book ID");
		lblPasswor.setForeground(new Color(25, 25, 112));
		lblPasswor.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPasswor.setBounds(280, 180, 150, 25);
		giveBookPanel.add(lblPasswor);

		JTextField Phones = new JTextField();
		Phones.setForeground(new Color(47, 79, 79));
		Phones.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		Phones.setBounds(280, 270, 200, 25);
		giveBookPanel.add(Phones);
		Phone.setColumns(10);

		JLabel lblPhones = new JLabel("Delivery Date");
		lblPhones.setForeground(new Color(47, 79, 79));
		lblPhones.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblPhones.setBounds(280, 240, 200, 25);
		giveBookPanel.add(lblPhones);

		JLabel lblEmails = new JLabel("Pickup Date");
		lblEmails.setForeground(new Color(25, 25, 112));
		lblEmails.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		lblEmails.setBounds(280, 300, 150, 25);
		giveBookPanel.add(lblEmails);

		JTextField Emails = new JTextField();
		Emails.setForeground(new Color(47, 79, 79));
		Emails.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		Emails.setBounds(280, 330, 200, 25);
		giveBookPanel.add(Emails);
		Emails.setColumns(10);

		JTextField PasswordTexts = new JTextField();
		PasswordTexts.setForeground(new Color(47, 79, 79));
		PasswordTexts.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		PasswordTexts.setBounds(280, 210, 200, 25);
		giveBookPanel.add(PasswordTexts);






		//If a student's borrowed books are less than three books  and the searched book is available the book is borrowed.
		JButton giveBookButton = new JButton("Issue Now");
		giveBookButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
		  			String d1=Phones.getText();
		  			String d2=Emails.getText();
		  			//JOptionPane.showMessageDialog(null,"Done !");

					String a = NamText.getText();
					String b = PasswordTexts.getText();



					if(e.getSource() == giveBookButton){
						Connectivity connect = new Connectivity();
						try {
							String sql1 = "select * from vbook where Book_ID = ?";
							PreparedStatement st = connect.connection.prepareStatement(sql1);
							st.setString(1, b);
							ResultSet rs = st.executeQuery();

							while (rs.next()) {
								gtitle = rs.getString("Title");

							}
							st.close();
							rs.close();
						}
						catch (Exception qq) {
							System.out.println(qq);
						}

						try {
							String sql2 = "select * from vstudent where Student_Id = ?";
							PreparedStatement str = connect.connection.prepareStatement(sql2);
							str.setString(1, a);
							ResultSet rsr = str.executeQuery();

							while (rsr.next()) {
								gname = rsr.getString("Name");
							}
							str.close();
							rsr.close();
						}

						catch (Exception ex){
							System.out.println(ex);
						}

						System.out.println(a + " " + gname);
						System.out.println(b + " " + gtitle);

						try{
							String sql = "insert into vissuebook(Student_ID,Book_ID, Name,  Title, Issued_Date,Return_Date) values(?, ?, ?, ?, ?, ?)";
							PreparedStatement s = connect.connection.prepareStatement(sql);
							s.setString(1, a);
							s.setString(2, b);
							s.setString(3, gname);
							s.setString(4, gtitle);
							s.setString(5, d1);
							s.setString(6, d2);
							int i = s.executeUpdate();
							if (i > 0) {
								JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
							}
							else
								JOptionPane.showMessageDialog(null, "Error");
						}
						catch(Exception em){
							em.printStackTrace();
						}
					}
		  		}


		  });
		giveBookButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		giveBookButton.setForeground(new Color(46, 139, 87));
		giveBookButton.setBackground(new Color(250, 250, 210));
		giveBookButton.setBounds(315, 370, 130, 23);
		giveBookPanel.add(giveBookButton);




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
		  
	}
}
