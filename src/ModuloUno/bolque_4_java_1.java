public class bolque_4_java_1 {
    public static void main(String[] args) throws Exception {
        boolean X = true, Y = false, Z = true;

        System.out.println("a) (X && Y) || (X && Z) => " + ((X && Y) || (X && Z)));//true
        System.out.println("b) (X || !Y) && (!X || Z) => " + ((X || !Y) && (!X || Z)));/* true porque al ser true and false, se escoje la primera */
        System.out.println("C) X || Y && Z => " + (X || Y && Z)); // true
        System.out.println("D) !(X || Y) && Z  => " + (!(X || Y) && Z));// false
        System.out.println("E) X || Y || X && !Z && !Y => " + (X || Y || X && !Z && !Y));// true
        System.out.println("F) !X || !Y || Z && X && !Y => " + (!X || !Y || Z && X && !Y));// true
        
    }
}
