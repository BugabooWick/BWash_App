package wit.seven.bwash.services;

import org.springframework.stereotype.Service;
import wit.seven.bwash.dao.models.ServiceCenter;
import wit.seven.bwash.dao.repositories.ServiceCenterRepository;
import wit.seven.bwash.dao.repositories.UserRepository;
import wit.seven.bwash.dto.ServiceCenterDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCenterServiceImpl implements ServiceCenterService {

    private ServiceCenterRepository serviceCenterRepository;
    private UserRepository userRepository;

    public ServiceCenterServiceImpl(ServiceCenterRepository serviceCenterRepository, UserRepository userRepository) {
        this.serviceCenterRepository = serviceCenterRepository;
        this.userRepository = userRepository;
    }

    @Override
    public String createCenter(ServiceCenterDTO serviceCenterDTO) {
        ServiceCenter service = new ServiceCenter();
        service.setServiceName(serviceCenterDTO.getServiceName());
        service.setServicePhone(serviceCenterDTO.getServicePhone());
        service.setServicePicture(serviceCenterDTO.getServicePicture());
        //service.setServiceOpenTime(serviceCenterDTO.getServiceOpenTime());
        service.setServicePrices(serviceCenterDTO.getServicePrices());
        service.setServiceDescription(serviceCenterDTO.getServiceDescription());
        service.setServiceRating(serviceCenterDTO.getServiceRating());
        serviceCenterRepository.save(service);
        return null;
    }

    @Override
    public String updateCenter(ServiceCenterDTO serviceCenterDTO) {
        Optional<ServiceCenter> serviceCenterOptional = serviceCenterRepository.findById(serviceCenterDTO.getServiceId());
        if (serviceCenterOptional.isPresent()) {
            ServiceCenter service = serviceCenterOptional.get();
            service.setServiceName(serviceCenterDTO.getServiceName());
            service.setServicePhone(serviceCenterDTO.getServicePhone());
            service.setServicePicture(serviceCenterDTO.getServicePicture());
            service.setServiceOpenTime(serviceCenterDTO.getServiceOpenTime());
            service.setServicePrices(serviceCenterDTO.getServicePrices());
            service.setServiceDescription(serviceCenterDTO.getServiceDescription());
            service.setServiceRating(serviceCenterDTO.getServiceRating());
            serviceCenterRepository.save(service);
        }
        return null;
    }

    @Override
    public List<ServiceCenterDTO> getService() {
        List<ServiceCenterDTO> serviceDtoList = new ArrayList<>();
        List<ServiceCenter> serviceList = serviceCenterRepository.findAll();
        for (ServiceCenter iService: serviceList) {
            ServiceCenterDTO serviceDTO = new ServiceCenterDTO();
            serviceDTO.setServiceId(iService.getServiceId());
            serviceDTO.setServiceName(iService.getServiceName());
            serviceDTO.setServicePhone(iService.getServicePhone());
            serviceDTO.setServicePicture(iService.getServicePicture());
            serviceDTO.setServiceOpenTime(iService.getServiceOpenTime());
            serviceDTO.setServicePrices(iService.getServicePrices());
            serviceDTO.setServiceDescription(iService.getServiceDescription());
            serviceDTO.setServiceRating(iService.getServiceRating());
            //
            serviceDtoList.add(serviceDTO);
        }
        return serviceDtoList;
    }
}
