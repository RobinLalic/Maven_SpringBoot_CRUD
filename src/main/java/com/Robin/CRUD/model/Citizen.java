package com.Robin.CRUD.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Data
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "Citizen")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    /*@Column(name="passport_id")
    private int passportId;
    @Column(name="vehicle_id")
    private int vehicleId;
    @Column(name="phone_id")
    private int phoneId;
    @Column(name="place_of_employment")
    private String placeOfEmployment;
    @Column(name="place_of_residence")
    private String placeOfResidence;*/


}
