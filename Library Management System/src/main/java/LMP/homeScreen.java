package LMP;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class homeScreen extends JFrame {
	
	private String name;
	private String password;
	private String type;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField textPassword;
        private int x1=200, y1=300, w=200, h=25, x2=650, y2=250;
        JLabel l2, l3, l4;
        
	public homeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 120, 1150, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                JLabel l0 = new JLabel("");
                l0.setVerticalAlignment(SwingConstants.TOP);
                ImageIcon i01  = new ImageIcon("icon/first.jpg");
                Image i02 = i01.getImage().getScaledInstance(1150, 235,Image.SCALE_DEFAULT);
                ImageIcon i03 = new ImageIcon(i02);
                l0 = new JLabel(i03);
                l0.setBounds(0, 0, 1150, 235);
                contentPane.add(l0);                

                l2 = new JLabel("");
                l2.setVerticalAlignment(SwingConstants.TOP);
                ImageIcon i1  = new ImageIcon("icon/admin.png");
                Image i2 = i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                l2 = new JLabel(i3);
                l2.setBounds(x2, y2, 300, 300);
                contentPane.add(l2);
                l2.setVisible(true);
                
                l3 = new JLabel("");
                l3.setVerticalAlignment(SwingConstants.TOP);
                ImageIcon j1  = new ImageIcon("icon/librarian.png");
                Image j2 = j1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
                ImageIcon j3 = new ImageIcon(j2);
                l3 = new JLabel(j3);
                l3.setBounds(x2, y2, 300, 300);
                contentPane.add(l3);
                l3.setVisible(false);
                
                l4 = new JLabel("");
                l4.setVerticalAlignment(SwingConstants.TOP);
                ImageIcon k1  = new ImageIcon("icon/student.png");
                Image k2 = k1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
                ImageIcon k3 = new ImageIcon(k2);
                l4 = new JLabel(k3);
                l4.setBounds(x2-30, y2, 300, 300);
                contentPane.add(l4);
                l4.setVisible(false);
                
		JLabel UserName = new JLabel("User Name:");
		UserName.setForeground(new Color(47, 79, 79));
		UserName.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));		UserName.setBounds(x1, y1, w, h);
		contentPane.add(UserName);
                
		txtUserName = new JTextField();
		txtUserName.setBounds(x1, y1+40, w+100, h+20);
		txtUserName.setForeground(new Color(47, 79, 79));
		txtUserName.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));		contentPane.add(txtUserName);
		txtUserName.setColumns(25);                
		
		JLabel Password = new JLabel("Password:");
		Password.setForeground(new Color(47, 79, 79));
		Password.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));		Password.setBounds(x1, y1+100, w, h);
		contentPane.add(Password);
                
		JLabel Type = new JLabel("Type:");
		Type.setForeground(new Color(47, 79, 79));
		Type.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));		Type.setBounds(x1, y1+200, w, h);
		contentPane.add(Type);
                
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Librarian", "Student"}));
		comboBox.setForeground(new Color(47, 79, 79));
		comboBox.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		comboBox.setBounds(x1, y1+240, w+100, h+20);
		contentPane.add(comboBox);

                comboBox.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                        String type = (String)comboBox.getSelectedItem();
                        
                        if (type=="Admin")
                        {
                            l2.setVisible(true);
                            l3.setVisible(false);
                            l4.setVisible(false);
                        }
                        if (type=="Librarian")
                        {
                            l2.setVisible(false);
                            l3.setVisible(true);
                            l4.setVisible(false);
                        }
                        if (type=="Student")
                        {
                            l2.setVisible(false);
                            l3.setVisible(false);
                            l4.setVisible(true);
                        }                        
                        
                    }

                });
                
		
		JButton btnSignin = new JButton("Sign-In");
		btnSignin.setForeground(new Color(46, 139, 87));
		btnSignin.setBackground(new Color(250, 250, 210));
		btnSignin.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource() == btnSignin){
					contentPane.removeAll();
					String name = txtUserName.getText();
					String password = textPassword.getText();
					String type = (String)comboBox.getSelectedItem();
					isExist(name,password,type);
				}
				else{
					actionPerformed(arg0);
				}

				
			}
			@SuppressWarnings("deprecation")
			private void isExist(String name, String password, String type) {
				switch(type)
				{
				case "Admin":
                                   
                                    
					if(Test.lib.getAdmin().getName().equals(name) && Test.lib.getAdmin().getPassword().equals(password)) {
						adminScreen bs=new adminScreen();
						bs.show();
						contentPane.setVisible(false);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null,"Wrong entry!!!");
					}
					
					break;
				case "Student":
                                    
					boolean flag=false;
					for(Student c:Test.lib.getStudents()) {
						if(c.getName().equals(name)&& c.getPassword().equals(password)) {
							studentScreen cs=new studentScreen(c);
							cs.show();
							contentPane.setVisible(false);
							flag=true;
							dispose();
							break;
						}
					}
					if(!flag)
						JOptionPane.showMessageDialog(null,"Wrong entry!!!");
					break;
				case "Librarian":
					flag=false;
					for(Librarian e:Test.lib.getLibrarians()) {
						if(e.getName().equals(name)&& e.getPassword().equals(password)) {
							librarianScreen es=new librarianScreen(e);
							es.show();
							contentPane.setVisible(false);
							flag=true;                                                    
							dispose();
							break;
						}
					}
					if(!flag)
						JOptionPane.showMessageDialog(null,"Wrong entry!!!");
					break;
				}
			
			}
			
			
		});
		btnSignin.setBounds(x2+50, y1+250, 150, 35);
		contentPane.add(btnSignin);
                               
		textPassword = new JPasswordField();
		textPassword.setBounds(x1, y1+140, w+100, h+20);
		textPassword.setForeground(new Color(47, 79, 79));
		textPassword.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
		contentPane.add(textPassword);
		
	}
}
