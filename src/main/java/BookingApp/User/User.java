package BookingApp.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="token")
	private String token;

	public String getToken() {
		return token;
	}


	public void resetToken()
	{
		this.token="0";
	}

	
	public void setToken() {
		UUID tokenGenerator=UUID.randomUUID();
		this.token =tokenGenerator.toString();
	}

	public void setId(long id) {
		this.id = id;

	}



	public User()
	{

		
	}
	public User(long id,String name, String password,String email) {
		this.id=id;
		this.name = name;
		this.password = password;
		this.email=email;
		this.token="0";
	}

	public User(String name, String password,String email) {

		this.name = name;
		this.password = password;
		this.email=email;
		this.token="0";
	}

	public User(String email,String password) {

		this.email = email;

		this.password=password;
	}
	public long getId() {
		return id;

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

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +

				'}';
	}
}
