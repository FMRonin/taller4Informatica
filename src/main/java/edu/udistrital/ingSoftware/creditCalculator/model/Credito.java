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

        responseCredito = new ResponseCredito();

        double saldo = monto;
        int numCuota = 1;
        double tasaInteresMes = Math.pow(1 + (tasaInteres/100.0),1.0/12.0)-1;

        if(plazo == 0)
        {

            while (saldo > 0){
                double interes = Math.round(saldo*tasaInteresMes*100.0)/100.0;
                double abono = (saldo > cuota)?cuota - interes:saldo;
                abono = Math.round(abono*100.0)/100.0;
                responseCredito.AddCuota(Math.round(saldo - abono),abono,interes,abono + interes,numCuota);
                numCuota++;
                saldo = saldo - abono;
            }

        }else if (cuota == 0){

            cuota = monto * (tasaInteresMes / (1 - Math.pow(1 + tasaInteresMes, -1*plazo)));
            cuota = Math.round(cuota*100.0)/100.0;

            for (int i = 0 ; i < plazo ; i++){
                double interes = Math.round(saldo*tasaInteresMes*100.0)/100.0;
                double abono = cuota - interes;
                responseCredito.AddCuota(Math.round(saldo - abono),Math.round(abono),interes,cuota,i+1);
                saldo = saldo - abono;
                saldo = Math.round(saldo);
            }

        }
        return responseCredito;
    }

    public ResponseCredito CalcularVariable(){

        responseCredito = new ResponseCredito();

        double saldo = monto;
        int numCuota = 1;
        double tasaInteresMes = Math.pow(1 + (tasaInteres/100.0),1.0/12.0)-1;

        if(plazo == 0)
        {

            while (saldo > 0){
                double interes = Math.round(saldo*tasaInteresMes*100.0)/100.0;
                responseCredito.AddCuota(saldo-cuota,cuota,interes,cuota+interes,numCuota);
                numCuota++;
                saldo = saldo - cuota;
            }

        }else if (cuota == 0){

            cuota = monto/(double) plazo;

            for (int i = 0 ; i < plazo ; i++){
                double interes = Math.round(saldo*tasaInteresMes*100.0)/100.0;
                responseCredito.AddCuota(saldo-cuota,cuota,interes,cuota+interes,i+1);
                saldo = saldo - cuota;
            }

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
