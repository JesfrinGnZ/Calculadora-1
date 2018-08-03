package OperacionesJames;


/**
 *
 * @author james
 */
public class Combinacion {
    
    private double n;
    private double r;
    private double resultado;

    public Combinacion() {
    }

    public Combinacion(double n, double r, double resultado) {
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
    La combinacion esta simbolizada asi:  nCr
        
        n es el primer numero/requisito
        r es el segundo numero/requisito
    
    La formula de la combinacion es:
    
            nCr =   n!   /   (n - r)! * r!
         
        n siempre debe se mayor a r, de lo contrario da error matematico

    */
    
    
    public static Combinacion operacionCombinacion(int n, int r) {

        Combinacion comb = null;

        if (n < r) {
            return null;
        } else {
            Factorial nFactorial = Factorial.operacionFactorial(n);
            Factorial rFactorial = Factorial.operacionFactorial(r);
            Factorial nMenosRFactorial = Factorial.operacionFactorial(n - r);

            double resultado = nFactorial.getResultado() / (nMenosRFactorial.getResultado() * rFactorial.getResultado());

            comb = new Combinacion(n, r, resultado);
            return comb;

        }

    }
}
