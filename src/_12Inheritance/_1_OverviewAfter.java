package _12Inheritance;

public class _1_OverviewAfter {
    public static void main(String[] args) {
    AnimalMejorado a = new AnimalMejorado(250);
    GatoMejorado g = new GatoMejorado(6);
    AnimalMejorado p = new AnimalMejorado(40.5);

    System.out.println(a.identificar() + " y mi peso es de " + a.getPeso() + "Kg.");
    System.out.println(g.identificar() + " y mi peso es de " + g.getPeso() + "Kg.");
    System.out.println(p.identificar() + " y mi peso es de " + p.getPeso() + "Kg.");
    }

}
