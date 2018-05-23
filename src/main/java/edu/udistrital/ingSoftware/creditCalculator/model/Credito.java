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
    private boolean tipo;

    private ResponseCredito responseCredito;

    public ResponseCredito CalcularFijo(){

        return responseCredito;
    }

    public ResponseCredito CalcularVariable(){

        return responseCredito;
    }

    public
    BigInteger getMonto() {
        return monto;
    }

    public
    void setMonto(BigInteger monto) {
        this.monto = monto;
    }

    public
    int getPlazo() {
        return plazo;
    }

    public
    void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public
    double getInteres() {
        return interes;
    }

    public
    void setInteres(double interes) {
        this.interes = interes;
    }

    public
    BigInteger getCuota() {
        return cuota;
    }

    public
    void setCuota(BigInteger cuota) {
        this.cuota = cuota;
    }

    public
    boolean isTipo() {
        return tipo;
    }

    public
    void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
