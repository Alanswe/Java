package _12Inheritance2;

public class Gato extends Animal {
    
    // Métodos
    
    @Override
    public String identificar(){
        return "Soy un GATO";
    }
    
    // Contructor
    
    public Gato(double peso) {
        super(peso);
    }
    
}
