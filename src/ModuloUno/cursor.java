public class cursor {
    public static void main(String[] args) throws Exception {
        
        int a = 2;
        System.out.println("Resultado A antes: "+ a);

        int b = a++ * 3; /*actúa como un contador pero directamente en la misma variable
        primero lo uso y luego lo incremento*/

        System.out.println("Resultado A después: "+ a);

        System.out.println("Resultado B: "+ b);

    }
}
