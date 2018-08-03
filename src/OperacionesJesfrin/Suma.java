/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesJesfrin;

import java.util.ArrayList;

/**
 *
 * @author jenkins
 */
public class Suma {

    //Atributos
    private ArrayList<Double> numeros;
    private Double resultado;

    //Constructor
    public Suma(ArrayList<Double> numeros) {
        this.numeros = numeros;
        this.resultado=calcularSuma();
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

    public Double calcularSuma() {
        double acumulacion = 0;
        for (Double numeroActual : numeros) {
            acumulacion += numeroActual;
        }
        return acumulacion;

    }
}
