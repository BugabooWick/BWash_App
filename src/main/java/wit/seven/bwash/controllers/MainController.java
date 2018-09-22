package wit.seven.bwash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import wit.seven.bwash.configs.Response;
import wit.seven.bwash.dto.UserDTO;

@Controller
public class MainController {
    @GetMapping(value = {"/","/index"})
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping(value = "/login")
    public @ResponseBody Response loginAccount(UserDTO userDTO) {
        Response response = new Response(true,userDTO,"Done!");
        return response;
    }
}
