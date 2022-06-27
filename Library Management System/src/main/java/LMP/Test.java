package LMP;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test {
	public static Library lib= new Library();
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			FileInputStream fStream=new FileInputStream("data/admin.txt");
			DataInputStream dStream=new DataInputStream(fStream);
			BufferedReader bReader=new BufferedReader(new InputStreamReader(dStream));
			String str=bReader.readLine();
			while(str!=null) {
				String []data=str.split("\t");
				Admin admin=new Admin(data[0],data[1],data[4],data[5]);
				lib.setAdmin(admin);
				str=bReader.readLine();
			}

			fStream=new FileInputStream("data/student.txt");
			dStream=new DataInputStream(fStream);
			bReader=new BufferedReader(new InputStreamReader(dStream));
			String str1=bReader.readLine();
			while(str1!=null) {
				String []data1=str1.split("\t");
				//Phone phone=new Phone(Integer.valueOf(data1[2]),Integer.valueOf(data1[3]),Integer.valueOf(data1[4]));
				Student student=new Student(data1[0],data1[1],data1[2],data1[3],Integer.parseInt(data1[4]),Boolean.parseBoolean(data1[5]));
				lib.addStudent(student);
				str1=bReader.readLine();
			}

			fStream=new FileInputStream("data/librarian.txt");
			dStream=new DataInputStream(fStream);
			bReader=new BufferedReader(new InputStreamReader(dStream));
			String str2=bReader.readLine();
			while(str2!=null) {

				String []data1=str2.split("\t");
				Librarian emp=new Librarian(data1[0],data1[1],data1[2],data1[3],Integer.parseInt(data1[4]));
				lib.addLibrarian(emp);
				str2=bReader.readLine();
			}
			fStream=new FileInputStream("data/books.txt");
			dStream=new DataInputStream(fStream);
			bReader=new BufferedReader(new InputStreamReader(dStream));
			str2=bReader.readLine();
			while(str2!=null) {
				String []data1=str2.split("\t");
				Book b=new Book(Integer.parseInt(data1[0]),data1[1],data1[2],Integer.parseInt(data1[3]),Boolean.parseBoolean(data1[4]));
				lib.addBook(b);
                                str2=bReader.readLine();
			}
			fStream=new FileInputStream("data/borrowedBook.txt");
			dStream=new DataInputStream(fStream);
			bReader=new BufferedReader(new InputStreamReader(dStream));
			str2=bReader.readLine();
			while(str2!=null) {
				String []data1=str2.split("\t");
				String d1=data1[3];
				String d2=data1[4];
				BorrowedBook bb=new BorrowedBook(Integer.parseInt(data1[0]),lib.getStudents().get(Integer.parseInt(data1[1])-2),lib.getBooks().get(Integer.parseInt(data1[2])-1),d1,d2);
				
                                lib.addBorrowedBook(bb);
				lib.getStudents().get(Integer.parseInt(data1[1])-2).addBorrowedBook(bb);
				str2=bReader.readLine();
			}

			dStream.close();
			fStream.close();
			bReader.close();
			homeScreen swing=new homeScreen();
			swing.show();			
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}
}
