package collectionsymaps;

import java.util.Arrays;
import java.util.function.*;

public class Persona {
    
    String nombre;
    int annoNacimiento;
    
    // constructor
    
    Persona(String nombre,int annoNacimiento){
        this.nombre = nombre;
        this.annoNacimiento = annoNacimiento;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + this.nombre + ", annoNacimiento=" + this.annoNacimiento + '}';
    }
    
    public int compareTo(Persona p) {
       return -this.nombre.compareTo(p.nombre);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
    
//        Persona p1 = new Persona("Juan",1970);
//        Persona p2 = new Persona("Pedro",2002);
//        Persona p3 = new Persona("Antonio",1999);
//        Persona p4 = new Persona("Juan",1982);
//        Persona p5 = new Persona("Pedro",1970);
//        Persona p6 = new Persona("Maria",2002);
//        Persona p7 = new Persona("Luz",2013);
//        Persona p8 = new Persona("Rocio",1993);
//        Persona p9 = new Persona("Maria",1882);
//        Persona p10 = new Persona("Rosa",2005);
//        
//        Persona[] personas = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        
        Persona[] personas = {new Persona("Juan",1970),new Persona("Pedro",2002)
                ,new Persona("Antonio",1999),new Persona("Juan",1982),new Persona("Pedro",1970)
                ,new Persona("Maria",2002),new Persona("Luz",2013),new Persona("Rocio",1993)
                ,new Persona("Maria",1882),new Persona("Rosa",2005)};

        System.out.println(personas[0].compareTo(personas[1]));
        System.out.println(personas[0].compareTo(personas[0]));
        
        Consumer<Persona> imprime = p -> System.out.println(p);
        imprime.accept(personas[0]);
        
        System.out.println("===============");
        
        for (Persona p : personas){
            System.out.println(p.toString());
        }
        
        System.out.println("=========== Ordenadas");
        
        Arrays.sort(personas);      
        
        for (Persona p : personas){
            System.out.println(p.toString());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
