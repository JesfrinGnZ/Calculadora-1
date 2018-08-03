/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesJesfrin;

/**
 *
 * @author jesfrin
 */
public class Resta {

    //Atributos
    private double minuendo;
    private double sustraendo;
    private Double diferencia;

    //Constructor
    public Resta(double numero1, double numero2) {
        this.minuendo = numero1;
        this.sustraendo = numero2;
        this.diferencia = this.minuendo - this.sustraendo;
    }

    //getter and setter
    public double getMinuendo() {
        return minuendo;
    }

    public void setMinuendo(double minuendo) {
        this.minuendo = minuendo;
    }

    public double getSustraendo() {
        return sustraendo;
    }

    public void setSustraendo(double sustraendo) {
        this.sustraendo = sustraendo;
    }

    public Double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Double resultado) {
        this.diferencia = resultado;
    }


}
