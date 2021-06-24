package Main;


public class Userpojo {
	private String firstname;
	private String lastname;
	private int status;
	private String password;
	private int email_type;
	private String email;
	
	
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



	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}



	public int getEmailType() {
		return email_type;
	}
	
	public void setEmailType(int emailType) {
		this.email_type = emailType;
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

	@Override
	public String toString() {
		return firstname+" "+lastname+" "+status+" "+password+" "+email_type+" "+email;
	}

	
}
