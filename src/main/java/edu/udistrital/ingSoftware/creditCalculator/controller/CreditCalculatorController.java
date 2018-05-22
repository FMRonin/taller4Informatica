package edu.udistrital.ingSoftware.creditCalculator.controller;

import edu.udistrital.ingSoftware.creditCalculator.model.RequestCredito;
import edu.udistrital.ingSoftware.creditCalculator.model.ResponseCredito;
import edu.udistrital.ingSoftware.creditCalculator.service.CreditCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreditCalculatorController {

    @Autowired
    private  CreditCalculatorService calculatorService;

    @PostMapping("/creditCalculator/variable")
    public ResponseEntity<ResponseCredito> retriveCreditoVariable(@RequestBody RequestCredito requestCredito){
        return new ResponseEntity<ResponseCredito>(calculatorService.retornarCreditoVariable(requestCredito), HttpStatus.OK);
    }

    @PostMapping("/creditCalculator/fijo")
    public ResponseEntity<ResponseCredito> retriveCreditoFijo(@RequestBody RequestCredito requestCredito){
        return new ResponseEntity<ResponseCredito>(calculatorService.retornarCreditoFijo(requestCredito), HttpStatus.OK);
    }
}
