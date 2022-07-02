public class bloque_5_ejercicio_4 {
    public static void main(String[] args) throws Exception {
     char miCaracter1 = '@', miCaracter2 = 'g';


        if (miCaracter1 <= 65 && miCaracter1 >= 90) {
            System.out.println("Alguna de las letras no es del alfabeto inglés.");
        } else if (miCaracter1 == miCaracter2) {
            System.out.println("Las dos letras introducidas son la " + miCaracter1);
        }

        /*
         * 
         * else {
            System.out.println("El carácter leído NO es una letra del abecedario inglés.");
        }
        
        //Alguna de las letras no es del alfabeto inglés.

         */
    }
}
