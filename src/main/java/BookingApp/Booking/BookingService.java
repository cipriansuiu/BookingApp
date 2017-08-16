package BookingApp.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    public List<Booking> getAllBookings()
    {
        List<Booking> bookings=new ArrayList<>();
        bookingRepository.findAll().forEach(bookings::add);
        return bookings;
    }
    public Booking getBooking(Long id)
    {
        return bookingRepository.findOne(id);
    }

    public void addBooking(Booking booking)
    {
        bookingRepository.save(booking);
    }

    public void updateBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.delete(id);
    }

//    public ResponseEntity findBookingByName(String name) {
//        try {
//            List<Booking> bookingList = bookingRepository.findByName(name);
//
//            System.out.println("OK: " + bookingList.toString());
//            return ResponseEntity.ok(bookingList);
//        } catch (Exception e) {
//            System.out.println("BAD REQUEST!");
//            return ResponseEntity.badRequest().body("Bad request! " + e.toString());
//        }
//    }


}
