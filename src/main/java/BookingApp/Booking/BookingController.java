package BookingApp.Booking;

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
}
