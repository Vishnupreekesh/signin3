package Main;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
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
		
		ArrayList<User> user=Connector.signinProcess(email);
		if(user.isEmpty()) {
			System.out.print("Invalid Username or Password");
		}
		else {
			for(User u: user) {
				if(u.getEmail().equals(email) && u.getPassword().equals(pass)) {
					System.out.println("Login Successfully\n\n");
					User user1=Connector.userprocess(email);
					System.out.println("Welcome "+user1.getName());
				}
			}
		}
		
	}
	
	
}
