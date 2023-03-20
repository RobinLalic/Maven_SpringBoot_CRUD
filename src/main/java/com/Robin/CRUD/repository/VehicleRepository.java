package com.Robin.CRUD.repository;

import com.Robin.CRUD.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository <Vehicle, Long> {
}
