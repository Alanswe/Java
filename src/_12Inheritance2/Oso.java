package _12Inheritance2;

public class Oso extends Animal {
    
    // Métodos
    
    @Override
    public String identificar(){
        return "Soy un OSO";
    }
 
    // Contructor
    
    public Oso(double peso) {
        super(peso);
    }
    
}
