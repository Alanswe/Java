public class bloque_2_java_4 {
    public static void main(String[] args) throws Exception {
    char c1 = 'E';/* 69 */
    char c2 = '5';/* 53 */
    char c3 = '?';/* 63 */
    System.out.println("a) c1 + 1 = " + (c1 + 1));
    System.out.println("b) c1 - c2 + c3 = " + (c1 - c2 + c3));    
    System.out.println("c) c2 - 2 = " + (c2 - 2));
    System.out.println("d) c2 - '2' = " + (c2 - '2'));
    System.out.println("e) c3 + '#' = " + (c3 + '#'));
    System.out.println("f) c1 % c3 = " + (c1 % c3));
    System.out.println("g) '2' + '2' = " + ('2' + '2'));
    System.out.println("h) (c1 / c2) * c3 = " + ((c1 / c2) * c3));
    /* c1 / c2 da 1 coma algo, eso se elimina, por lo tanto da 1 */
    System.out.println("i) 3 * c2 = " + (3 * c2));
    System.out.println("j) '3' * c2 = " + ('3' * c2) + '\n');

    System.out.println("Ejercicio 3");
    System.out.println("a) c1 + 1 = " + (char)(c1 + 1));
    System.out.println("b) c1 - c2 + c3 = " + (char)(c1 - c2 + c3));    
    System.out.println("c) c2 - 2 = " + (char)(c2 - 2));
    System.out.println("d) c2 - '2' = " + (char)(c2 - '2'));
    System.out.println("e) c3 + '#' = " + (char)(c3 + '#'));
    System.out.println("f) c1 % c3 = " + (char)(c1 % c3));
    System.out.println("g) '2' + '2' = " + (char)('2' + '2'));
    System.out.println("h) (c1 / c2) * c3 = " + (char)((c1 / c2) * c3));
    System.out.println("i) 3 * c2 = " + (char)(3 * c2));
    System.out.println("j) '3' * c2 = " + (char)('3' * c2));
    }
}
