package BookingApp.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<String> addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }
}
