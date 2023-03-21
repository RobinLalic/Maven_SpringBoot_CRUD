package com.Robin.CRUD.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;


@Data
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "Citizen")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="place_of_employment")
    private String placeOfEmployment;
    @Column(name="place_of_residence")
    private String placeOfResidence;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "citizen_id", referencedColumnName = "id")
    private List<Passport> passports;

    public void addPassport(Passport passport) {
        if(!passports.contains(passport))
            passports.add(passport);
    }

    public void removePassport(Passport passport) { passports.remove(passport); }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "citizen_id", referencedColumnName = "id")
    private List<Vehicle> vehicles;

    public void addVehicle(Vehicle vehicle){
        if(!vehicles.contains(vehicle))
            vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){ vehicles.remove(vehicle); }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "citizen_id", referencedColumnName = "id")
    private List<Phone> phones;

    public void addPhone(Phone phone){
        if(!phones.contains(phone))
            phones.add(phone);
    }

    public void removePhone(Phone phone){ phones.remove(phone); }

}
