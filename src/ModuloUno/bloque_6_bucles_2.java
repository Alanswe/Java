public class bloque_6_bucles_2 {
    public static void main(String[] args) {
        int multiplo = 17, num_inicial = 315, num_final = 9_100_00;// 330 da 1 como múltiplo para quitar o no la "s"
        // Calcula el número de múltiplos de 17 entre 315 y 9.100.000
        int contador = 0;

        for (int i = num_inicial; i <= num_final; i++) {
            if (i % multiplo == 0) {
                contador++;
            }
        }
        System.out.printf("Entre %d y %d hay %d múltiplo%s de %d",num_inicial,num_final,contador, contador == 1 ? "":"s", multiplo);
    }
}
