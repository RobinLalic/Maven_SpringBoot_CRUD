package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Citizen;
import com.Robin.CRUD.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SpyingService {

    private final CitizenRepository citizenRepository;

    public List<Citizen> getCitizenByCity(String city) { return citizenRepository.findByCity(city); }

    public List<Citizen> getCitizenByPlaceOfEmployment(String placeOfEmployment) {
        return citizenRepository.findByPlaceOfEmployment(placeOfEmployment);
    }

    public List<Citizen> getCitizenByCityAndPlaceOfEmployment(String city, String placeOfEmployment) {
        return citizenRepository.findByCityAndPlaceOfEmployment(city, placeOfEmployment);
    }

    public List<Citizen> getCitizenByPassportsNationality(String nationality){
        return citizenRepository.findByPassportsNationality(nationality);
    }

    public List<Citizen> getCitizenByPassportExpiryDateAfter(Date expiryDate){
        return citizenRepository.findByPassportsExpiryDateAfter(expiryDate);
    }
}
