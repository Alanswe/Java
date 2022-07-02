public class bloque_5_if {
    public static void main(String[] args) throws Exception {
        //if_y_else
        int a = 7;
        if (a>0) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");
        }

        // operador_ternario
        int c = 5;
        int b = c < 2 ? 3 : 4; // da 4 ya que no es menor que 2 y es la opcion 4 que es como el else
        System.out.println(b);
    
        // operador_ternario_2
        int num = 7;
        System.out.println(num % 2 == 0 ? "Es par":"Es impar");
    
    }
}
