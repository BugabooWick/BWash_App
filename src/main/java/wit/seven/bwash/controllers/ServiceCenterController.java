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
    public Response<List<ServiceCenterDTO>> getListServiceCenter() {
        List<ServiceCenterDTO> serviceCenterDTOs = serviceCenter.getListService();
        Response<List<ServiceCenterDTO>> response = new Response<>(true,serviceCenterDTOs,"Done!");
        return response;
    }

    @PostMapping(value = "/createService")
    public Response addServiceCenter(@RequestBody ServiceCenterDTO serviceCenterDTO) {
        serviceCenter.createCenter(serviceCenterDTO);
        Response<ServiceCenterDTO> response = new Response<>(true,serviceCenterDTO,"Successful!");
        response.getData();
        return response;
    }

    @PutMapping(value = "/updateService")
    public @ResponseBody String updateService(@RequestBody ServiceCenterDTO centerDTO) {
        return serviceCenter.updateCenter(centerDTO);
    }

}
