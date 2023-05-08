package com.example.betting.repository;

import com.example.betting.models.Coefficient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoefficientRepository extends JpaRepository<Coefficient,Long> {
    Coefficient findByName(String name);
}
