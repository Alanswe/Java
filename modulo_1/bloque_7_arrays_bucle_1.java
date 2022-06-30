public class bloque_7_arrays_bucle_1 {
    
    public static void main(String[] args) throws Exception {

        // 1 Crea un array sin datos y llámalo array01 y rellénalo con los valores en orden del 1 al 10 utilizando un bucle for para ello.

        int[] array01 = new int[10];
        for (int i = 0; i < 10;i++){
            
            System.out.print("Posición ["+i+"], Antes "+array01[i]);
            array01[i] = i + 1;
            System.out.print(", Después "+array01[i]+" \n");
        }         
        
        System.out.println("");

        for (int num: array01){
            System.out.print(num+" ");
        }
        
        // 2 Crea un array vacío y llámalo array02 y rellénalo con los valores en orden del 1 al 10 utilizando un bucle while para ello.
        System.out.println("\n2------------------------------------------------");

        int[] array02 = new int[10];

        int i = 0;
        while (i < 10) {
            System.out.print("Posición ["+i+"], Antes "+array02[i]);
            array02[i] = i + 1;
            System.out.print(", Después "+array02[i]+" \n");
            i++;
        }
        for (int num: array02){
            System.out.print(num+" ");
        }

        // 3 Crea un array vacío y llámalo array03 y rellénalo con los valores en orden del 1 al 10 utilizando un bucle do-while para ello.
        System.out.println("\n3------------------------------------------------");

        int[] array03 = new int[10];

        int contador_3 = 0;
        do {
            System.out.print("Posición ["+contador_3+"], Antes "+array03[contador_3]);
            array03[contador_3] = contador_3 + 1;
            System.out.print(", Después "+array03[contador_3]+" \n");
            contador_3++;
        } while (contador_3 < 10);

        for (int num: array03){
            System.out.print(num+" ");
        }
        // 4 Crea un array vacío y llámalo array04 y rellénalo con los valores en orden del 10 al 1 utilizando un bucle for para ello.
        System.out.println("\n4------------------------------------------------");

        int[] array04 = new int[10];
        for (int contador_4 = 0; contador_4 < 10; contador_4++){
            System.out.print("Posición ["+contador_4+"], Antes "+array04[contador_4]);
            array04[contador_4] = 10 - contador_4;
            System.out.print(", Después "+array04[contador_4]+" \n");
        }         
        
        System.out.println("");

        for (int num: array04){
            System.out.print(num+" ");
        }

        // 5 Crea un array vacío y llámalo array05 y rellénalo con los valores en orden del 10 al 1 utilizando un bucle while para ello.
        System.out.println("\n5------------------------------------------------");

        int[] array05 = new int[10];

        int contador_5 = 0;
        while (contador_5 < 10) {
            System.out.print("Posición ["+contador_5+"], Antes "+array05[contador_5]);
            array05[contador_5] = 10 - contador_5;
            System.out.print(", Después "+array05[contador_5]+" \n");
            contador_5++;
        }
        for (int num: array05){
            System.out.print(num+" ");
        }

        // 6 Crea un array vacío y llámalo array06 y rellénalo con los valores en orden del 10 al 1 utilizando un bucle do-while para ello.
        System.out.println("\n6------------------------------------------------");

        int[] array06 = new int[10];

        int contador_6 = 0;
        do {
            System.out.print("Posición ["+contador_6+"], Antes "+array06[contador_6]);
            array06[contador_6] = 10 - contador_6;
            System.out.print(", Después "+array06[contador_6]+" \n");
            contador_6++;
        } while (contador_6 < 10);

        for (int num: array06){
            System.out.print(num+" ");
        }

        // 7 Crea un array nuevo vacío y llámalo array10 y rellénalo con los valores pares que obtendrás de recorrer con un bucle for-each array01. Comprueba el resultado.
        System.out.println("\n7------------------------------------------------");

        // 8 Crea un array nuevo vacío y llámalo array11 y rellénalo con los valores pares que obtendrás de recorrer con un bucle for-each array01. Comprueba el resultado. ¿Son array10 y array11 iguales?
        System.out.println("\n8------------------------------------------------");




















    }
}
