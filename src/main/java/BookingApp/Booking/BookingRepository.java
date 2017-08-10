package BookingApp.Booking;

import BookingApp.Services.ServiceDao;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Long> {

}