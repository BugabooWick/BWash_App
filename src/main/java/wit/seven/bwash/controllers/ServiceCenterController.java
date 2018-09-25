package wit.seven.bwash.controllers;

import org.springframework.web.bind.annotation.*;
import wit.seven.bwash.configs.Response;
import wit.seven.bwash.dto.ServiceCenterDTO;
import wit.seven.bwash.services.ServiceCenterService;

import java.util.List;

@RestController
@RequestMapping(value = "/BWash")
public class ServiceCenterController {
    private ServiceCenterService serviceCenter;

    public ServiceCenterController(ServiceCenterService serviceCenter) {
        this.serviceCenter = serviceCenter;
    }

    @GetMapping(value = "/getListService")
    public List<ServiceCenterDTO> services() {
        return serviceCenter.getService();
    }

    @PostMapping(value = "/createService")
    public Response createServiceCenter(@RequestBody ServiceCenterDTO serviceCenterDTO) {
        Response<ServiceCenterDTO> response = new Response<>(true,serviceCenterDTO,"Successful!");
        serviceCenter.createCenter(serviceCenterDTO);
        response.setData(serviceCenterDTO);
        return response;
    }

    @PutMapping(value = "/updateService")
    public @ResponseBody String updateService(@RequestBody ServiceCenterDTO centerDTO) {
        return serviceCenter.updateCenter(centerDTO);
    }

}
