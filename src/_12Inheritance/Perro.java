package _12Inheritance;

public class Perro {
    // Propiedades
    
    private double peso;
    
    // Métodos
    
    public String identificar(){
        return "Soy un PERRO";
    }
   
    // constuctores
    
    Perro(double peso){
        this.peso = peso;
    }
   
    // Getter

    public double getPeso() {
        return peso;
    }
}
