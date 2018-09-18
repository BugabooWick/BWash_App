package wit.seven.bwash.services;

import org.springframework.stereotype.Service;
import wit.seven.bwash.dao.models.User;
import wit.seven.bwash.dao.repositories.ServiceRepository;
import wit.seven.bwash.dao.repositories.UserRepository;
import wit.seven.bwash.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
    private ServiceRepository serviceRepository;
    private UserRepository userRepository;

    public UserServiceImpl(ServiceRepository serviceRepository, UserRepository userRepository) {
        this.serviceRepository = serviceRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createRequest(UserDTO userDTO) {
        User user = new User();
        user.setNameUser(userDTO.getNameUser());
        user.setPhoneUser(userDTO.getPhoneUser());
        user.setLocalUser(userDTO.getLocalUser());
        user.setTimeUser(userDTO.getTimeUser());
        user.setRequestUser(userDTO.getRequestUser());
        userRepository.save(user);
    }
}
