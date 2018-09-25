package wit.seven.bwash.controllers;

import org.springframework.web.bind.annotation.*;
import wit.seven.bwash.dto.UserDTO;
import wit.seven.bwash.services.UserService;

@RestController
@RequestMapping(value = "/BWash")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/bookingService")
    public String createRequest(@RequestBody UserDTO userDTO){
       return userService.createRequest(userDTO);
    }
}
