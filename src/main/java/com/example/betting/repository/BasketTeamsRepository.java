package com.example.betting.repository;

import com.example.betting.models.BasketballTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BasketTeamsRepository extends JpaRepository<BasketballTeam, Long> {
}
