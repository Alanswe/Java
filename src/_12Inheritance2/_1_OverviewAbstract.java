package _12Inheritance2;

public class _1_OverviewAbstract {
    public static void main(String[] args) {
        Animal a1 = new Gato(5);
        Animal a2 = new Perro(25);
        Gato a3 = new Gato(10);
        Perro a4 = new Perro(30);    
        Animal a5 = new Oso(800);
        Oso a6 = new Oso(1_000);

        System.out.print(a1.identificar());
        System.out.println(" y peso " + a1.getPeso() + "Kg.");

        System.out.print( a2.identificar());
        System.out.println(" y peso " + a2.getPeso() + "Kg.");

        System.out.print(a3.identificar());
        System.out.println(" y peso " + a3.getPeso() + "Kg.");   

        System.out.print(a4.identificar());
        System.out.println(" y peso " + a4.getPeso() + "Kg.");

        System.out.print(a5.identificar());
        System.out.println(" y peso " + a5.getPeso() + "Kg.");

        System.out.print(a6.identificar());
        System.out.println(" y peso " + a6.getPeso() + "Kg.");
        
    }
}
