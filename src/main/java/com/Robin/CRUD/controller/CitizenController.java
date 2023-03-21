package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Citizen;
import lombok.RequiredArgsConstructor;
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

    @PutMapping("/{citizenId}/addPassport/{passportId}")
    Citizen addPassportToCitizen(@PathVariable Long citizenId, @PathVariable Long passportId){
        return citizenService.addPassportToCitizen(citizenId, passportId);
    }

    @DeleteMapping("/{citizenId}/removePassport/{passportId}")
    Citizen removePassportFromCitizen(@PathVariable Long citizenId, @PathVariable Long passportId){
        return citizenService.removePassportFromCitizen(citizenId, passportId);
    }

    @PutMapping("/{citizenId}/addVehicle/{vehicleId}")
    Citizen addVehicleToCitizen(@PathVariable Long citizenId, @PathVariable Long vehicleId){
        return citizenService.addVehicleToCitizen(citizenId, vehicleId);
    }

    @DeleteMapping("/{citizenId}/removeVehicle/{vehicleId}")
    Citizen removeVehicleFromCitizen(@PathVariable Long citizenId, @PathVariable Long vehicleId){
        return citizenService.removeVehicleFromCitizen(citizenId, vehicleId);
    }

    @PutMapping("/{citizenId}/addPhone/{phoneId}")
    Citizen addPhoneToCitizen(@PathVariable Long citizenId, @PathVariable Long phoneId){
        return citizenService.addPhoneToCitizen(citizenId, phoneId);
    }

    @DeleteMapping("/{citizenId}/removePhone/{phoneId}")
    Citizen removePhoneFromCitizen(@PathVariable Long citizenId, @PathVariable Long phoneId){
        return citizenService.removePhoneFromCitizen(citizenId, phoneId);
    }

}
