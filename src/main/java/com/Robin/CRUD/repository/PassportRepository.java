package com.Robin.CRUD.repository;

import com.Robin.CRUD.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository <Passport, Long> {
}
