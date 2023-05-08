package com.example.betting.controllers;

import com.example.betting.models.Coefficient;
import com.example.betting.service.CoefficientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CoefficientController {

    private final CoefficientService coefficientService;

    public CoefficientController(CoefficientService coefficientService) {
        this.coefficientService = coefficientService;
    }

    @PostMapping("/admin/submit")
    public Coefficient addCoefficient(@RequestBody Coefficient coefficient){
        return coefficientService.addCoefficient(coefficient);
    }
    @PostMapping("/admin/update")
    public Coefficient updateCoefficient(@RequestBody Coefficient coefficient){
        return coefficientService.updateCoefficient(coefficient);
    }
    @GetMapping("/get/coefficient")
    public Coefficient getCoefficient(@RequestParam("name") String name){
        return coefficientService.getCoefficient(name);
    }
}
