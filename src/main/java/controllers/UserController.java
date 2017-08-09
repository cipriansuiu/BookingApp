package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	@RequestMapping("/users/{email}")
	public User getUser(@PathVariable String email)
	{
		return userService.getUser(email);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void addUser(@RequestBody User user) throws Exception{
		
		
		userService.addUser(user);

	SimpleEmailController controller=new SimpleEmailController();
		controller.sendEmail(user.getEmail());
	
		

	}
	
	
	
	

}
