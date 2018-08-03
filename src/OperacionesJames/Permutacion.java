package OperacionesJames;

import OperacionesJames.Factorial;

/**
 *
 * @author james
 */
public class Permutacion {

    /*
        

     */
    private double n;
    private double r;
    private double resultado;

    public Permutacion() {
    }

    public Permutacion(double n, double r, double resultado) {
        this.n = n;
        this.r = r;
        this.resultado = resultado;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /*
    
    La permutacion esta simbolizada asi:  nPr
        
        n es el primer numero/requisito
        r es el segundo numero/requisito
    
    La formula de la permutacion es:
    
            nPr = n! / (n - r)!
         
        n siempre debe se mayor a r, de lo contrario da error matematico

    
     */
    public static Permutacion operacionPermutacion(double n, double r) {

        Permutacion perm = null;

        if (n < r) {
            return null;
        } else {
            Factorial nFactorial = Factorial.operacionFactorial(n);
            Factorial nMenosRFactorial = Factorial.operacionFactorial(n - r);

            double resultado = nFactorial.getResultado() / nMenosRFactorial.getResultado();

            perm = new Permutacion(n, r, resultado);
            return perm;

        }

    }

}

