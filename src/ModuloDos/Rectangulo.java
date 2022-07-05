
package ModuloDos;

public class Rectangulo {
    
    String color = "----";
    int base, altura;
    
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        System.out.println(r1.saludar());
        //r1.saludar();
        r1.despedir();

        Rectangulo r2 = new Rectangulo("Verde Oscuro",32,42);
        System.out.println(r2.saludar());
        //r2.saludar();
        r2.despedir();
    }
    
    Rectangulo(String color, int altura,int base){
        this.color = color; // El this. es el quivalente al self. en python
        this.altura = altura > 0 ? altura : 0; // para no tener negativos
        this.base = base > 0 ? base : 0;
    }
    
    Rectangulo(){
        this("Blanco",20,10);
//        
//        color = "Blaco";
//        altura = 20;
//        base = 10;
    }
    
    String saludar(){
        return "Hola soy un rectangulo de " + color + " y proporción " + base + "x" + altura;
        //System.out.printf("Hola soy un rectangoulo de color %s y proporción %dx%d %n",color,base,altura);
    }
    
    void despedir(){
        System.out.printf("Adios soy un rectangoulo de color %s y proporción %dx%d %n",color,base,altura);
    }
}
