package wit.seven.bwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import wit.seven.bwash.dto.CenterDTO;
import wit.seven.bwash.services.CenterService;

import java.util.List;

public class CenterController {

    private CenterService centerService;

    @Autowired
    public CenterController(CenterService bWashService) {
        this.centerService = bWashService;
    }

    @GetMapping(value = "/Get-List-In-Database")
    public List<CenterDTO> services() {
        return centerService.getService();
    }

    @PostMapping(value = "/Create-Service-In-Database")
    public String addServiceInData(@RequestBody CenterDTO serviceBWashDTO) {
        centerService.createCenter(serviceBWashDTO);
        return "OK";
    }

    @PutMapping(value = "/Update-Service-In-Database")
    public String updateService(CenterDTO serviceBWashDTO) {
        centerService.updateCenter(serviceBWashDTO);
        return "OK";
    }
}
