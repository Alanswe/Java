public class bolque_3 {
    public static void main(String[] args) throws Exception {
    char c = 97;
    byte b = 5;
    short d = 5;
    long e = 5;
    double f = 5;
    float g = 5.7f;/* La f es necesaria para diferenciarla del double que está por defecto */
    System.out.println(g);
    System.out.println(((Object)g).getClass().getSimpleName());
    }
}
