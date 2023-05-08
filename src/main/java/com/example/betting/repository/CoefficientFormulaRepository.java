package com.example.betting.repository;

import com.example.betting.models.CoefficientFormula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoefficientFormulaRepository extends JpaRepository<CoefficientFormula, Long> {
    CoefficientFormula findByName(String name);
}
