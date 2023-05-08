package com.example.betting.service;
import com.example.betting.models.CoefficientFormula;
import com.example.betting.repository.CoefficientFormulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoefficientFormulaService {

    private final CoefficientFormulaRepository coefficientFormulaRepository;

    @Autowired
    public CoefficientFormulaService(CoefficientFormulaRepository coefficientFormulaRepository) {
        this.coefficientFormulaRepository = coefficientFormulaRepository;
    }

    public CoefficientFormula addCoefficient(CoefficientFormula coefficientFormula){
        coefficientFormulaRepository.save(coefficientFormula);
        return coefficientFormula;
    }
    public CoefficientFormula updateCoefficient(CoefficientFormula coefficientFormula){
        CoefficientFormula coefficientToUpdate = coefficientFormulaRepository.findByName(coefficientFormula.getName());
        coefficientToUpdate.setMargin(coefficientFormula.getMargin());
        coefficientToUpdate.setHamilton(coefficientFormula.getHamilton());
        coefficientToUpdate.setRussel(coefficientFormula.getRussel());
        coefficientToUpdate.setSains(coefficientFormula.getSains());
        coefficientToUpdate.setLeclerc(coefficientFormula.getLeclerc());
        coefficientToUpdate.setVerstapen(coefficientFormula.getVerstapen());
        coefficientToUpdate.setPerez(coefficientFormula.getPerez());
        coefficientToUpdate.setAlonso(coefficientFormula.getAlonso());
        coefficientToUpdate.setStroll(coefficientFormula.getStroll());
        coefficientToUpdate.setNorris(coefficientFormula.getNorris());
        coefficientToUpdate.setPiastri(coefficientFormula.getPiastri());
        coefficientToUpdate.setGasly(coefficientFormula.getGasly());
        coefficientToUpdate.setOcon(coefficientFormula.getOcon());
        coefficientToUpdate.setBottas(coefficientFormula.getBottas());
        coefficientToUpdate.setZhou(coefficientFormula.getZhou());
        coefficientToUpdate.setTsunoda(coefficientFormula.getTsunoda());
        coefficientToUpdate.setDeVries(coefficientFormula.getDeVries());
        coefficientToUpdate.setMagnussen(coefficientFormula.getMagnussen());
        coefficientToUpdate.setHulkenberg(coefficientFormula.getHulkenberg());
        coefficientToUpdate.setAlbon(coefficientFormula.getAlbon());
        coefficientToUpdate.setSargeant(coefficientFormula.getSargeant());
        coefficientFormulaRepository.save(coefficientToUpdate);
        return coefficientToUpdate;
    }

    public CoefficientFormula getCoefficient(String name) {
        return coefficientFormulaRepository.findByName(name);
    }
}
