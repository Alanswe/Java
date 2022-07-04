
package ModuloDos;

public class Rectangulo {
    String color = "----";
    int base, altura;
    
    Rectangulo(String c, int al,int ba){
        this.color = color; // El this. es el quivalente al self. en python
        this.altura = altura >= 0 ? altura : 0; // para no tener negativos
        this.base = base >= 0 ? base : 0;
    }
    
    Rectangulo(){
        this("Blanco",20,10);
//        
//        color = "Blaco";
//        altura = 20;
//        base = 10;
    }
    
    
    
}
