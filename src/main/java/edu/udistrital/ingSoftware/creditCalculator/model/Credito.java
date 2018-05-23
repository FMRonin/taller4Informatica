package edu.udistrital.ingSoftware.creditCalculator.model;

import java.math.BigInteger;
import java.util.List;

public class Credito {

    public final static boolean VARIABLE = false;
    public final static boolean FIJO = true;

    private double monto;
    private int plazo;
    private double tasaInteres;
    private double cuota;
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
            double saldo = monto;
            int numCuota = 1;

            while (saldo > 0){

                double interes = (saldo*tasaInteres)/1200.0;

                responseCredito.AddCuota(saldo-cuota,cuota,interes,cuota+interes,numCuota);
                numCuota++;
                saldo = saldo - cuota;
            }

        }else if (cuota == 0){

        }
        return responseCredito;
    }

    public static boolean isVARIABLE() {
        return VARIABLE;
    }

    public static boolean isFIJO() {
        return FIJO;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public ResponseCredito getResponseCredito() {
        return responseCredito;
    }

    public void setResponseCredito(ResponseCredito responseCredito) {
        this.responseCredito = responseCredito;
    }
}
