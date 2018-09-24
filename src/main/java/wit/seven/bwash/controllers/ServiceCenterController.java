package wit.seven.bwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wit.seven.bwash.configs.Response;
import wit.seven.bwash.dto.ServiceCenterDTO;
import wit.seven.bwash.services.ServiceCenterService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/bwash")
public class ServiceCenterController {
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
    public Response createServiceInData(@RequestBody ServiceCenterDTO serviceCenterDTO) {
        /*List<ServiceCenterDTO> serviceCenterList = new ArrayList<>();
        serviceCenterList.add(serviceCenterDTO);*/
        Response response = new Response(true,serviceCenterDTO,"Successful!");
        //serviceCenter.createCenter(serviceCenterDTO);
        response.setData(serviceCenterDTO);
        return response;
    }

    @PutMapping(value = "/updateService")
    public @ResponseBody String updateService(@RequestBody ServiceCenterDTO centerDTO) {
        return serviceCenter.updateCenter(centerDTO);
    }

}
