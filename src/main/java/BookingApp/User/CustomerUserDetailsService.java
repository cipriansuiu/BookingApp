package BookingApp.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service("customUserDetailsService")

public class CustomerUserDetailsService implements UserDetailsService{
	public  UserRepository userRepository;
	public UserRolesRepository userRolesRepository;

	@Autowired
	public CustomerUserDetailsService(UserRepository userRepository, UserRolesRepository userRolesrepository)
	{
		this.userRepository=userRepository;
		this.userRolesRepository=userRolesRepository;
	}
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user=userRepository.findByName(userName);
		if(null==user)
		{
			throw new UsernameNotFoundException("Not a user .");
		}
		else
		{
			List <String> userRoles=userRolesRepository.findRoleByUserName(userName);
			return new CustomeUserDetails(user,userRoles);
		}
		
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

}
