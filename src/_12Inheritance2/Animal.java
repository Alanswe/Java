package _12Inheritance2;

public abstract class Animal {
    // Propiedades
    
    protected double peso;
    
    protected String color;
    
    // Métodos
    
    public abstract String identificar();
    
    // constuctores
    
    Animal(double peso){
        this.peso = peso;
    }
    
    // Getter

    public double getPeso() {
        return peso;
    }
    
}
