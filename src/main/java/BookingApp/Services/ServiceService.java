package BookingApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;
    public List<ServiceDao> getAllServices()
    {
        List<ServiceDao> services=new ArrayList<>();
        serviceRepository.findAll().forEach(services::add);
        return services;
    }
    public ServiceDao getService(Long id)
    {
        return serviceRepository.findOne(id);
    }
    public void addService(ServiceDao service)
    {
        serviceRepository.save(service);
    }
}
