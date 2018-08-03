package OperacionesJames;

/**
 *
 * @author james
 */
public class Potencia {
    
    private double base;
    private double potencia;
    private double resultado;

    public Potencia() {
    }

    public Potencia(double base, double potencia, double resultado) {
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

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

   
    
   
    
    
    public static Potencia operacionPotencia(double base, double potencia){
        Potencia poten = null;
        
        double resultado = Math.pow(base, potencia);
        
        poten = new Potencia(base, potencia, resultado);
        
        return poten;
    }
    
}
