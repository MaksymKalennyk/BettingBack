package com.example.betting.controllers;

import com.example.betting.models.CoefficientFormula;
import com.example.betting.service.CoefficientFormulaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CoefficientFormulaController {

    private final CoefficientFormulaService coefficientFormulaService;

    public CoefficientFormulaController(CoefficientFormulaService coefficientFormulaService) {
        this.coefficientFormulaService = coefficientFormulaService;
    }

    @PostMapping("/admin/submit/formula")
    public CoefficientFormula addCoefficient(@RequestBody CoefficientFormula coefficientFormula){
        return coefficientFormulaService.addCoefficient(coefficientFormula);
    }
    @PostMapping("/admin/update/formula")
    public CoefficientFormula updateCoefficient(@RequestBody CoefficientFormula coefficientFormula){
        return coefficientFormulaService.updateCoefficient(coefficientFormula);
    }
    @GetMapping("/get/coefficient/formula")
    public CoefficientFormula getCoefficient(@RequestParam("name") String name){
        return coefficientFormulaService.getCoefficient(name);
    }
}
