package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Citizen;
import com.Robin.CRUD.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CitizenService {

    private final CitizenRepository citizenRepository;

    public Citizen saveCitizen(Citizen citizen)
    {
        return citizenRepository.save(citizen);
    }


}
