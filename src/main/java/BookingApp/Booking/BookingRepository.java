package BookingApp.Booking;

import BookingApp.Services.ServiceDao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking,Long> {
//    Booking findById(long id);
//    List<Booking> findByName(String name);
//    List<Booking> findByService (ServiceDao service);
}