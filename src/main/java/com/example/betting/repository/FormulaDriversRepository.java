package com.example.betting.repository;

import com.example.betting.models.FormulaDrivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormulaDriversRepository extends JpaRepository<FormulaDrivers, Long> {
    List<FormulaDrivers> findByTeamFormulaId(Long FormulaTeamId);

}
