package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Citizen;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.Robin.CRUD.service.CitizenService;

import java.util.List;

@RestController
@RequestMapping("/citizens")
@RequiredArgsConstructor
public class CitizenController {

    private final CitizenService citizenService;


    @PostMapping("/create")
    public Citizen addCitizen(@RequestBody Citizen citizen)
    {
        return citizenService.saveCitizen(citizen);
    }

    @GetMapping("/getById/{id}")
    public Citizen getCitizenById(@PathVariable Long id) { return citizenService.getCitizenById(id); }

    @GetMapping("/getAll")
    public List<Citizen> getAllCitizens() { return citizenService.getAllCitizens(); }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) { citizenService.removeCitizen(id); }

    @PutMapping("/update/{id}")
    public Citizen updateCitizen(@RequestBody Citizen citizen, @PathVariable Long id){
        return citizenService.updateCitizen(citizen, id);
    }


}
