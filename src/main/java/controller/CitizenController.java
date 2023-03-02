package controller;

import entity.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CitizenService;

@RestController
@RequestMapping("/citizens")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @PostMapping
    public Citizen addCitizen(@RequestBody Citizen citizen)
    {
        return citizenService.saveCitizen(citizen);
    }
    public CitizenService getCitizenService() {
        return citizenService;
    }

    public void setCitizenService(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

}
