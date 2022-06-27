package LMP;

import java.util.ArrayList;

public class Student extends Person{

	private int studentId;
	private ArrayList<Book> readBook;
	private ArrayList<BorrowedBook> studentBorrowedBook;
	private boolean status;
	
	public Student(String name, String telPhone, String email, String password, int studentId, boolean status) 
        {
		super(name, telPhone, email, password);
		this.studentId = studentId;
		this.readBook = new ArrayList<Book>();
		this.studentBorrowedBook = new ArrayList<BorrowedBook>();
		this.status = status;
	}	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public ArrayList<Book> getReadBooks() {
		return this.readBook;
	}
	public void setReadBooks(ArrayList<Book> readBooks) {
		this.readBook = readBooks;
	}
	public ArrayList<BorrowedBook> getStudentBorrowedBook() {
		return studentBorrowedBook;
	}
	public void setStudentBorrowedBook(ArrayList<BorrowedBook> studentBorrowedBook) {
		this.studentBorrowedBook = studentBorrowedBook;
	}
	public boolean isStatus(){
		return status;
	}
	public void addBorrowedBook(BorrowedBook bb){
		this.studentBorrowedBook.add(bb);
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void learnDeadline(){
		for(int i=0;i<this.studentBorrowedBook.size();i++)
		{
			System.out.println("Book name :"+studentBorrowedBook.get(i).getBook().getTitle()+" deadline : "+studentBorrowedBook.get(i).getDeliveryDate());
		}
	}
	//This function lists students borrowed books.
	public void listStudentBorrowedBook(){
		for(int i=0;i<this.studentBorrowedBook.size();i++)
		{
			System.out.println(this.studentBorrowedBook.get(i).toString());
		}
	}
	@Override
	public String toString() {
		return getName()+"\t"+getTelPhone().toString()+"\t"+getEmail()+"\t"+getPassword()+"\t"+getStudentId()+"\t"+isStatus();
	}
}
