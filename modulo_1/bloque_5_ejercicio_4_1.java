public class bloque_5_ejercicio_4_1 {
    public static void main(String[] args) throws Exception {
     char miCaracter1 = 'a', miCaracter2 = 'b';

        if ((miCaracter1 >= 'a' && miCaracter1 <= 'z') && (miCaracter2 >= 'a' && miCaracter2 <= 'z')) {
           if (miCaracter1 == miCaracter2) {
            System.out.println("Las dos letras introducidas son la " + miCaracter1 + ". ");
            } else {
                if (((char)(((miCaracter2 - miCaracter1) / 2))) <= 1) {
                    System.out.println("Entre las letras " + miCaracter1 + " y " + miCaracter2 + " no hay letras.");
                } else {
                    System.out.println((char)(((miCaracter2 - miCaracter1) / 2) + miCaracter1));
                }
            }
        } else {
            System.out.println("Alguna de las letras no es del alfabeto inglés en minúsculas.");
        }
    }
}

// con f y j da i - 105
// con a y d da Entre las letras a y b no hay letras.
// con F y j da Alguna de las letras no es del alfabeto inglés en minúsculas. 
