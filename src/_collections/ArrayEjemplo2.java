package _collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayEjemplo2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            numeros.add(i);
        }
        
        System.out.println("Lista de números del 1 al 30\n" +
                            "----------------------------");
        numeros.forEach(s -> System.out.print(s + " "));System.out.println("");
        
        System.out.println("\nEliminando los múltiplos de 5");
        System.out.println(  "-----------------------------");
        numeros.removeIf(x -> x % 5 == 0);
        numeros.forEach(s -> System.out.print(s + " "));System.out.println("");
        
        System.out.println("\nMultiplicación de todos por 10");
        System.out.println(  "------------------------------");
        numeros.replaceAll(s -> s * 10);
        numeros.forEach(s -> System.out.print(s + " "));System.out.println("");

        
        System.out.println("\nAñadir 22 y 9 al final");
        System.out.println(  "----------------------");
        numeros.add(22);
        numeros.add(9);
        numeros.forEach(s -> System.out.print(s + " "));System.out.println("");
        
        System.out.println("\nOrden ascendente");
        System.out.println(  "----------------");
        numeros.sort((s, t) -> s - t);
        numeros.forEach(s -> System.out.print(s + " "));System.out.println("");
       
        System.out.println("\nOrden descendente");
        System.out.println(  "-----------------");
        numeros.sort((s, t) -> t - s);
        numeros.forEach(s -> System.out.print(s + " "));System.out.println("");
        
    }
}
