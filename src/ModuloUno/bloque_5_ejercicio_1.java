public class bloque_5_ejercicio_1 {
    public static void main(String[] args) throws Exception {
       int radio = 2;
       /* 
       0 no es posible
       1 es pequeña
       2 es mediana 
       3 o > es grande       
       */ 
       double superficie = 3.14 * radio * radio;
       /*
       System.out.println(((2*3.14) * radio) < 10 ? "Superficie es pequeña":"Superficie es grande");
       System.out.println(((2*3.14) * radio) >= 10 ? "Superficie es mediana":"Superficie es pequeña");
       System.out.println(((2*3.14) * radio) >= 20 ? "Superficie es grande":"Superficie es mediana o mediana");
        */

        System.out.println(superficie);
        if (superficie <= 0) {
            System.out.println("No es posible construir un circulo con el radio indicado");
        } else if (superficie < 10) {
            System.out.println("Superficie es pequeña");
        } 
        /*
        else if (superficie >= 10 && superficie <= 20 {
            System.out.println("Superficie es mediana");
        } esle {
            System.out.println("Superficie es grande");
        }
        */
        else if (superficie <= 20) {
            System.out.println("Superficie es mediana");
        } else if (superficie > 20){
            System.out.println("Superficie es grande");
        }  
    
    }
}
