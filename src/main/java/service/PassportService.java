package service;

import entity.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PassportRepository;

@Service
public class PassportService {

    @Autowired
    private PassportRepository passportRepository;

    public Passport savePassport(Passport passport)
    {
        return passportRepository.save(passport);
    }

    public PassportRepository getPassportRepository() {
        return passportRepository;
    }

    public void setPassportRepository(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

}
