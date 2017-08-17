package BookingApp.Services;

import BookingApp.User.User;
import BookingApp.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    public String addService(ServiceDao service) {

        if(!isValidName(service.getName()))
        {
            return "Invalid name!";
        }
        serviceRepository.save(service);
        return "ok";
    }

    public void updateService(ServiceDao service) {
        serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.delete(id);
    }

    private boolean isValidName(String name){
        String expression="^[a-zA-Z0-9_]+( [a-zA-Z0-9_]+)*$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }

}
