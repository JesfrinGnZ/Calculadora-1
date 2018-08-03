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

    //Atributos
    private ArrayList<Double> numeros;
    private Double resultado;

    //Constructor
    public Multiplicacion(ArrayList<Double> numeros) {
        this.numeros = numeros;
        this.resultado = calcularMultiplicacion();
    }

    //Getter and setter
    public ArrayList<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double calcularMultiplicacion() {
        double acumulacion = 1;
        for (Double numeroActual : numeros) {
            acumulacion *= numeroActual;
        }
        return acumulacion;
    }

}
