package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Citizen;
import com.Robin.CRUD.model.Passport;
import com.Robin.CRUD.repository.CitizenRepository;
import com.Robin.CRUD.repository.PassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CitizenService {

    private final CitizenRepository citizenRepository;
    private final PassportRepository passportRepository;

    public Citizen saveCitizen(Citizen citizen)
    {
        return citizenRepository.save(citizen);
    }

    public List<Citizen> getAllCitizens() { return citizenRepository.findAll(); }

    public Citizen getCitizenById(Long id) { return citizenRepository.findById(id).get(); }

    public void removeCitizen(Long id) { citizenRepository.deleteById(id);}

    public Citizen updateCitizen(Citizen citizen, Long id) {

        Citizen newCitizen = citizenRepository.findById(id).get();

        if (Objects.nonNull(citizen.getFirstName())
                && !"".equalsIgnoreCase(
                citizen.getFirstName())) {
            newCitizen.setFirstName(
                    citizen.getFirstName());
        }

        if (Objects.nonNull(citizen.getLastName())
                && !"".equalsIgnoreCase(
                citizen.getLastName())) {
            newCitizen.setLastName(
                    citizen.getLastName());
        }

        return citizenRepository.save(newCitizen);

    }

    public Citizen addPassportToCitizen(Long citizenId, Long passportId){
        Citizen citizen = citizenRepository.findById()
    }


}
