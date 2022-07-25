package funcintlambdas;

public class CalculoString {
    
    public static boolean SonIguales(String sA, String sB){
        if (sA == sB){
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println(SonIguales("Hola","Hola"));
        System.out.println(SonIguales("Hola","Adios"));
        
        
        
    }
    
}
