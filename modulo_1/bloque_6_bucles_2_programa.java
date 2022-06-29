import java.util.Scanner; // import the Scanner class 
public class bloque_6_bucles_2_programa {
    public static void main(String[] args) {
        Scanner my_Obj_multiplo = new Scanner(System.in);
        int multiplo;

        Scanner my_Obj_num_inicial = new Scanner(System.in);
        long num_inicial;

        Scanner my_Obj_num_final = new Scanner(System.in);
        long num_final;
        
        // Enter username and press Enter
        System.out.println("introduce multiplo"); 
        multiplo = my_Obj_multiplo.nextInt();
        
        System.out.println("introduce Número inical"); 
        num_inicial = my_Obj_num_inicial.nextLong();

        System.out.println("introduce Número final"); 
        num_final = my_Obj_num_final.nextLong();
        
        System.out.println("Multiplo es: " + multiplo + "\nNúmero inical es: " + num_inicial + "\nNúmero final es: " + num_final);        



        long primer_multiplo = 0;
        long resultado = 0;

        for (long i = num_inicial; i <= num_final; i++) {
            if (i % multiplo == 0) {
                primer_multiplo = i;
                resultado = (((num_final - primer_multiplo)/multiplo)+1);
                break;
            }
        }
        System.out.printf("%nEntre %d y %d hay %d múltiplo%s de %d",num_inicial,num_final,resultado,resultado == 1 ? "":"s", multiplo);
    
    }
}


/* 
 *   int multiplo = 10; 
        long num_inicial = 1L;
        long num_final = 9L;//
 */