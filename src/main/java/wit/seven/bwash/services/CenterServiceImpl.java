package wit.seven.bwash.services;

import org.springframework.stereotype.Service;
import wit.seven.bwash.dao.models.Center;
import wit.seven.bwash.dao.repositories.CenterRepository;
import wit.seven.bwash.dao.repositories.UserRepository;
import wit.seven.bwash.dto.CenterDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CenterServiceImpl implements CenterService {

    private CenterRepository centerRepository;
    private UserRepository userRepository;

    public CenterServiceImpl(CenterRepository serviceRepository, UserRepository userRepository) {
        this.centerRepository = serviceRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createCenter(CenterDTO centerDTO) {
        Center service = new Center();
        service.setNameService(centerDTO.getNameService());
        service.setPhoneService(centerDTO.getPhoneService());
        service.setPictureService(centerDTO.getPictureService());
        //service.setOpenTimeService(centerDTO.getOpenTimeService());
        service.setPricesService(centerDTO.getPricesService());
        service.setDescriptionService(centerDTO.getDescriptionService());
        service.setRattingService(centerDTO.getRattingService());
        centerRepository.save(service);
    }

    @Override
    public void updateCenter(CenterDTO centerDTO) {
        Optional<Center> serviceOptional = centerRepository.findById(centerDTO.getIdCenter());
        if (serviceOptional.isPresent()) {
            Center serviceBWash = serviceOptional.get();
            serviceBWash.setNameService(centerDTO.getNameService());
            serviceBWash.setPhoneService(centerDTO.getPhoneService());
            serviceBWash.setPictureService(centerDTO.getPictureService());
            serviceBWash.setOpenTimeService(centerDTO.getOpenTimeService());
            serviceBWash.setPricesService(centerDTO.getPricesService());
            serviceBWash.setDescriptionService(centerDTO.getDescriptionService());
            serviceBWash.setRattingService(centerDTO.getRattingService());
            centerRepository.save(serviceBWash);
        }
    }

    @Override
    public List<CenterDTO> getService() {
        List<CenterDTO> centerDTOs = new ArrayList<>();
        List<Center> serviceList = centerRepository.findAll();
        for (Center iService: serviceList) {
            CenterDTO serviceDTO = new CenterDTO();
            serviceDTO.setIdCenter(iService.getIdCenter());
            serviceDTO.setNameService(iService.getNameService());
            serviceDTO.setPhoneService(iService.getPhoneService());
            serviceDTO.setPictureService(iService.getPictureService());
            serviceDTO.setOpenTimeService(iService.getOpenTimeService());
            serviceDTO.setPricesService(iService.getPricesService());
            serviceDTO.setDescriptionService(iService.getDescriptionService());
            serviceDTO.setRattingService(iService.getRattingService());
            //
            centerDTOs.add(serviceDTO);
        }
        return centerDTOs;
    }
}
