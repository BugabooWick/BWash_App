package wit.seven.bwash.services;

import wit.seven.bwash.dto.ServiceCenterDTO;

import java.util.List;

public interface ServiceCenterService {
    String createCenter(ServiceCenterDTO serviceCenterDTO);
    String updateCenter(ServiceCenterDTO serviceCenterDTO);
    //void cancelService(ServiceCenterDTO serviceBWashDTO);
    List<ServiceCenterDTO> getListService();

}
