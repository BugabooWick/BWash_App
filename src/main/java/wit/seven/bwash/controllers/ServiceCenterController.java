package wit.seven.bwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wit.seven.bwash.dto.ServiceCenterDTO;
import wit.seven.bwash.services.ServiceCenterService;

import java.util.List;

@Controller
@RequestMapping(value = "/bwash")
public class ServiceCenterController {
    private ServiceCenterService centerService;

    @Autowired
    public ServiceCenterController(ServiceCenterService bWashService) {
        this.centerService = bWashService;
    }

    @GetMapping(value = "/getListService")
    public @ResponseBody
    List<ServiceCenterDTO> services() {
        return centerService.getService();
    }

    @PostMapping(value = "/createService")
    public @ResponseBody
    String createServiceInData(@RequestBody ServiceCenterDTO centerDTO) {
        centerService.createCenter(centerDTO);
        return "OK";
    }

    @PutMapping(value = "/updateService")
    public @ResponseBody String updateService(@RequestBody ServiceCenterDTO centerDTO) {
        return centerService.updateCenter(centerDTO);
    }
}
