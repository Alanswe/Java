package _12Inheritance2;

public class Perro extends Animal {
    
    // Métodos
    
    @Override
    public String identificar(){
        return "Soy un PERRO";
    }
    
    // Contructor
    
    public Perro(double peso) {
        super(peso);
    }
    
}
