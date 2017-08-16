package BookingApp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
	
	@RequestMapping(method= RequestMethod.POST,value="/users")
	public void addUser(@RequestBody User user) throws Exception{
		
		
		userService.addUser(user);
		SimpleEmailController controller=new SimpleEmailController();
		controller.sendEmail(user.getEmail());
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}


	@RequestMapping(method=RequestMethod.POST,value="/logout")
 	public String logout(@RequestBody User user)
 	{
				user.resetToken();
				return "User logged out";
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
			currentUser.setToken();
						return new ResponseEntity<>(currentUser.getToken() , HttpStatus.OK);
		} else {
			return new ResponseEntity<>("0", HttpStatus.BAD_REQUEST);
		}
	}
}
