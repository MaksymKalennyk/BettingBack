package com.example.betting.service;

import com.example.betting.models.Coefficient;
import com.example.betting.repository.CoefficientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoefficientService {

    private final CoefficientRepository coefficientRepository;

    @Autowired
    public CoefficientService(CoefficientRepository coefficientRepository) {
        this.coefficientRepository = coefficientRepository;
    }

    public Coefficient addCoefficient(Coefficient coefficient){
        coefficientRepository.save(coefficient);
        return coefficient;
    }
    public Coefficient updateCoefficient(Coefficient coefficient){
        Coefficient coefficientToUpdate = coefficientRepository.findByName(coefficient.getName());
        coefficientToUpdate.setMargin(coefficient.getMargin());
        coefficientToUpdate.setP1(coefficient.getP1());
        coefficientToUpdate.setP2(coefficient.getP2());
        coefficientRepository.save(coefficientToUpdate);
        return coefficientToUpdate;
    }

    public Coefficient getCoefficient(String name) {
        return coefficientRepository.findByName(name);
    }
}
