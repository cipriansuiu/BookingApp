package BookingApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @RequestMapping("/services")
    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

    @RequestMapping("/services/{id}")
    public Service getService(@PathVariable Long id) {
        return serviceService.getService(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/services")
    public void addService(@RequestBody Service service) throws Exception {


        serviceService.addService(service);
        //SimpleEmailController controller=new SimpleEmailController();
        //controller.sendEmail(user.getEmail());


    }
}
