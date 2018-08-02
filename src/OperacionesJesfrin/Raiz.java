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
    
    private double indice;
    private double radicando;
    private double resultado;
    
    public Raiz(double indice, double radicando){
        this.indice=indice;
        this.radicando=radicando;
        this.resultado=Math.pow(radicando, 1.0/indice);
    }

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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    
}
