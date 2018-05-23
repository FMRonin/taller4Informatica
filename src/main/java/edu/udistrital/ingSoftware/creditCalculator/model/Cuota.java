package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;

public
class Cuota {

    private double saldo;
    private double abonoCapital;
    private double interesGenerado;
    private double amortizacion;
    private int cuota;

    public
    Cuota(double saldo, double abonoCapital, double interesGenerado, double amortizacion, int cuota) {
        this.saldo = saldo;
        this.abonoCapital = abonoCapital;
        this.interesGenerado = interesGenerado;
        this.amortizacion = amortizacion;
        this.cuota = cuota;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public double getInteresGenerado() {
        return interesGenerado;
    }

    public void setInteresGenerado(double interesGenerado) {
        this.interesGenerado = interesGenerado;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
}
