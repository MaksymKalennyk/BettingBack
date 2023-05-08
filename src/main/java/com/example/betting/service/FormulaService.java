package com.example.betting.service;
import com.example.betting.models.FormulaDrivers;
import com.example.betting.repository.FormulaDriversRepository;
import com.example.betting.repository.FormulaTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormulaService {

    private final FormulaDriversRepository formulaDriversRepository;
    private final FormulaTeamRepository formulaTeamRepository;

    @Autowired
    public FormulaService(FormulaDriversRepository formulaDriversRepository, FormulaTeamRepository formulaTeamRepository) {
        this.formulaDriversRepository = formulaDriversRepository;
        this.formulaTeamRepository = formulaTeamRepository;
    }

    public List<FormulaDrivers> getDriversById(int id) {
        return switch (id) {
            case 1 -> formulaDriversRepository.findByTeamFormulaId(1L);
            case 2 -> formulaDriversRepository.findByTeamFormulaId(2L);
            case 3 -> formulaDriversRepository.findByTeamFormulaId(3L);
            case 4 -> formulaDriversRepository.findByTeamFormulaId(4L);
            case 5 -> formulaDriversRepository.findByTeamFormulaId(5L);
            case 6 -> formulaDriversRepository.findByTeamFormulaId(6L);
            case 7 -> formulaDriversRepository.findByTeamFormulaId(7L);
            case 8 -> formulaDriversRepository.findByTeamFormulaId(8L);
            case 9 -> formulaDriversRepository.findByTeamFormulaId(9L);
            default -> formulaDriversRepository.findByTeamFormulaId(10L);
        };
    }
}
