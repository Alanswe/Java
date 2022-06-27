public class bolque_3_java_1 {
        public static void main(String[] args) {
            int x = 10;
            
            System.out.println(x);
            x++; /* esto suma += 1 de forma predefinida */
            System.out.println(x);
            x = x + 1; // hace lo mismo que con x++ pero pudiendo definir otra cantidad
            System.out.println(x);
            System.out.println("-");
            System.out.println(++x); /* primero incrementa y luego imprime */
            System.out.println("-");
            System.out.println(x++); /* primero imprime y luego incrementa */
            System.out.println(x);

            System.out.println("\nReseteo y pongo las de el ejercicio\n");
            x = x - 4; /* x = a los que sea x en ese momento (14) - 4 */

            System.out.println(x);
            x++;
            System.out.println(x);
            System.out.println(++x);
            System.out.println(x++);
            System.out.println(x);
            System.out.println(x++);
            System.out.println(++x);
            System.out.println(++x);
            ++x;
            x++;
            System.out.println(++x);
            System.out.println(x++);
            System.out.println(++x);

    }
}
