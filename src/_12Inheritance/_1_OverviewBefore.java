package _12Inheritance;

public class _1_OverviewBefore {
    public static void main(String[] args) {
        Animal a = new Animal(250);
        Gato g = new Gato(6);
        Perro p = new Perro(40.5);

        System.out.println(a.identificar() + " y mi peso es de " + a.getPeso() + "Kg.");
        System.out.println(g.identificar() + " y mi peso es de " + g.getPeso() + "Kg.");
        System.out.println(p.identificar() + " y mi peso es de " + p.getPeso() + "Kg.");
        
    }
}
