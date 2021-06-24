package sqldatabase;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Main.Userpojo;
import Main.User;

public class Query {
	static ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	static UserDeo user=context.getBean("userdeo",UserDeo.class);
	
	public static List signinQuery(String email,String pass) {
		String query="select u.firstname,u.lastname,u.status,p.password,e.email_type,e.email from  (usertable u join emailtable e on u.userid=e.userid) join pwdtable p on u.userid=p.userid where e.userid=(select userid from emailtable where email='"+email+"')and p.password='"+pass+"' ";
		
		List<Userpojo> userList=  user.select(query);
		return  userList;
	}
	
	public static User getUserQuery(String email) {
		
		String query="select usertable.firstname,usertable.lastname,emailtable.email from usertable inner join emailtable on usertable.userid=emailtable.userid where emailtable.email='"+email+"' ";
		User u=user.selectObject(query);
		return u;
	}

	
	
	

}
