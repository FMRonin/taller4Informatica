package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;
import java.util.*;

public class ResponseCredito {

    private ArrayList<Cuota> cuotas;

    private int totalCuotas;

    public void AddCuota (int saldo,
                          int abonoCapital,
                          int interesGenerado,
                          int amortizacion,
                          int cuota) {
        cuotas = new ArrayList<Cuota>();
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
