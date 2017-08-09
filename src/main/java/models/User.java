package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String email;
	private String name;
	private String password;
	
	public User()
	{
		
	}
	public User(String name, String password,String email) {
		super();
		this.name = name;
		this.password = password;
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
