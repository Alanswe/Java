package _collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {    
    // campos
    String name;
    int totalPlazas;
    int plazasLibres;
    List<Coche> listaCoches;
    Map<Color, Integer> cantidadCochesColor;  
    Map<Marca, Integer> cantidadCochesMarca; 
    Map<Coche, Integer> cantidadCochesIguales;
    Set<Coche> setCoches;

    // Constructor
    public Parking(String name, int totalPlazas) {
        this.name = name;
        this.totalPlazas = totalPlazas;
        this.plazasLibres = totalPlazas;
        this.listaCoches = new ArrayList<>();  
						// lista que contiene los coches
        this.cantidadCochesColor = new HashMap<>();    
						// cantidad de coches de cada color
        this.cantidadCochesMarca = new HashMap<>();    
						// cantidad de coches de cada marca
        this.cantidadCochesIguales = new HashMap<>();  
						// cantidad de coches iguales       
        this.setCoches = new HashSet<>();       
						// set de coches
    }
    
    // está un coche en un parking 
    private int getCocheIdx(Coche c){
        // devuelve el idx de un coche en un Parking
        // -1 si no está
        for(int i=0; i < listaCoches.size(); i++)
            if (listaCoches.get(i) == c) 
								return i; 
        return -1;
    }              
        
    // entrada de un coche
    public boolean entraCoche(Coche c){
        // no hay plazas libres
        if(plazasLibres == 0) return false;

        // id del coche en el parking 
        if (getCocheIdx(c) > -1) return false;

        // guardo el coche en el parking y disminuyo en 1 plazas libres
        listaCoches.add(c);
        plazasLibres--;
        
        // variable para guardar el valor del contador transitoriamente
        int counter;

        // añado nuevo coche al map de colores incrementando cuenta
        counter = cantidadCochesColor.containsKey(c.color) ? 
							cantidadCochesColor.get(c.color): 0;
        cantidadCochesColor.put(c.color, ++counter);
        
        // añado nuevo coche al map de marca incrementando cuenta
        counter = cantidadCochesMarca.containsKey(c.marca) ?
							 cantidadCochesMarca.get(c.marca): 0;
        cantidadCochesMarca.put(c.marca, ++counter);        

        // añado nuevo coche al map de coches diferentes incrementando cuenta
        counter = cantidadCochesIguales.containsKey(c) ?
							 cantidadCochesIguales.get(c): 0;
        cantidadCochesIguales.put(c, ++counter); 
        
        // añado nuevo coche al set
        setCoches.add(c);
     
        return true; 
    }
        
    // salida de un coche
    public boolean saleCoche(Coche c){
        // no hay coches
        if(listaCoches.isEmpty()) return false;

        // id del coche en el parking 
        int indexCoche = getCocheIdx(c);
        if (indexCoche == -1) return false;            

        // saco el coche del parking y aumento en 1 plazas libres
            listaCoches.remove(indexCoche);
            plazasLibres++;

        // variable para guardar el valor del contador transitoriamente
        int counter;

        // quito nuevo coche al map de colores decrementando cuenta
        counter = cantidadCochesColor.get(c.color);
        if(counter != 1) 
            cantidadCochesColor.put(c.color, --counter);
        else
            cantidadCochesColor.remove(c.color);
                
        // quito nuevo coche al map de marcas decrementando cuenta
        counter = cantidadCochesMarca.get(c.marca);
        if(counter != 1) 
            cantidadCochesMarca.put(c.marca, --counter);
        else
            cantidadCochesMarca.remove(c.marca); 
        
        // quito nuevo coche al map de coches decrementando cuenta
        counter = cantidadCochesIguales.get(c);
        if(counter != 1) 
            cantidadCochesIguales.put(c, --counter);
        else
            cantidadCochesIguales.remove(c);
        
        // quitar un elemento del set es un poco más de lío
        // primero veré si está en el arrayList más de una vez
        // para ello puedo usar CantidadCoches iguales que si solo estba una vez
        
        if (cantidadCochesIguales.get(c) == null)
            setCoches.remove(c);
            
        return true;
    }
    
    // salida de un coche
    public boolean saleCocheAleatorio(){
        // no hay coches
        if(listaCoches.isEmpty()) return false;

        // obtengo la cantidad de coches dentro del parking y genero 
				// núm aleatorio del índice 
        
        int indexCoche = new Random().nextInt(listaCoches.size());
        Coche c = listaCoches.get(indexCoche);
        return saleCoche(c);
    }
    
    // vacía parking
    public boolean vaciaParking(){
        // no hay coches
        if(listaCoches.isEmpty()) return false;
        // obtengo la cantidad de coches dentro del parking y genero 
				// núm aleatorio del índice 
        // muy interesante, si lo hago en orden normal, esto es un lío, 
				// ya que va cambiando orden
        while(saleCocheAleatorio());
        return true;
    }  
    
    public void reportParking(){
        System.out.println("LISTADO COCHES");
        System.out.println("--------------");        
        System.out.println("Parking: " + name);
        for(Coche c : listaCoches)
            System.out.println("  " + c);
        System.out.println("Total coches: " + listaCoches.size() 
							+ ", plazas libres: " + plazasLibres + ".");
        System.out.println("");        
    }
    
    public void reportColores(){
        System.out.println("REPORT DE COLORES");
        System.out.println("-----------------");
        System.out.println("Parking: " + name);        
        int totalCoches = 0;
        for(Color k : cantidadCochesColor.keySet()){
            totalCoches += cantidadCochesColor.get(k);
            System.out.println("El coche de color " + k.getName() 
										+ " se repite " + cantidadCochesColor.get(k) 
                    + (cantidadCochesColor.get(k) == 1 ? " vez." : " veces."));
        }
            System.out.println("Total coches: " + totalCoches);
        System.out.println("");
    }
    
    public void reportMarcas(){
        System.out.println("REPORT DE MARCAS");
        System.out.println("----------------");
        System.out.println("Parking: " + name);
        int totalCoches = 0;
        for(Marca k : cantidadCochesMarca.keySet()){
            totalCoches += cantidadCochesMarca.get(k);
            System.out.println("El coche de marca " + k.getName()
										+  " se repite " + cantidadCochesMarca.get(k) 
                    + (cantidadCochesMarca.get(k) == 1 ? " vez." : " veces."));
        }
            System.out.println("Total coches: " + totalCoches);
        System.out.println("");
    }
    
    public void reportCochesIguales(){
        System.out.println("REPORT DE COCHES IGUALES");
        System.out.println("------------------------");
        System.out.println("Parking: " + name);
        int totalCoches = 0;
        for(Coche k : cantidadCochesIguales.keySet()){
            totalCoches += cantidadCochesIguales.get(k);
            System.out.println(k + " se repite " + cantidadCochesIguales.get(k) 
                  + (cantidadCochesIguales.get(k) == 1 ? " vez." : " veces."));
        }
        System.out.println("Total coches: " + totalCoches);
        System.out.println("");
    }  
    
    public void reportSetCoches(){
        System.out.println("REPORT SET DE COCHES");
        System.out.println("--------------------");
        System.out.println("Parking: " + name);
        int totalItems = 0;
        for(Coche c : setCoches){
            totalItems++;
            System.out.println(c);
        }
        System.out.println("Total items: " + totalItems);
        System.out.println("");
    }   
}