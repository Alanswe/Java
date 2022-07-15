package _12Inheritance;

public class AnimalMejorado {
    // Propiedades
    
    protected double peso;
    
    protected String color;
    
    // Métodos
    
    public String identificar(){
        return "Soy un ANIMAL";
    }
    
    // constuctores
    
    AnimalMejorado(double peso){
        this.peso = peso;
    }
    
    // Getter

    public double getPeso() {
        return peso;
    }

    void rugir(byte b) { // sirve para referenciar en el a5 de _1_OverviewPolimorphism
    
    }
}
