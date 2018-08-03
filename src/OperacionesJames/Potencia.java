package OperacionesJames;

/**
 *
 * @author james
 */
public class Potencia {
    
    private double base;
    private int potencia;
    private double resultado;

    public Potencia() {
    }

    public Potencia(double base, int potencia, double resultado) {
        this.base = base;
        this.potencia = potencia;
        this.resultado = resultado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

   
    
   
    
    
    public static Potencia operacionPotencia(int base, int potencia){
        Potencia poten = null;
        
        double resultado = Math.pow(base, potencia);
        
        poten = new Potencia(base, potencia, resultado);
        
        return poten;
    }
    
}
