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

    private double minuendo;
    private double sustraendo;
    private String diferencia;

    public Resta(double numero1, double numero2) {
        this.minuendo = numero1;
        this.sustraendo = numero2;
        this.diferencia = calcularResta();
    }

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

    public String getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(String resultado) {
        this.diferencia = resultado;
    }

    public String calcularResta() {
        double resultadoD = this.minuendo - this.sustraendo;
        String[] resultadoSeparado = String.valueOf(resultadoD).split(".");
        if (resultadoSeparado[1].equals("0")) {
            return resultadoSeparado[0];
        } else {
            return String.valueOf(resultadoD);
        }
    }
}
