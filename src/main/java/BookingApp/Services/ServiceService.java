package BookingApp.Services;

import BookingApp.User.User;
import BookingApp.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;
    private UserService userService;

    public List<ServiceDao> getAllServices() {
        List<ServiceDao> services = new ArrayList<>();
        serviceRepository.findAll().forEach(services::add);
        return services;
    }

    public ServiceDao getService(Long id) {
        return serviceRepository.findOne(id);
    }

    public void addService(ServiceDao service) {
        serviceRepository.save(service);
    }

    public void updateService(ServiceDao service) {
        serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.delete(id);
    }

//    public Stream getUser(ServiceDao service)
//    {
//        List<User> users = userService.getAllUsers();
//        Stream<User> correctUser = users.stream().filter(u -> u.getId() == service.getUser_id());
//        return correctUser;
//    }
}
