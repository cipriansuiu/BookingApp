package BookingApp.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
 public User findByName(String usernarme);
}
