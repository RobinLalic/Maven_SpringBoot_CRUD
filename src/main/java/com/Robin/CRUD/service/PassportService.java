package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Passport;
import com.Robin.CRUD.repository.PassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PassportService {

    private final PassportRepository passportRepository;

    public Passport savePassport(Passport passport) {return passportRepository.save(passport); }

    public List<Passport> getAllPassports() { return passportRepository.findAll(); }

    public Passport getPassportById(Long id) { return passportRepository.findById(id).get(); }

    public void removePassport(Long id) { passportRepository.deleteById(id);}

    public Passport updatePassport(Passport passport, Long id) {

        Passport newPassport = passportRepository.findById(id).get();

        if (Objects.nonNull(passport.getExpiryDate())
                && !"".equalsIgnoreCase(
                passport.getExpiryDate().toString())) {
            newPassport.setExpiryDate(
                    passport.getExpiryDate());
        }

        return passportRepository.save(newPassport);

    }


}
