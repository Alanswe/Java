public class bloque_5_java_1 {
    public static void main(String[] args) throws Exception {
        int i = 8, j = 5;
        float x = 0.005F, y = -0.01F;
        char c = 'c', d = 'd';
    
        System.out.println(c);

        System.out.println("a) i <= j = " + (i <= j)); // False
        System.out.println("b) c > d = " + (c > d)); // False
        System.out.println("c) x >= 0 = " + (x >= 0)); // True
        System.out.println("d) x < y-- = " + (x < y--)); // False
        System.out.println("e) j != 6 = " + (j != 6)); // True
        System.out.println("f) c == 99 = " + (c == 99)); // True
        System.out.println("g) !(i <= j) = " + (!(i <= j))); // True
        System.out.println("h) !(c == 99) = " + (!(c == 99))); // False
        System.out.println("i) !(x > 0) = " + (!(x > 0))); // False
        System.out.println("j) -j == i - 13 = " + (-j == i - 13)); // True
        System.out.println("k) ++x > 0 = " + (++x > 0)); // True
        System.out.println("l) y-- < 1 = " + (y-- < 1)); // True
        System.out.println("m) c > d || c > 0 = " + (c > d || c > 0)); // True
        System.out.println("n) 5 * (i + j) > 'c' = " + (5 * (i + j) > 'c')); // True
        System.out.println("o) 2 * x + y == 0 = " + (2 * x + y == 0)); // True
        //System.out.println("p) 2 * x + (y == 0) = " + (2 * x) + (y == 0)); // 
        System.out.println("q) x + y >= 0 = " + (x + y  >= 0)); // False
        System.out.println("r) x < ++y" + (x < ++y)); // True
        System.out.println("s) - (i + j) != -i + j" + (- (i + j) != -i + j));
        System.out.println("t) i <= j && i >= c = " + (i <= j && i >= c));
        System.out.println("u) i > 0 && j < 5 = " + (i > 0 && j < 5));
        System.out.println("v) i > 0 || j < 5 = " + (i > 0 || j < 5));
        System.out.println("w) x > y && i > 0 || j < 5 = " + (x > y && i > 0 || j < 5));
        System.out.println("x) (3 * i - 2 * j) % (2 * d - c) > 3 * d = " + ((3 * i - 2 * j) % (2 * d - c) > 3 * d));
        System.out.println("y) 2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10 = " + (2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10));
        System.out.println("z) (i - 3 * j) % (c + 2 * d) / (x - y) >= 0 = " + ((i - 3 * j) % (c + 2 * d) / (x - y) >= 0));
    }
}
