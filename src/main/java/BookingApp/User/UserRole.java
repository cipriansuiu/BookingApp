package BookingApp.User;
import javax.persistence.*;
@Entity
@Table(name="user_roles")
public class UserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_role_id")
	private Long userRoleId;
	@Column(name="role")
	private String role;
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role=role;
	}
	
	public Long getUserRoleid()
	{
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId)
	{
	this.userRoleId=userRoleId;
	}

}
