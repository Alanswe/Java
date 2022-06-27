public class bolque_4_java_2 {
    public static void main(String[] args) throws Exception {
        boolean W = false, X = true, Y = true, Z = false;

        System.out.println("a) W || Y && X && W || Z => " + (W || Y && X && W || Z));// false
        System.out.println("b) X && !Y && !X || !W && Y => " + (X && !Y && !X || !W && Y));// true
        System.out.println("C) !(W || !Y) && X || Z => " + (!(W || !Y) && X || Z));// true 
        System.out.println("D) X && Y && W || Z || X  => " + (X && Y && W || Z || X));// true
        System.out.println("E) Y || !(Y || Z && W) => " + (Y || !(Y || Z && W)));// true
        System.out.println("F) !X && Y && (!Z || !X) => " + (!X && Y && (!Z || !X)));// false
    
    }
}
