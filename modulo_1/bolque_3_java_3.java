public class bolque_3_java_3 {
    public static void main(String[] args) {
    
        int i = 1, j = 1, k = 1;

        System.out.println("a)");
        System.out.println(i);
        System.out.println(j);
        i = ++j;/* primero incrementa j (2) a i y luego da el valor j */
        System.out.println(i);
        System.out.println(j);
    
        System.out.println("b)");
        i = 1;
        j = 1;
        k = 1;
        System.out.println(i = k++);/* primero da el valor k (1) a i y luego incrementa k */

        System.out.println("c)");
        i = 1;
        j = 1;
        k = 1;

        System.out.println(i = k + ++j);
        //System.out.printf("i = ++j; => i = %d ",i);

    }
}
