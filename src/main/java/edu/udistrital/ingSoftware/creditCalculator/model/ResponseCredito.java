package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;
import java.util.*;

public class ResponseCredito {

    private ArrayList<Cuota> cuotas;

    private int totalCuotas;



    public void AddCuota (double saldo,
                          double abonoCapital,
                          double interesGenerado,
                          double amortizacion,
                          int cuota) {
        if(cuotas == null){
            cuotas = new ArrayList<Cuota>();
        }
        cuotas.add(new Cuota(saldo,abonoCapital, interesGenerado, amortizacion,cuota));
        totalCuotas = cuotas.size();
    }

    public
    ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public
    void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public
    int getTotalCuotas() {
        return totalCuotas;
    }

    public
    void setTotalCuotas(int totalCuotas) {
        this.totalCuotas = totalCuotas;
    }
}
