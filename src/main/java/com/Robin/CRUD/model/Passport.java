package com.Robin.CRUD.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Data
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "Passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date expiryDate;

    private String nationality;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "citizen_id", referencedColumnName = "id")
    private Citizen citizen;
}
