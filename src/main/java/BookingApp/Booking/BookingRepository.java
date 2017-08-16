package BookingApp.Booking;

import BookingApp.Services.ServiceDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking,Long> {
//    Booking findById(long id);
//    List<Booking> findByName(String name);
//    List<Booking> findByService (ServiceDao service);
}