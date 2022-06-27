package LMP;


public abstract class Person {
 
	private String name;
	private String telPhone;        
        private String email;
	private String password;
	
	public Person(String name, String telPhone, String email, String password) {
		super();
		this.name = name;
		this.telPhone = telPhone;
		this.email = email;
		this.password = password;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getTelPhone() {
		return telPhone;
	}


	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}

