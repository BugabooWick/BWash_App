package wit.seven.bwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wit.seven.bwash.dto.CenterDTO;
import wit.seven.bwash.services.CenterService;

import java.util.List;

@Controller
public class CenterController {
    @Autowired
    private CenterService centerService;

    public CenterController(CenterService bWashService) {
        this.centerService = bWashService;
    }

    @GetMapping(value = "/Get-List-In-Database")
    public @ResponseBody List<CenterDTO> services() {
        return centerService.getService();
    }

    @PostMapping(value = "/Create-Service-In-Database")
    public @ResponseBody String createServiceInData(@RequestBody CenterDTO centerDTO) {
        centerService.createCenter(centerDTO);
        return "OK";
    }

    @PutMapping(value = "/Update-Service-In-Database")
    public @ResponseBody String updateService(@RequestBody CenterDTO centerDTO) {
        centerService.updateCenter(centerDTO);
        return "OK";
    }
}
