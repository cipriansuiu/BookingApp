package BookingApp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

	private static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers()
	{
		List<User> users=new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	public User getUser(Long id)
	{
		return userRepository.findOne(id);
	}
	public void addUser(User user)
	{
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
		user.setPassword(enc.encode(user.getPassword()));
		userRepository.save(user);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public User getUserEmail(String email){
	return  userRepository.findByEmail(email);
	}
	public void deleteUser(Long id) {
		userRepository.delete(id);
	}

	private String encryptPassword(String inputPass) {
		return PASSWORD_ENCODER.encode(inputPass);
	}

	public String getToken(User user)
	{
		return user.getToken();
	}

	public void setToken(User user)
	{
		user.setToken();
	}
	public void resetToken(User user)
	{
		user.resetToken();
	}

}
