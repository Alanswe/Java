package _collections;

public class Test {
    public static void main(String[] args) {
        Parking p1 = new Parking("Mi primer parking", 10);
        for(int i = 1 ; i <20; i++){
            System.out.print(" " + p1.entraCoche(new Coche())); 
        }
        System.out.println();
        //p1.reportParking();
        p1.saleCocheAleatorio();
        p1.saleCocheAleatorio();
        p1.reportParking();
        p1.reportColores();
        p1.reportMarcas();
        p1.reportCochesIguales();
        p1.reportSetCoches();
    }
}