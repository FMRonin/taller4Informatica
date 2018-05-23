package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;
import java.util.List;

public class Credito {

    public final static boolean VARIABLE = false;
    public final static boolean FIJO = true;

    private int monto;
    private int plazo;
    private double interes;
    private int cuota;
    private boolean tipo;

    private ResponseCredito responseCredito;

    public ResponseCredito CalcularFijo(){
        //TODO: Calcular credito variable
        return responseCredito;
    }

    public ResponseCredito CalcularVariable(){

        responseCredito = new ResponseCredito();

        if(plazo == 0)
        {
            int saldo = monto;
            int numCuota = 1;

            while (saldo > 0){
                responseCredito.AddCuota(saldo-cuota,cuota,(int)(saldo*interes),(int)(cuota+saldo*interes),numCuota);
                saldo -= cuota;
            }

        }else if (cuota == 0){

        }
        return responseCredito;
    }

    public
    int getMonto() {
        return monto;
    }

    public
    void setMonto(int monto) {
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
    int getCuota() {
        return cuota;
    }

    public
    void setCuota(int cuota) {
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
