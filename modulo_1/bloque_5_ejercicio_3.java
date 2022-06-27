public class bloque_5_ejercicio_3 {
    public static void main(String[] args) throws Exception {
        char miCaracter = 'G';

        if (miCaracter >= 65 && miCaracter <= 90) {
            System.out.println("El carácter leído es una letra del abecedario inglés.\nEl valor leído está en mayusculas: " + miCaracter + "\nValor transformado: " + Character.toLowerCase(miCaracter));
        } else if (miCaracter >= 97 && miCaracter <= 122) {
            System.out.println("El carácter leído es una letra del abecedario inglés.\nEl valor leído está en minúsculas: " + miCaracter + "\nValor transformado: " + Character.toUpperCase(miCaracter));
        } else {
            System.out.println("El carácter leído NO es una letra del abecedario inglés.");
        }
        
        /*
        El carácter leído es una letra del abecedario inglés.
        El valor leído está en minúsculas: f
        Valor transformado: F
        */
    }
}
