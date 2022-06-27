public class bloque_5_ejercicio_2 {
    public static void main(String[] args) throws Exception {
        double base = 2;
        double altura = 0;
        double superficie = base * altura;

        String tipo = "";
        if (base == altura) {
            tipo = "cuadrado";
        } else {
            tipo = "rectángulo";
        }


        if (base <= 0 || altura <= 0) {
            System.out.println("No es posible construir un " + tipo + " con los datos indicados");
        } else if (superficie < 10) {
            System.out.println("El " + tipo + " de base " + 2 + " y altura " + 2 + " tiene una superficie pequeña.");
        } else if (superficie >= 10 && superficie <= 20) {
            System.out.println("El " + tipo + " de base " + 2 + " y altura " + 2 + " tiene una superficie mediana");
        } else {
            System.out.println("El " + tipo + " de base " + 2 + " y altura " + 2 + " tiene una superficie grande");
        }
    }
}
