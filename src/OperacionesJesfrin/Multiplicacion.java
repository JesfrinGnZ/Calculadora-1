/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesJesfrin;

import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class Multiplicacion {
    
     private ArrayList<Double> numeros;
    private String resultado;

    public Multiplicacion(ArrayList<Double> numeros) {
        this.numeros = numeros;
        this.resultado=calcularMultiplicacion();
    }

    public ArrayList<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String calcularMultiplicacion() {
        double acumulacion = 0;
        for (Double numeroActual : numeros) {
            acumulacion *= numeroActual;
        }
        String[] resultadoSeparado = String.valueOf(acumulacion).split(".");
        if(resultadoSeparado[1].equals("0")){
            return resultadoSeparado[0];
        }else{
            return String.valueOf(acumulacion);
        }
    }

    
}
