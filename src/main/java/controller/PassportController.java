package controller;

import entity.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PassportService;

@RestController
@RequestMapping("/passports")
public class PassportController {

    @Autowired
    private PassportService passportService;

    @PostMapping
    public Passport addPassport(@RequestBody Passport passport)
    {
        return passportService.savePassport(passport);
    }
    public PassportService getPassportService() {
        return passportService;
    }

    public void setPassportService(PassportService passportService) {
        this.passportService = passportService;
    }


}
