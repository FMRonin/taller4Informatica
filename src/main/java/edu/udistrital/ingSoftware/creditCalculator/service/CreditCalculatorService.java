package edu.udistrital.ingSoftware.creditCalculator.service;

import edu.udistrital.ingSoftware.creditCalculator.model.Credito;
import edu.udistrital.ingSoftware.creditCalculator.model.RequestCredito;
import edu.udistrital.ingSoftware.creditCalculator.model.ResponseCredito;
import org.springframework.stereotype.Component;

@Component
public class CreditCalculatorService {


    public ResponseCredito retornarCredito(RequestCredito requestCredito) {
        if(requestCredito.getCredito().isTipo() == Credito.FIJO)
        {
            return requestCredito.getCredito().CalcularFijo();

        }
    }
}
