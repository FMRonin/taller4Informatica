package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;
import java.util.List;

public class ResponseCredito {

    private List<Cuota> cuotas;

    private int totalCuotas;

    public void AddCuota (int saldo,
                          int abonoCapital,
                          int interesGenerado,
                          int amortizacion,
                          int cuota) {
        cuotas.add(new Cuota(saldo,abonoCapital, interesGenerado, amortizacion,cuota));
        totalCuotas = cuotas.size();
    }

    public
    List<Cuota> getCuotas() {
        return cuotas;
    }

    public
    void setCuotas(List<Cuota> cuotas) {
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
