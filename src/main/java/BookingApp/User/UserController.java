package BookingApp.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	private UserRepository userRepository;

	@RequestMapping("/users")
	@CrossOrigin
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}

	@RequestMapping("/users/{email}")
	@CrossOrigin
	public User getUser(@PathVariable Long id)
	{
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users")
	@CrossOrigin
	public void addUser(@RequestBody User user) throws Exception{
		
		
		userService.addUser(user);
		//SimpleEmailController controller=new SimpleEmailController();
		//controller.sendEmail(user.getEmail());
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users")
	@CrossOrigin
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	@CrossOrigin
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	@CrossOrigin
	@RequestMapping(path="/login")
	public ResponseEntity<String> login(@RequestParam("email") String email, @RequestParam("password") String password){

		User currentUser = new User();
		currentUser = userRepository.findByEmail(email);

		String inputPass = password;

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		inputPass = encoder.encode(password);

		if(!(currentUser.getEmail().equals(""))&& currentUser.getPassword().equals(inputPass)) {
			currentUser = userRepository.findByEmail(email);
			return new ResponseEntity<>("Session created " + currentUser.getEmail() , HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
		}
	}
}
