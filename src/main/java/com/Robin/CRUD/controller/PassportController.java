package com.Robin.CRUD.controller;

import com.Robin.CRUD.model.Passport;
import com.Robin.CRUD.service.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passports")
@RequiredArgsConstructor
public class PassportController {

    private final PassportService passportService;

    @PostMapping("/create")
    public Passport addPassport(@RequestBody Passport passport) { return passportService.savePassport(passport); }

    @GetMapping("/getById/{id}")
    public Passport getPassportById(@PathVariable Long id) { return passportService.getPassportById(id); }

    @GetMapping("/getAll")
    public List<Passport> getAllPassports() { return passportService.getAllPassports(); }

    @DeleteMapping("/delete/{id}")
    public void deletePassport(@PathVariable Long id) { passportService.removePassport(id); }

    @PutMapping("/update/{id}")
    public Passport updatePassport(@RequestBody Passport passport, @PathVariable Long id){
        return passportService.updatePassport(passport, id);
    }
}
