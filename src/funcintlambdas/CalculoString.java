package funcintlambdas;

public class CalculoString {
    
//    public static boolean SonIguales(String sA, String sB){
//        if (sA == sB){
//            return true;
//        } else {
//            return false;
//        }
//    }
    
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
        TestString numCaracteres = s -> s.length() > 3;
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
        System.out.println(compruebaStrings(arrayDeStrings, empiezaPorA));

        public static String[] compruebaStrings(String[] arr, TestString filtro){
            String[] arrayFinal = {};
            int contador = 0;
            for (String i : arr){
                if (filtro.comprueba(i) == true) {
                    arrayFinal[contador] = i;
                }
            contador++;
            }  
            return arrayFinal;
        }
    
    }
}
