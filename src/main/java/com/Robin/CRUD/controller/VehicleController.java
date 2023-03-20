package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Vehicle;
import com.Robin.CRUD.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping("/create")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) { return vehicleService.saveVehicle(vehicle); }

    @GetMapping("/getById/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) { return vehicleService.getVehicleById(id); }

    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles() { return vehicleService.getAllVehicles(); }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicle(@PathVariable Long id) { vehicleService.removeVehicle(id); }

    @PutMapping("/update/{id}")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable Long id){
        return vehicleService.updateVehicle(vehicle, id);
    }
}
