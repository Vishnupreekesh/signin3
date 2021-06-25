package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sqldatabase.Query;

public class Connector {
	
	
	public static ArrayList<User> signinProcess(String email) throws ClassNotFoundException, SQLException {
		
		ArrayList<User> li=new ArrayList<User>();
		String firstname;
		String lastname;
		int status;
		String password;
		int emailtype1;
        String email1;
		
		ResultSet rs=Query.signinQuery(email);
		while(rs.next()) {
			User user=new User();
			firstname=user.setFirstname(rs.getString(1));
			lastname=user.setLastname(rs.getString(2));
			status=user.setStatus(Integer.parseInt(rs.getString(3)));
			password=user.setPassword(rs.getString(4));
			emailtype1= user.setEmailtype(rs.getInt(5));
			email1= user.setEmail(rs.getString(6));
			li.add(user);
		}
		return li;
	}
	
	public static User userprocess(String email) throws SQLException, ClassNotFoundException {
		String firstname;
		String Lastname;
		String email1;
		ResultSet rs=Query.getUserQuery(email);
		User user=new User();
		while(rs.next()) {
			firstname=user.setFirstname(rs.getString(1));
			Lastname=user.setLastname(rs.getString(2));
			email1=user.setEmail(rs.getString(3));	
		}
		return user;
		
	}

	

}
