package wit.seven.bwash.services;

import wit.seven.bwash.dto.CenterDTO;
import wit.seven.bwash.dto.UserDTO;

import java.util.List;

public interface CenterService {
    void createCenter(CenterDTO centerDTO);
    void updateCenter(CenterDTO centerDTO);
    //void cancelService(CenterDTO serviceBWashDTO);
    List<CenterDTO> getService();

}
