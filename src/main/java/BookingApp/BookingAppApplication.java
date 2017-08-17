package BookingApp;

import BookingApp.Company.Company;
import BookingApp.Company.CompanyService;
import BookingApp.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.sql.DriverManager;


@ComponentScan
@SpringBootApplication
public class BookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAppApplication.class, args);
	}



}