package wit.seven.bwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wit.seven.bwash.dto.UserDTO;
import wit.seven.bwash.services.UserService;

@Controller
@RequestMapping(value = "/bwash")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/Create-Request-In-Database")
    public @ResponseBody String createRequest(@RequestBody UserDTO userDTO){
       return userService.createRequest(userDTO);
    }
}
