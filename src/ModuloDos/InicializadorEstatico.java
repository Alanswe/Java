package ModuloDos;

public class InicializadorEstatico {
    
    // cada vez que se ejecute la clase, se ejecutan los inicadores estatico primero
    
    static{System.out.println("Soy el primer inicializador estático");}
    
    
    
    public static void main(String[] args) {
        {System.out.println("Soy un inicializador de la clase (no estatico)");} // tiene que estar en el main
        
        System.out.println("Esto es en el main");
        
        {System.out.println("Soy otro inicializador de la clase");}

    }
    
    static{System.out.println("Soy el segundo inicializador estático");}
}
