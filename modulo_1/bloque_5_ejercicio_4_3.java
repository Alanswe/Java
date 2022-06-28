public class bloque_5_ejercicio_4_3 {
    public static void main(String[] args) throws Exception {
        char miCaracter1 = 'd', miCaracter2 = 'a';

        boolean validos = 
            miCaracter1 >= 'a' && miCaracter1 <= 'z' || miCaracter2 >= 'a' && miCaracter2 <= 'z';
        
        char mayor = miCaracter1 > miCaracter2 ? miCaracter1 : miCaracter2; 
        char menor = miCaracter1 <= miCaracter2 ? miCaracter1 : miCaracter2;
        
        boolean seguidos = mayor - menor == 1;
        boolean iguales = mayor - menor == 0;
                
        if (!validos) {
            System.out.println("Alguna de las letras no es del alfabeto inglés en minúsculas.");
        } else if (iguales) {
            System.out.println("Las dos letras introducidas son la " + miCaracter1 + ".");
        } else if(!seguidos) {
            System.out.println("Entre las letras " + menor + " y " + mayor
                + " está a la mitad la letra " + (char)((mayor + menor) / 2) + ".");
        } else {
            System.out.println("Entre las letras " + menor + " y " + mayor + " no hay letras.");
        }
    }
}
