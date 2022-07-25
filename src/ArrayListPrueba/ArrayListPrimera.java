package ArrayListPrueba;

import java.util.ArrayList;

public class ArrayListPrimera {
    
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();

        al1.add("Cien años de soledad");
        System.out.println("===");
        for (String elemen: al1){System.out.println(elemen);}
        
        al1.add(1, "1984");
        System.out.println("===");
        for (String elemen: al1){System.out.println(elemen);}

        al1.clear();
        System.out.println("===");
        for (String elemen: al1){System.out.println(elemen);}
        System.out.println(al1.isEmpty());
        System.out.println("===");

        
        System.out.println(al1.contains("1984"));
        
        al1.add("Cien años de soledad");
        al1.add("1984");
        al1.add("El Alquimista");
        al1.add("El Principito");
        al1.add("El retrato de Dorian Grey");
        
        System.out.println(al1.contains("1984"));

        System.out.println("===");
        System.out.println(al1.get(2));
        
        System.out.println("===");
        System.out.println(al1.indexOf("1984"));
        System.out.print(al1.indexOf("Pepito"));System.out.print(" (Sin resultado) \n");
        
        System.out.println("===");
        System.out.println(al1.isEmpty());

        System.out.println("===");
        al1.remove(1);
        al1.remove("El Principito");
        for (String elemen: al1){System.out.println(elemen);}

        System.out.println("===");
        al1.set(1, "El Principito");
        for (String elemen: al1){System.out.println(elemen);}

        System.out.println("===");
        
        System.out.println(al1.size());
        System.out.println("===");
        
        al1.toArray(); // ?
        
        System.out.println("=================================================");
        
        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Cien años de soledad");
        al2.add("1984");
        al2.add("El Alquimista");
        al2.add("El Principito");
        al2.add("El retrato de Dorian Grey");
        
        for (String elemen: al2){System.out.println(elemen);}
        System.out.println("=================================================");

        ArrayList<Integer> al3 = new ArrayList<>();
            
//        int min = 1;
//        int max = 100;
//        int aleatorio = (int)(Math.random() * (max -min + 1) + min);
//        al3.add((int)(Math.random() * (max -min + 1) + min));
        
        for (int i = 0; i < 10; i++){
            int min = 1;
            int max = 100;
            al3.add((int)(Math.random() * (max -min + 1) + min));
        }
        
        for (int elemen: al3){System.out.print(elemen + " ");}
        System.out.println("");
        
        System.out.println(al3.size());
        
        int sumaElementosAl3 = 0;
        for (int elemen: al3){
            sumaElementosAl3 += elemen;
        }
        System.out.println(sumaElementosAl3);
        
        int mediaAl3  = sumaElementosAl3/10;
        System.out.println(mediaAl3);
        
        
        int numMinAl3 = 0;
        int numMaxAl3 = 0;
        
//        for (int elem : al3){
//            if (numMaxAl3 < elem){
//                numMaxAl3 = elem;
//            } else if (numMinAl3 > elem){
//                numMinAl3 = elem;
//            }
//        }
        
        for (int i = 0; i < 10; i++) {
            if (al3.get(i) < i){
                numMaxAl3 = i;
            } else if (numMinAl3 > i){
                numMinAl3 = i;
            }
        }
        
        System.out.println(numMaxAl3);
        System.out.println(numMinAl3);
        
        
        System.out.println("eliminar los de 50");
        for (int i = 0; i < 50; i++) {
            if (al3.get(i) < i){
            } else {
                al3.remove(i);
            }
        }
        
        for (int elemen: al3){System.out.print(elemen + " ");}
        System.out.println("");
    }
  
}
