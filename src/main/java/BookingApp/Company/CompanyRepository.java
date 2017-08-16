package BookingApp.Company;

import BookingApp.User.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {
    Company findById(long id);
    Company findByName(String name);
    Company findByUser(User user);
}
