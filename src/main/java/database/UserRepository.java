package database;
import org.springframework.data.repository.CrudRepository;

import models.User;
public interface UserRepository extends CrudRepository<User,String> {
public void update(User user);
public void delete(User user);
public boolean exists(User user);
}
