package BookingApp.User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id
	private String id;
	private String password;
	private String email;
	public User()
	{
		
	}
	public User(String id, String password,String email) {
		super();
		this.id = id;
		this.password = password;
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
