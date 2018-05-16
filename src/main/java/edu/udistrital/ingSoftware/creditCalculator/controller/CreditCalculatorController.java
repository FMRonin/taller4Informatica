package edu.udistrital.ingSoftware.creditCalculator.controller;

import edu.udistrital.ingSoftware.creditCalculator.service.CreditCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreditCalculatorController {

    @Autowired
    private  CreditCalculatorService calculatorService;

    @GetMapping("/creditCalculator")
    public String retriveCalculator(@RequestParam("data") String item){
        return "Hola mundo: " + item;
    }

    @PostMapping("/creditCalculator/testPOST")
    public String retrivePostCalculator(@RequestBody String PostRetrive){
        return "Hola Mundo POST " + PostRetrive;
    }
}
