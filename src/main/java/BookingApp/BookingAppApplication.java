package BookingApp;

import BookingApp.Company.Company;
import BookingApp.Company.CompanyService;
import BookingApp.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.sql.DriverManager;



@SpringBootApplication
public class BookingAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookingAppApplication.class, args);
	}

	@Configuration
	class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

	}

}