package BookingApp.User;
import java.util.List;

import org.springframework.*;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
public interface UserRolesRepository extends CrudRepository<UserRole,Long>{
@Query("select a.role from UserRole a,User b where b.username=?1 and a.userid=b.userId")
	public List<String> findRoleByUserName(String username);
}
