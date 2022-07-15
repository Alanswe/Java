package _12Inheritance;

public class OsoMejorado extends AnimalMejorado {
    
    // Métodos
    
    @Override
    public String identificar(){
        return "Soy un OSO";
    }
    
    @Override
    void rugir(byte n){
        for (byte i = (byte)0;i < n; i++){
        System.out.print("Grrrrr ");
        }
    }
    
    // Contructor
    
    public OsoMejorado(double peso) {
        super(peso);
    }
    
}
