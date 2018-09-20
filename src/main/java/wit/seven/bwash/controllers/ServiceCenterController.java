package wit.seven.bwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wit.seven.bwash.configs.Response;
import wit.seven.bwash.dto.ServiceCenterDTO;
import wit.seven.bwash.services.ServiceCenterService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/bwash")
public class ServiceCenterController {
    private List<ServiceCenterDTO> serviceCenterDtoList = new ArrayList<>();
    private ServiceCenterService serviceCenter;

    @Autowired
    public ServiceCenterController(ServiceCenterService serviceCenter) {
        this.serviceCenter = serviceCenter;
    }

    @GetMapping(value = "/getListService")
    public @ResponseBody
    List<ServiceCenterDTO> services() {
        return serviceCenter.getService();
    }

    @PostMapping(value = "/createService")
    public @ResponseBody Response createServiceInData(@RequestBody ServiceCenterDTO serviceCenterDTO) {
        serviceCenterDtoList.add(serviceCenterDTO);
        serviceCenter.createCenter(serviceCenterDTO);
        Response response = new Response(true,"serviceCenterDTO","Successful!");
        response.setData(serviceCenterDtoList);
        return response;

    }

    @PutMapping(value = "/updateService")
    public @ResponseBody String updateService(@RequestBody ServiceCenterDTO centerDTO) {
        return serviceCenter.updateCenter(centerDTO);
    }
}
