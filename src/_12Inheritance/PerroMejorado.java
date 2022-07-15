package _12Inheritance;

public class PerroMejorado extends AnimalMejorado {
    
    // Métodos
    
    public String identificar(){
        return "Soy un PERRO";
    }
    
    // Contructor
    
    public PerroMejorado(double peso) {
        super(peso);
    }
    
}
