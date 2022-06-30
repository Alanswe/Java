public class bloque_7_arrays_bucle_2 {
    public static void main(String[] args) throws Exception {
        // 1 Crea un array de enteros que contenga los cuadrados (x * x) de los números del 1 al 100).
        System.out.println("\n1------------------------------------------------");

        int[] array01 = new int[100];
        int indice_inicial = 0, mamaño_final = 100;
        for (int i = indice_inicial;i < mamaño_final;i++){
            array01[i] = (i+1) * (i+1);
        }
        for (int num: array01){
            System.out.print(num+" ");
        }

        // 2 Recorrelo, de forma que que se impriman aquellos que son múltiplos de un número que se indicará con una variable llamada multiploDe.
        System.out.println("\n2------------------------------------------------");

        int multiploDe = 10;

        for (int elem : array01) {
            if (elem % multiploDe == 0){
                System.out.print(elem+" ");
            }
        }

        // 3 Crea un nuevo Array de tamaño igual al anterior e incorpora los datos que cumplan la condición de múltiplos de multiploDe (deben ser consecutivos empezando por la primera posición - 0 - por lo que las posiciones “sin valores” quedarán al final).
        System.out.println("\n3------------------------------------------------");

        int[] array03 = new int[array01.length];
        int indice = 0;
        for (int elem : array01) {
            if (elem % multiploDe == 0){
               array03[indice++] = elem;
            }
        }
        for (int elem : array03) {
           System.out.print(elem+" ");
        }
    
        // 4 Crear un nuevo Array del tamaño exacto necesario para contener el resultado del apartado anterior y traspasa todos los valores a este nuevo Array desde el anterior.
        System.out.println("\n4------------------------------------------------");

        int[] array04 = new int[indice];

        for (int i = 0; i < indice; i++){
            array04[i] = array03[i];
        }

        for (int elem : array04) {
           System.out.print(elem+" ");
        }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
