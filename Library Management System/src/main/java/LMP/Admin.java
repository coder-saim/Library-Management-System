package LMP;

import java.util.ArrayList;


public class Admin extends Person {
	public Admin(String name, String telPhone, String email, String password) 
        {
		super(name, telPhone, email, password);
	}
	public void addEmployee(Student e)
	{
		Test.lib.addStudent(e);
	}	
	
	
}
