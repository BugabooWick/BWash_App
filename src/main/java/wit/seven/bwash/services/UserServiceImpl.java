package wit.seven.bwash.services;

import org.springframework.stereotype.Service;
import wit.seven.bwash.dao.models.User;
import wit.seven.bwash.dao.repositories.ServiceCenterRepository;
import wit.seven.bwash.dao.repositories.UserRepository;
import wit.seven.bwash.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
    private ServiceCenterRepository serviceRepository;
    private UserRepository userRepository;

    public UserServiceImpl(ServiceCenterRepository serviceRepository, UserRepository userRepository) {
        this.serviceRepository = serviceRepository;
        this.userRepository = userRepository;
    }

    @Override
    public String createRequest(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setUserPhone(userDTO.getUserPhone());
        userRepository.save(user);
        return null;
    }
}
