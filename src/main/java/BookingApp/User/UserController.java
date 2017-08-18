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
	@RequestMapping(value="/login", method = RequestMethod.POST)

	public ResponseEntity<String> login (@RequestBody User user){
		//User user=new User();
		User currentUser = new User();
		currentUser = userService.findUserByEmail(user.getEmail());

		String inputPass ;

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		inputPass = user.getPassword();
		String true_pass = currentUser.getPassword();
		if(!(currentUser.getEmail().equals(""))&& encoder.matches(inputPass,true_pass)) {
			return new ResponseEntity<>("Session created " + currentUser.getId() , HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
		}
	}
}
