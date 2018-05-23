package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;

public
class Cuota {

    private int saldo;
    private int abonoCapital;
    private int interesGenerado;
    private int amortizacion;
    private int cuota;

    public
    Cuota(int saldo, int abonoCapital, int interesGenerado, int amortizacion, int cuota) {
        this.saldo = saldo;
        this.abonoCapital = abonoCapital;
        this.interesGenerado = interesGenerado;
        this.amortizacion = amortizacion;
        this.cuota = cuota;
    }

    public
    int getSaldo() {
        return saldo;
    }

    public
    void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public
    int getAbonoCapital() {
        return abonoCapital;
    }

    public
    void setAbonoCapital(int abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public
    int getInteresGenerado() {
        return interesGenerado;
    }

    public
    void setInteresGenerado(int interesGenerado) {
        this.interesGenerado = interesGenerado;
    }

    public
    int getAmortizacion() {
        return amortizacion;
    }

    public
    void setAmortizacion(int amortizacion) {
        this.amortizacion = amortizacion;
    }

    public
    int getCuota() {
        return cuota;
    }

    public
    void setCuota(int cuota) {
        this.cuota = cuota;
    }

}
