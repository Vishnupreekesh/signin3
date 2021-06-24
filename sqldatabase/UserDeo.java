package sqldatabase;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.xdevapi.Result;
import Main.User;

import Main.Userpojo;


public class UserDeo {
	private JdbcTemplate jdbcTemplate;  

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
//	
	
	public void create() {
		
	}
	 
	public void alter() {
		
	}
	public void delete() {
		
	}

	public List<Userpojo> select(String query) {
		// TODO Auto-generated method stub
		
		List<Userpojo> userList = jdbcTemplate.query(query, new BeanPropertyRowMapper<Userpojo>(Userpojo.class));  
		
		return userList;
		
	}
	
	public User selectObject(String query) {
		
		User user=jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<User>(User.class));
		return user;
	}

	

}
