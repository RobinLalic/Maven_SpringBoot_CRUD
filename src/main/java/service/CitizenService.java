package service;

import entity.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CitizenRepository;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    public Citizen saveCitizen(Citizen citizen)
    {
        return citizenRepository.save(citizen);
    }

    public CitizenRepository getCitizenRepository() {
        return citizenRepository;
    }

    public void setCitizenRepository(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

}
