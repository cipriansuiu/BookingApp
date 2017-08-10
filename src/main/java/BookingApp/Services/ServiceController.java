package BookingApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @RequestMapping("/services")
    public List<ServiceDao> getAllServices() {
        return serviceService.getAllServices();
    }

    @RequestMapping("/services/{id}")
    public ServiceDao getService(@PathVariable Long id) {
        return serviceService.getService(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/services")
    public void addService(@RequestBody ServiceDao service) throws Exception {


        serviceService.addService(service);


    }
}
