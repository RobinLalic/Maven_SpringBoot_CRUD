package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Citizen;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.Robin.CRUD.service.CitizenService;

@RestController
@RequestMapping("/citizens")
@RequiredArgsConstructor
public class CitizenController {

    private final CitizenService citizenService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Citizen addCitizen(@RequestBody Citizen citizen)
    {
        return citizenService.saveCitizen(citizen);
    }

}
