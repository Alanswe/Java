package ModuloDos;

public class InicializadorEstatico {
    
    // cada vez que se ejecute la clase, se ejecutan los inicadores estatico primero
    
    static{System.out.println("Soy el primer inicializador estático");}
    
    public static void main(String[] args) {
        System.out.println("Esto es en el main");
    }
    
    static{System.out.println("Soy el segundo inicializador estático");}
}
