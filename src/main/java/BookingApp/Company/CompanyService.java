package BookingApp.Company;

import BookingApp.User.User;
import BookingApp.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<String> addCompany(Company company) {
        User user1=company.getUser();
        user1.setEmail("");
        user1.setName("");
        user1.setPassword("");
        company.setUser(user1);
        try {
            companyRepository.save(company);
            return ResponseEntity.ok("Company added successfully!");
        }
        catch (Exception er)
        {

            System.out.println("Eroare " + er.getMessage());
        }
        return ResponseEntity.ok("Company error!");
        }
    public ResponseEntity<String> deleteCompany(long id) {
        companyRepository.delete(id);
        System.out.println("OK: Deleted!");
        return ResponseEntity.ok("Company deleted successfully!");

    }

}
