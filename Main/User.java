package Main;

import sqldatabase.Query;

public class User {
	
	String firstname;
	String lastname;
	String email;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public static Object getUser(String email) {
		return Query.getUserQuery(email);
	 
	}
	
	public String getName() {

		return firstname+" "+lastname;
	
	}

}
