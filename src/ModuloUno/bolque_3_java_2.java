public class bolque_3_java_2 {
    public static void main(String[] args) {
    char A = 'c';/* 99 */
    char B;
    System.out.println(A++);// 100
    System.out.println(A++);// 101
    System.out.println(++A);// 101 pero establece 102
    B = --A;// 101
    System.out.println(++A);//102
    A++;//101
    --B;//100
    System.out.println(B++);// 101
    System.out.println(++B);
    System.out.println(++A);
    System.out.println(B--);
    System.out.println(A);
    System.out.println(B);
    
    }        
}
