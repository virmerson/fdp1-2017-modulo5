package com.htcursos.financasapp;

/**
 * Created by Virmerson on 14/10/17.
 */

public class Calculadora {



    public Double somar(Double n1, Double n2){
        return n1 + n2;

    }


    public Double somar(String n1, String n2){

        Double valor1 =   new Double (n1);
        Double valor2 =   new Double (n2);

        return somar(valor1, valor2);

    }

    public Double multi (String n1, String n2) {
        Double valor1 =   new Double (n1);
        Double valor2 =   new Double (n2);

        return multi(valor1, valor2);
    }

    public Double multi (Double n1, Double n2) {

        return n1 * n2;
    }

    public Double subtrair(String n1, String n2) {
        Double valor1 =   new Double (n1);
        Double valor2 =   new Double (n2);

        return subtrair(valor1, valor2);
    }

    public Double subtrair(Double n1, Double n2) {
        return n1 - n2;
    }

    public Double divi(String n1, String n2) {
        Double valor1 =   new Double (n1);
        Double valor2 =   new Double (n2);

        return divi(valor1, valor2);
    }

    public Double divi(Double n1, Double n2) {
        return n1 / n2;
    }
}
