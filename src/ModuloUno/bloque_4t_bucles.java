public class bloque_4t_bucles {
    public static void main(String[] args) throws Exception {
        int[] numeros = {1, 2, 3, 4, 1, 3, 7, 4, 2, 1, 7 };
        int counter = 0;
        for (int numero: numeros)
            if (numero == 1) counter++;
        System.out.println("Se repite "+counter+" veces.");   
    
        for (int num: numeros){
            if (num <= 10){
                System.out.print(num+" ");
            }
        }
    }
}
