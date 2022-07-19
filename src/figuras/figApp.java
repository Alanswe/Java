package figuras;

public class figApp {
    public static void main(String[] args) {
        Figura f2 = new Rectangulo(12.0,17.0,"Verde");
        Figura f1 = new Rectangulo(12.0);
        Figura f3 = new Rectangulo();
        f1.show();
        f2.show();
        f3.show();
        System.out.println("===================================================="
                + "===================================");
        Figura f4 = new Triangulo(12.0,17.0,"Verde");
        Figura f5 = new Triangulo(12.0,17.0);
        Figura f6 = new Triangulo();
        f4.show();
        f5.show();
        f6.show();
        System.out.println("===================================================="
                + "===================================");
        Figura f7 = new Circulo(17.0,"Verde");
        Figura f8 = new Circulo(17.0);
        Figura f9 = new Circulo();
        f7.show();
        f8.show();
        f9.show();
        System.out.println("=============== Prueba Figuras ====================="
                + "===================================");
        System.out.println("==== Prueba Mismo Tipo");
        System.out.println(Figuras.mismoTipo(f1,f2,f3)); // true
        System.out.println(Figuras.mismoTipo(f1,f5,f3,f9)); // false
        System.out.println("==== Prueba Mayor Area");
        System.out.println(Figuras.mayorArea(f1,f2)); // area de 144 > area de 204 Por tanto es false
        System.out.println(Figuras.mayorArea(f2,f1)); // area de 204 < area de 144 Por tanto es true

    }
}
