package LMP;

import java.util.LinkedList;
import java.util.Queue;

public class Book{

	private int id;
	private String title;
	private String author;
	private int pageCount;
	private Queue<Student> customerWantedList ;
	private boolean status;
        
	public Book(int id,String title, String author, int pageCount,boolean status) {
		super();
		this.id=id;
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.customerWantedList = new LinkedList<Student>();
		this.status=status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public Queue<Student> getStudentWantedList() {
		return customerWantedList;
	}
	public void setStudentWantedList(Queue<Student> customerWantedList) {
		this.customerWantedList = customerWantedList;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void addPersonToWanted(Person p){
		this.customerWantedList.add((Student) p);
	}
	public void deletePersonFromWanted(Person p){
		if(this.customerWantedList.isEmpty())
			return;
		if(this.customerWantedList.contains(p))
		{
			while(this.customerWantedList.peek()!=p)
			{
				Person temp=this.customerWantedList.poll();
				this.customerWantedList.add((Student) temp);
			}
			this.customerWantedList.poll();
		}
		else
		{
			System.out.println("This person not exists");
		}
	}
	public boolean isAvailable() {
		return this.status;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author +
                        ", pageCount=" + pageCount + ", customerWantedList="
				+ customerWantedList + ", status=" + status + "]";
	}
	public String yazma() {
		return getId()+"\t"+getTitle()+ "\t"+getAuthor()+"\t"+getPageCount()+"\t"+isStatus();
	}
}
