package funcintlambdas;
import java.util.ArrayList;

public class CalculoString {
    
//    public static boolean SonIguales(String sA, String sB){
//        if (sA == sB){
//            return true;
//        } else {
//            return false;
//        }
//    }
    
        public static String[] compruebaStrings(String[] arr, TestString filtro){
        ArrayList<String> arrayFinal = new ArrayList<>();
        for (String i : arr){
            if (filtro.comprueba(i) == true) {
                arrayFinal.add(i);
            }
        }
        String[] arrayReturn = new String[arrayFinal.size()];
        arrayReturn = arrayFinal.toArray(arrayReturn);
        return arrayReturn;
        }
    
    
    public static void main(String[] args) {
//        System.out.println(SonIguales("Hola","Hola"));
//        System.out.println(SonIguales("Hola","Adios"));
        

        String s2 = "Adios";
        TestString sonIguales = s -> s == s2;
        System.out.println(sonIguales.comprueba("Hola"));
        
        System.out.println("================================");
        TestString contiene = s -> s.contains(".");
        System.out.println(contiene.comprueba("Hola . Adios"));
        
        System.out.println("================================");
        TestString numCaracteres = s -> s.length() < 3;
        System.out.println(numCaracteres.comprueba("HOla me llamo Pepe"));
        System.out.println(numCaracteres.comprueba("Yo"));
        
        System.out.println("================================");
        TestString empiezaPorA = s -> s.indexOf("A") == 0; 
        System.out.println(empiezaPorA.comprueba("Adios"));
        System.out.println(empiezaPorA.comprueba("AdiosA"));
        System.out.println(empiezaPorA.comprueba("DioSA"));
        
        System.out.println("================================");
        TestString terminaPorPunto = s -> s.endsWith(".");
        System.out.println(terminaPorPunto.comprueba("Hola"));
        System.out.println(terminaPorPunto.comprueba("Hola."));
        
        System.out.println("================================");
        TestString empiezaPorCaracter = s -> s2.startsWith(s);
        System.out.println(empiezaPorCaracter.comprueba("e"));
        System.out.println(empiezaPorCaracter.comprueba("A"));

        String[] arrayDeStrings = {"holas","Adios","HOla me llamo Pepe.","Yo"};
        
        System.out.println("================================");

        for (String elem : compruebaStrings(arrayDeStrings, empiezaPorA)){
            System.out.println(elem);
        }
    
        System.out.println("================================");

        for (String elem : compruebaStrings(arrayDeStrings, numCaracteres)){
            System.out.println(elem);
        }
        
        
    }
}
