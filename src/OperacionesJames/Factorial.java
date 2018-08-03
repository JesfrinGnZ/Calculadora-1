package OperacionesJames;

/**
 *
 * @author james
 */
public class Factorial {
   private double numero;
   private double resultado;

    public Factorial() {
    }

    public Factorial(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   
   public static Factorial operacionFactorial(double numero){
       Factorial fact = null;
       
       if(numero == 0){
           return fact = new Factorial(numero,1);
       }else{
           double resultado = numero * Factorial.operacionFactorial((numero - 1)).getResultado();
           fact = new Factorial(numero,resultado);
           return fact;
       }
   }
}
