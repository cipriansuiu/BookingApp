package BookingApp.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	private UserRepository userRepository;

	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}

	@RequestMapping("/users/{email}")
	public User getUser(@PathVariable Long id)
	{
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void addUser(@RequestBody User user) throws Exception{
		
		
		userService.addUser(user);
		//SimpleEmailController controller=new SimpleEmailController();
		//controller.sendEmail(user.getEmail());
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	@CrossOrigin
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody User user){

		User currentUser = new User();
		currentUser = userRepository.findByEmail(user.getEmail());

		String pass = currentUser.getPassword();
		String inputPass = user.getPassword();

		if(!(currentUser.getEmail().equals(""))&& currentUser.getEmail().matches(inputPass)) {
			currentUser = userRepository.findByEmail(user.getEmail());
			return new ResponseEntity<>("Session created " + currentUser.getEmail() , HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
		}
	}
}
