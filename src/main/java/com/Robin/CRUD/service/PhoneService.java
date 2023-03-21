package com.Robin.CRUD.service;

import com.Robin.CRUD.model.Phone;
import com.Robin.CRUD.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public Phone savePhone(Phone phone) {return phoneRepository.save(phone); }

    public List<Phone> getAllPhones() { return phoneRepository.findAll(); }

    public Phone getPhoneById(Long id) { return phoneRepository.findById(id).get(); }

    public void removePhone(Long id) { phoneRepository.deleteById(id);}

    public Phone updatePhone(Phone phone, Long id) {

        Phone newPhone = phoneRepository.findById(id).get();

        if (Objects.nonNull(phone.getPhoneType())
                && !"".equalsIgnoreCase(
                phone.getPhoneType().toString())) {
            newPhone.setPhoneType(
                    phone.getPhoneType());
        }

        if (Objects.nonNull(phone.getOperatingSystem())
                && !"".equalsIgnoreCase(
                phone.getOperatingSystem().toString())) {
            newPhone.setOperatingSystem(
                    phone.getOperatingSystem());
        }

        if (Objects.nonNull(phone.getPhoneNumber())
                && !"".equalsIgnoreCase(
                phone.getPhoneNumber().toString())) {
            newPhone.setPhoneNumber(
                    phone.getPhoneNumber());
        }

        return phoneRepository.save(newPhone);

    }
}
