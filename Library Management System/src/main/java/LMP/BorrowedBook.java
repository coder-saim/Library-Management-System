package LMP;

public class BorrowedBook 
{
	private int id;
	private Student customer;
	private Book book;
	private String borrowedDate;
	private String returnDate;
        
	public BorrowedBook(int id,Student customer, Book book, String borrowedDate, String returnDate) {
		super();
		this.id=id;
		this.customer = customer;
		this.book = book;
		this.borrowedDate = borrowedDate;
		this.returnDate = returnDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return customer;
	}
	public void setStudent(Student customer) {
		this.customer = customer;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getPickUpDate() {
		return borrowedDate;
	}
	public void setPickUpDate(String borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public String getDeliveryDate() {
		return returnDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.returnDate = deliveryDate;
	}
	@Override
	public String toString() {
		return "customer name=" +  customer.getName() + ", book title=" + book.getTitle() + ", pickUpDate=" + borrowedDate
				+ ", deliveryDate=" + returnDate;
	}
	public String yazma(){
		return id+"\t"+customer.getStudentId()+"\t"+book.getId()+"\t"+borrowedDate.toString()+"\t"+returnDate.toString();
	}
}
