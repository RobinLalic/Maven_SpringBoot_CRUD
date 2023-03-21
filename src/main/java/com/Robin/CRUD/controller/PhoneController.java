package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Phone;
import com.Robin.CRUD.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @PostMapping("/create")
    public Phone addPhone(@RequestBody Phone phone) { return phoneService.savePhone(phone); }

    @GetMapping("/getById/{id}")
    public Phone getPhoneById(@PathVariable Long id) { return phoneService.getPhoneById(id); }

    @GetMapping("/getAll")
    public List<Phone> getAllPhones() { return phoneService.getAllPhones(); }

    @DeleteMapping("/delete/{id}")
    public void deletePhone(@PathVariable Long id) { phoneService.removePhone(id); }

    @PutMapping("/update/{id}")
    public Phone updatePhone(@RequestBody Phone phone, @PathVariable Long id){
        return phoneService.updatePhone(phone, id);
    }
}
