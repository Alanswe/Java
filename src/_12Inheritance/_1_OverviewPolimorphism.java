package _12Inheritance;

public class _1_OverviewPolimorphism {
    public static void main(String[] args) {
        AnimalMejorado a1 = new GatoMejorado(5);
        AnimalMejorado a2 = new PerroMejorado(25);
        GatoMejorado a3 = new GatoMejorado(10);
        PerroMejorado a4 = new PerroMejorado(30);       

        System.out.print(a1.identificar());
        System.out.println(" y peso " + a1.getPeso() + "Kg.");

        System.out.print( a2.identificar());
        System.out.println(" y peso " + a2.getPeso() + "Kg.");

        System.out.print(a3.identificar());
        System.out.println(" y peso " + a3.getPeso() + "Kg.");   

        System.out.print(a4.identificar());
        System.out.println(" y peso " + a4.getPeso() + "Kg.");
        
        System.out.println("========================");
        
        AnimalMejorado a5 = new OsoMejorado(800);
        OsoMejorado a6 = new OsoMejorado(1_000);

        System.out.print(a5.identificar());
        System.out.println(" y peso " + a5.getPeso() + "Kg.");
        a5.rugir((byte)3); System.out.println("");

        System.out.print(a6.identificar());
        System.out.println(" y peso " + a6.getPeso() + "Kg.");
        a6.rugir((byte)4); System.out.println("");
    }
}
