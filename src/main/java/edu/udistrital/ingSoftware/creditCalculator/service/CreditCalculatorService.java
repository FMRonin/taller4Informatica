package edu.udistrital.ingSoftware.creditCalculator.service;

import edu.udistrital.ingSoftware.creditCalculator.model.Credito;
import edu.udistrital.ingSoftware.creditCalculator.model.RequestCredito;
import edu.udistrital.ingSoftware.creditCalculator.model.ResponseCredito;
import org.springframework.stereotype.Component;

@Component
public class CreditCalculatorService {


    public Credito retornarCreditoVariable(Credito requestCredito) {

        return requestCredito;
    }

   /* public ResponseCredito retornarCreditoFijo(RequestCredito requestCredito) {
    }*/
}
