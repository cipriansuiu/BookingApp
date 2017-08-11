package BookingApp.Booking;

import BookingApp.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping("/bookings")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @RequestMapping("/bookings/{id}")
    public Booking getBooking(@PathVariable Long id) {
        return bookingService.getBooking(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/bookings")
    public void addBookings(@RequestBody Booking booking) throws Exception {
        bookingService.addBooking(booking);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/bookings")
    public void updateBooking(@RequestBody Booking booking) {
        bookingService.updateBooking(booking);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/bookings/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }

}
