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
public class Division {

    private double dividendo;
    private double divisor;
    private double cociente;

    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
        this.cociente = this.dividendo / this.divisor;

    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    public double getCociente() {
        return cociente;
    }

    public void setCociente(double cociente) {
        this.cociente = cociente;
    }

}
