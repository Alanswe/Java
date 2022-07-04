
package mipaquete;

public class PostIt {
    String color;
    String msg;
    int alto;
    int ancho;

    PostIt(String c, String m, int al, int an){
        color = c;
        msg = m;
        alto = al;
        ancho = an;
    }
    
    PostIt(){
        color = "Verde";
        msg = "Sin Mensaje";
        alto = ancho = 60;
    }
    
//    PostIt(String m){
//        color = "Verde";
//        msg = m;
//        alto = ancho = 60;
//    }
    
    
//    PostIt(String c){
//        this(c,"Hola",137,137);
//    }
    
    PostIt(String c){
        this();
        color = c;
    }
    
    
    
    
}
