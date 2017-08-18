package BookingApp.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class UserService {

	private static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

	@Autowired
	private JavaMailSender sender;

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

	public ResponseEntity<String> addUser(User user)
	{
		if (isDuplicateName(user.getName())) {
			return ResponseEntity.badRequest().body("Duplicate name");
		}

		if (isDuplicateEmail(user.getEmail())) {
			return ResponseEntity.badRequest().body("Duplicate email");
		}

		if (isInvalidPass(user.getPassword())) {
			return ResponseEntity.badRequest().body("Password length must be between 6..16");
		}
		try {
			BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
			user.setPassword(enc.encode(user.getPassword()));
			userRepository.save(user);
			sendEmail(user.getEmail());
			return ResponseEntity.ok("Registered successfully!");
		}catch (Exception e)
		{
			return ResponseEntity.badRequest().body("Something happened!");
		}
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

	public User findUserByEmail(String email) {
			User user= userRepository.findByEmail(email);
			return user;
	}
	private boolean isDuplicateName(String name) {
		return (userRepository.findByName(name) != null);
	}

	private boolean isDuplicateEmail(String email) {
		return (userRepository.findByEmail(email) != null);
	}

	private boolean isInvalidPass(String pass) {
		return !((pass.length() >= 6) && (pass.length() <= 16));
	}

	public void changeUserPassword(User user, String password) {
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
		user.setPassword(enc.encode(password));
		userRepository.save(user);
	}

	public void sendEmail(String email) throws Exception{

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setTo(email);
		helper.setText("Thank you for registering with us");
		helper.setSubject("Registration confirmation");

		sender.send(message);
	}
}
