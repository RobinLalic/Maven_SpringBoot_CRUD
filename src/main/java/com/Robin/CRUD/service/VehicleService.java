package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Passport;
import com.Robin.CRUD.model.Vehicle;
import com.Robin.CRUD.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public Vehicle saveVehicle(Vehicle vehicle) { return vehicleRepository.save(vehicle); }

    public List<Vehicle> getAllVehicles() { return vehicleRepository.findAll(); }

    public Vehicle getVehicleById(Long id) { return vehicleRepository.findById(id).get(); }

    public void removeVehicle(Long id) { vehicleRepository.deleteById(id); }

    public Vehicle updateVehicle(Vehicle vehicle, Long id) {

        Vehicle newVehicle = vehicleRepository.findById(id).get();

        if (Objects.nonNull(vehicle.getVehicleModel())
                && !"".equalsIgnoreCase(
                vehicle.getVehicleModel().toString())) {
            newVehicle.setVehicleModel(
                    vehicle.getVehicleModel());
        }

        if (Objects.nonNull(vehicle.getVehicleColour())
                && !"".equalsIgnoreCase(
                vehicle.getVehicleColour().toString())) {
            newVehicle.setVehicleColour(
                    vehicle.getVehicleColour());
        }

            return vehicleRepository.save(newVehicle);


    }
}

