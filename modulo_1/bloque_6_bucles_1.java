public class bloque_6_bucles_1 {
    public static void main(String[] args) {

         // a) Entre 50 y 2500 hay XX números múltiplos de 13.
         int multiplo = 13; 
         long num_inicial_a = 50L;
         long num_final_a = 2500L;
         long primer_multiplo = 0;
         long resultado = 0;

         for (long i = num_inicial_a; i <= num_final_a; i++) {
               if (i % multiplo == 0) {
                  primer_multiplo = i;
                  resultado = (((num_final_a - primer_multiplo)/multiplo)+1);
                  System.out.printf("a) Entre %d y %d hay %d número%s múltiplos%s de %d",num_inicial_a,num_final_a,resultado,resultado == 1 ? "":"s",resultado == 1 ? "":"s", multiplo);
                  break;
               }
         }


         // b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es: XX XX ... XX
         int num_final_b = 1812, num_inicial_b = 1935, salto_b = 7;
        
         System.out.printf("%nb) La cuenta atrás de atrás de %d en %d desde %d a %d es:%n",salto_b,salto_b,num_inicial_b,num_final_b);
         for (int i = num_inicial_b; i >= num_final_b; i = i - 7) {
            System.out.print(i + " ");
         }


         // C) El producto de los números impares entre 10 y 20 es XX.
         int num_inicial_c = 10, num_final_c = 20;
         int producto_c = 1;

         for (int i = num_inicial_c; i <= num_final_c; i++) {
            if (i % 2 != 0) {
               producto_c = producto_c * i;
            } 
         }
         System.out.printf("%nC) El producto de los números impares entre %d y %d es %d.",num_inicial_c,num_final_c,producto_c);


         // d) La suma de los números entre 70 y 800 es XXX.
         int num_inicial_d = 70, num_final_d = 800;
         int suma_d = 0;

         for (int i = num_inicial_d; i <= num_final_d; i++) {
            suma_d = suma_d + i;
         }
         System.out.printf("%nd) La suma de los números entre %d y %d es %d.",num_inicial_d,num_final_d,suma_d);

         // e) Esta es la cadena de texto AAAAAAAAAAAAAAAAAAAAAAAAA y ha sido obtenida concatenando 25 veces la A.
         String letra_e = "A", texto_final = "";
         int num_final_e = 25;

         for (int i = 1; i <= num_final_e; i++) {
            texto_final = texto_final + letra_e;
         }
         System.out.printf("%ne) Esta es la cadena de texto %s y ha sido obtenida concatenando %d veces la %s.",texto_final,num_final_e,"A");

         // f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX.
         int num_inicial_f = 15, num_final_f = 70;
         int suma_f = 0;

         for (int i = num_inicial_f; i <= num_final_f; i++) {
            if (i % 2 == 0) {
               suma_f = suma_f + (i*i);
            }
         }
         System.out.printf("%nf) La suma de los cuadrados de los numeros pares entre %d y %d es %d.",num_inicial_f,num_final_f,suma_f);

         // g) La suma de los cubos de los numeros impares entre -10 y 20 es XXX.
         int num_inicial_g = -10, num_final_g = 20;
         int suma_g = 0;

         for (int i = num_inicial_f; i <= num_final_f; i++) {
            if (i % 2 == 0) {
               suma_g = suma_g + (i*i*i);
            }
         }
         System.out.printf("%ng) La suma de los cubos de los numeros impares entre %d y %d es %d.",num_inicial_g,num_final_g,suma_g);


         // h) El abecedario inglés de letras minúsculas es: abcdefghijklmnopqrstuvwxyz
         // del 97 al 122
         String texto_final_h = "";

         for (char i = 'a'; i <= 'z'; i++) {
            texto_final_h = texto_final_h + i;
         }
         System.out.printf("%nh) El abecedario inglés de letras minúsculas es: %s",texto_final_h);

         // i) El abecedario inglés de letras mayúsculas es: ABCDEFGHIJKLMNOPQRSTUVWXYZ
         String texto_final_i = "";

         for (char i = 'A'; i <= 'Z'; i++) {
            texto_final_i = texto_final_i + i;
         }
         System.out.printf("%ni) El abecedario inglés de letras mayúsculas es: %s",texto_final_i);

         // j) El abecedario inglés de letras minúsculas de 3 en 3 letras es: adgjmpsvy
         String texto_final_j = "";

         for (char i = 'a'; i <= 'z'; i += 3) {
            texto_final_j = texto_final_j + i;
         }
         System.out.printf("%nj) El abecedario inglés de letras minúsculas de 3 en 3 letras es: %s",texto_final_j);

         // k) El abecedario inglés de letras minúsculas alrevés es: zyxwvutsrqponmlkjihgfedcba
         String texto_final_k = "";

         for (char i = 'z'; i >= 'a'; i--) {
            texto_final_k = texto_final_k + i;
         }
         System.out.printf("%nk) El abecedario inglés de letras minúsculas alrevés es: %s",texto_final_k);

         // l) El abecedario inglés alternando mayúsculas y minúsculas es: AbCdEfGhIjKlMnOpQrStUvWxYz
         String texto_final_l = "";

         for (char i = 'A'; i <= 'Z'; i++) {
            texto_final_l = texto_final_l + i;
            i++;
            texto_final_l = texto_final_l + (char)(i+32);
         }
         System.out.printf("%nl) El abecedario inglés alternando mayúsculas y minúsculas es: %s",texto_final_l);
     }
   }
   