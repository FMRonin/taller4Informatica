package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;
import java.util.List;

public class Credito {

    public final static boolean VARIABLE = false;
    public final static boolean FIJO = true;

    private BigInteger monto;
    private int plazo;
    private double interes;
    private BigInteger cuota;

    public void CalcularFijo(){

    }

    public void CalcularVariable(){

    }
}
