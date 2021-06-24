package Main;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.*;

import sqldatabase.Query;

public class Signin {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email : ");
		String email=sc.next();
		System.out.println("Enter the Password : ");
		String pass=Password.doHashing(sc.next());
		
		User obj=null;
		List<Userpojo> userList=Query.signinQuery(email,pass);
		if(userList.size()==0) {
			System.out.print("Invalid username or Password");
		}
		else {
			System.out.println("Login Successfully\n\n");
			obj=(User) User.getUser(email);
			System.out.print("Welcome "+obj.getName());
		}
		
		
	}
	
	
}
