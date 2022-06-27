package LMP;

import java.util.ArrayList;

public class Librarian extends Person{
	
	private int ID;
	public Librarian(String name, String telPhone, String email, String password,int ID) {
		super(name, telPhone, email, password);
		this.ID=ID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return ""+ID;
	}
	
	public void addBook(Book b)
	{
		Test.lib.addBook(b);
	}
	
	public void addCustomer(Student c)
	{
		Test.lib.addStudent(c);
	}
	public String yazma()
	{
		return  getName()+"\t"+getTelPhone().toString()+"\t"+getEmail()+"\t"+getPassword()+"\t"+ID;
	}
}
