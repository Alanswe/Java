package _12Inheritance;

public class Gato {
    // Propiedades
    
    private double peso;
    
    // Métodos
    
    public String identificar(){
        return "Soy un GATO";
    }
    
    // constuctores
    
    Gato(double peso){
        this.peso = peso;
    }
       
    // Getter

    public double getPeso() {
        return peso;
    }
}
