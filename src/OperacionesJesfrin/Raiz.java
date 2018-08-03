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
public class Raiz {
    
    //Atributos
    private double indice;
    private double radicando;
    private Double resultado;
    
    //Constructor
    public Raiz(double indice, double radicando){
        this.indice=indice;
        this.radicando=radicando;
        this.resultado=Math.pow(radicando, 1.0/indice);
    }

    //getter and setter
    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public double getRadicando() {
        return radicando;
    }

    public void setRadicando(double radicando) {
        this.radicando = radicando;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    
    
}
