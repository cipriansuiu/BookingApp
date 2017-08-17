package BookingApp.Company;

import BookingApp.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

//    @RequestMapping(method= RequestMethod.POST, value="/companies/user")
//    public ResponseEntity findByUser(@RequestBody User user) {
//        //return companyService.findCompanyByAdmin(user);
//    }
//
//    @RequestMapping(method=RequestMethod.PUT, value="/companies/edit")
//    public ResponseEntity<String> editCompany(@RequestBody Company company) {
//       // return companyService.editCompany(company);
//    }

    @RequestMapping(method=RequestMethod.POST, value="/companies/add")
    @CrossOrigin
    public ResponseEntity<String> addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }
}
