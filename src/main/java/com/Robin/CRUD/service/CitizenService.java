package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Citizen;
import com.Robin.CRUD.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitizenService {

    private final CitizenRepository citizenRepository;

    public Citizen saveCitizen(Citizen citizen)
    {
        return citizenRepository.save(citizen);
    }

    public List<Citizen> getAllCitizens() { return citizenRepository.findAll(); }

    public Citizen getCitizenById(Long id) { return citizenRepository.findById(id).get(); }

    public void removeCitizen(Long id) { citizenRepository.deleteById(id);}


}
