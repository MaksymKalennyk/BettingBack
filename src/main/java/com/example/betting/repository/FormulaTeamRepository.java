package com.example.betting.repository;

import com.example.betting.models.FormulaTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaTeamRepository extends JpaRepository<FormulaTeam, Long> {
}
