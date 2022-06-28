public class bloque_5_ejercicio_3_2 {
    public static void main(String[] args) throws Exception {

    char miCaracter = 'F';
    boolean alfIng = miCaracter >= 'a' && miCaracter <= 'z' || miCaracter >= 'A' && miCaracter <= 'Z';

        if(alfIng) {
            System.out.println(
                    "El carácter leído es una letra del abecedario inglés.");
            System.out.println("El valor leído está en " 
            + (miCaracter > 'Z' ? "minúsculas: " : "mayúsculas: ") 
            + miCaracter);
            System.out.println("Valor transformado: " 
                + (char)(miCaracter > 'Z' ? 
                        miCaracter -32 : miCaracter +32));    
        } else {
            System.out.println(
                    "El carácter NO es una letra del abecedario inglés.");
        }
    }   
}
