package _12Inheritance;

public class Animal {
    // Propiedades
    
    double peso;
    
    // Métodos
    
    public String identificar(){
        return "Soy un ANIMAL";
    }
    
    // constuctores
    
    Animal(double peso){
        this.peso = peso;
    }
    
    // Getter

    public double getPeso() {
        return peso;
    }
    
    
}
