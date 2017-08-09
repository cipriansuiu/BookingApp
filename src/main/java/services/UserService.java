package services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import database.UserRepository;
import models.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers()
	{
		List<User> users=new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	public User getUser(String email)
	{
		return userRepository.findOne(email);
	}
	public void addUser(User user)
	{
		userRepository.save(user);
	}

}
