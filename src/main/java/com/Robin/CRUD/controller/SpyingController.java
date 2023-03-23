package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Citizen;
import com.Robin.CRUD.service.SpyingService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/spy")
@RequiredArgsConstructor
public class SpyingController {
    private final SpyingService spyingService;

    @GetMapping("/getByCity/{city}")
    public List<Citizen> getCitizenByCity(@PathVariable String city) {
        return spyingService.getCitizenByCity(city);
    }

    @GetMapping("/getByPlaceOfEmployment/{placeOfEmployment}")
    public List<Citizen> getCitizenByPlaceOfEmployment(@PathVariable String placeOfEmployment) {
        return spyingService.getCitizenByPlaceOfEmployment(placeOfEmployment);
    }

    @GetMapping("/getByCityAndPlaceOfEmployment/{city},{placeOfEmployment}")
    public List<Citizen> getCitizenByCityAndPlaceOfEmployment(@PathVariable String city,
                                                              @PathVariable String placeOfEmployment) {
        return spyingService.getCitizenByCityAndPlaceOfEmployment(city, placeOfEmployment);
    }

    @GetMapping("/getByPassportNationality/{nationality}")
    public List<Citizen> getCitizenByNationality(@PathVariable String nationality){
        return spyingService.getCitizenByPassportsNationality(nationality);
    }

    @GetMapping("/getByPassportExpiryDateAfter/{expiryDate}")
    public List<Citizen> getCitizenByPassportExpiryDateAfter(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                                                 @PathVariable Date expiryDate){
        return spyingService.getCitizenByPassportExpiryDateAfter(expiryDate);
    }
}
