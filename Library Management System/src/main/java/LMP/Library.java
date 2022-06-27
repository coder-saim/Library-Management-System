package LMP;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	private ArrayList<Librarian> librarians;
	private ArrayList<Student> students;
	private Admin admin;
	private ArrayList<BorrowedBook> borrowedBook;
	
	public Library() {
		//super();
		this.books =new ArrayList<Book>();
		this.librarians = new ArrayList<Librarian>() ;
		this.students = new ArrayList<Student>();
		this.borrowedBook = new ArrayList<BorrowedBook>();
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public ArrayList<Librarian> getLibrarians() {
		return librarians;
	}
	public void setLibrarians(ArrayList<Librarian> librarians) {
		this.librarians = librarians;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public ArrayList<BorrowedBook> getBorrowedBook() {
		return borrowedBook;
	}
	public void setBorrowedBook(ArrayList<BorrowedBook> borrowedBook) {
		this.borrowedBook = borrowedBook;
	}
	
	public void addBook(Book b)
	{
		books.add(b);
	}
	
	public void addStudent(Student c)
	{
		students.add(c);
	}
	public void addLibrarian(Librarian c)
	{
		librarians.add(c);
	}

	public void addBorrowedBook(BorrowedBook bb)
	{
		this.borrowedBook.add(bb);
	
	}
	public void deleteBorrowedBook(BorrowedBook bb)
	{
		if(!this.borrowedBook.contains(bb))
		{
			System.out.println("this operations can not find");
			return ;
		}
		for(int i=0;i<this.borrowedBook.size();i++)
		{
			if(this.borrowedBook.get(i).getId()==(bb.getId()))
			{
				 this.borrowedBook.remove(i);
			}
		}
	}
	public void listBorrowedBook()
	{
		for(int i=0;i<this.borrowedBook.size();i++)
		{
			this.borrowedBook.get(i).toString();
		}
		
	}
	public Librarian findLibrarian(int id) {
		for(Librarian e:this.librarians)
		{
			if(e.getID()==id)
			{
				return e;
			}
		}
		return null;
	}
	
	
	
}
