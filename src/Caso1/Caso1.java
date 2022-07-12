package Caso1;

public class Caso1 {
    
    public static void main(String[] args) {
    
    byte min = 35;
    long max = 200L;
    int step = 17; 
    
    
    //array1 -------------------------------------------------------------------
        System.out.println("array1");
        System.out.println("======");
        System.out.println("Array de shorts entre min y max saltado de step en step."
                + "\nOrden ascendente\n");
        
            
        short[] array1 = new short[10];
        short parcial1 = (short)min;
        
        for (int i = 0; i < array1.length; i++){
            array1[i] = parcial1;
            parcial1 = (short)(parcial1 + step);
            
        }

        for (int num: array1){
            System.out.print(num + " ");
        }
        
        System.out.println("\n");

    //array2 -------------------------------------------------------------------
        System.out.println("array2");
        System.out.println("======");
        System.out.println("Array de long entre min y max saltado de step en step."
                + "\nOrden descendente\n");
    
        short[] array2 = new short[10];
        short parcial2 = (short)max;
        
        for (int i = 0; i < array2.length; i++){
            array2[i] = parcial2;
            parcial2 = (short)(parcial2 - step);
            
        }

        for (int num: array2){
            System.out.print(num + " ");
        }
        
        System.out.println("\n");

    //array3 -------------------------------------------------------------------
        System.out.println("array3");
        System.out.println("======");
        System.out.println("Array con elementos del array1 que son impares al cuadrado."
                + "\nUsando for-each donde se puede\n");

        int[] array3 = new int[5];
        int index3 = 0;
        for (int num : array1){
            if (num % 2 != 0){
                array3[index3] = num * num;
                index3++;
                }
            }

        for (int num: array3){
            System.out.print(num + " ");
        }
        System.out.println("\n");

    // ejercicio 4 -------------------------------------------------------------
    System.out.println("La suma de los elementos de array3");
    System.out.println("==================================");
    
    int resultado4 = 0;
    
    for (int num4 : array3){
        resultado4 = resultado4 + num4;
    }
    
    System.out.println(resultado4);

    System.out.println("\n");

    //ejercicio 5 --------------------------------------------------------------
    System.out.println("Calcula el producto de los 3 primeros productos de array3");
    System.out.println("==================================");
    
    long resultado5 = 1;

    for (int i = 0; i < 3; i++) {
          resultado5 = resultado5 * array3[i];
    }
    
    System.out.println(resultado5);
    
    System.out.println("\n");

    //ejercicio 6 --------------------------------------------------------------
    boolean[] array4 = new boolean[array1.length];

    for (int i = 0; i < array1.length; i++) {
        if (i%3 != 0){
        array4[i] = true;
        }
    } 
    
    int contadorTrue = 0;
    int contadorFalse = 0;
    
    for (boolean elem4: array4){
        if (elem4 == true){
            contadorTrue++;
        } else {
            contadorFalse++;
            }
        } 

    System.out.printf("En array 4 hay %d True y %d False%n",contadorTrue,contadorFalse);
    System.out.println("==================================");
    
    
        for (boolean num: array4){
            System.out.print(num + " ");
        }    
    }
}
