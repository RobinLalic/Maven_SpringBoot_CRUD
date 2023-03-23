package com.Robin.CRUD.repository;

import com.Robin.CRUD.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
    List<Citizen> findByCity(String city);
    List<Citizen> findByPlaceOfEmployment(String placeOfEmployment);
    List<Citizen> findByCityAndPlaceOfEmployment(String city, String placeOfEmployment);
}
