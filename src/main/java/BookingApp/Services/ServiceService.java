package BookingApp.Services;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;
    public List<Service> getAllServices()
    {
        List<Service> services=new ArrayList<>();
        serviceRepository.findAll().forEach(services::add);
        return services;
    }
    public Service getService(Long id)
    {
        return serviceRepository.findOne(id);
    }
    public void addService(Service service)
    {
        serviceRepository.save(service);
    }
}
