package com.Robin.CRUD.repository;

import com.Robin.CRUD.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository <Passport, Long> {
}
