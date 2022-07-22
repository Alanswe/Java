package _exceptions;

public class StringIndexOutOfBoundExample {
    public static void main(String[] args) {
        try{
            String a = "Esto es un texto de prueba "; 
            char c = a.charAt(30); // accediendo al elemento 30
            System.out.println(c);
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Capturada excepción tipo StringIndexOutOfBoundsException");
        } finally {
            System.out.println("Salgo del try");
        }        
    }
    
}
