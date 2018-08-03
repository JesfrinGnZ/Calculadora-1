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
public class Residuo {
    
    //Atributos
    private int dividendo;
    private int divisor;
    private int residuo;
    
    //Constructor
    public Residuo(int dividendo, int divisor){
        this.dividendo=dividendo;
        this.divisor=this.divisor;
        this.residuo = dividendo%divisor;
    }

    //Getter and setter
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getResiduo() {
        return residuo;
    }

    public void setResiduo(int residuo) {
        this.residuo = residuo;
    }
    
    
}
