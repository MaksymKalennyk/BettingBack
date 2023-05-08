package com.example.betting.controllers;

import com.example.betting.models.FormulaDrivers;
import com.example.betting.service.FormulaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FormulaController {

    private final FormulaService formulaService;

    public FormulaController(FormulaService formulaService) {
        this.formulaService = formulaService;
    }

    @GetMapping("/get/formula")
    public List<FormulaDrivers> getFormula(@RequestParam("id") int id){
        System.out.println(formulaService.getDriversById(id));
        return formulaService.getDriversById(id);
    }
}
