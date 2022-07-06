package Singleclasses;

public class Vector {
    int x;
    int y;
    
    public static void main(String[] args) {
        Vector v1 = new Vector(2,5);
        Vector v2 = new Vector(8);
        Vector v3 = new Vector(4,2);
        Vector v4 = new Vector(0,4);
        Vector v5 = new Vector(0,15);
        
        System.out.println("Prueba de suma => "+v1.suma(v3).show());
        System.out.println("Prueba de resta => "+v1.resta(v3).show());
        System.out.println("Prueba de copia => "+v2.show());

        System.out.println("-------------------------------------------------");
        
        System.out.println("Prueba de opera con + => "+v1.opera(v3,'+').show());
        System.out.println("Prueba de opera con - => "+v1.opera(v3,'-').show());
        //System.out.println("Prueba de opera con $ => "+v1.opera(v3,'_').show());// Tiene que dar error ya que es null
        System.out.println("Prueba de opera con $ => "+v1.opera(v3,'_'));
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Prueba de opera e => "+v1.prod(2).show());
        System.out.println(" <= Prueba de opera f => "+v1.opera(10).show());
        System.out.println("Prueba de opera g => "+v1.prodE(v3));
        System.out.println("Prueba de opera h => "+v1.prodV(v3));
        System.out.println("Prueba de opera i => "+v1.esParalelo(v3));
        System.out.println("Prueba de opera i_2 => "+v5.esParalelo(v4));
        System.out.println("Prueba de opera j => "+v1.esPerpendicular(v3));
        System.out.println("Prueba de opera j_2 => "+v5.esPerpendicular(v4));


    }
    
    String show(){
        return "Vector: valor x=" + this.x + " y valor y=" + this.y +".";
    }
  
    Vector(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    
    Vector(int z){ // (z) -> x=y=z
        this(z,z);
        /*
        this.x = z;
        this.y = z;
        */
    } 
    
    Vector(Vector vectorOriginal){ //vector copia
        this.x = vectorOriginal.x;
        this.y = vectorOriginal.y;
    }
    
    // Metodos
    
    Vector suma(Vector v){ // suma x de uno y otro, igual con y, con los resltados crea un nuevo Vector
        /*
        int newx = this.x + v.x;
        int newy = this.y + v.y;
        Vector newVector = new Vector(newx,newy);
        return newVector;
        */
        return new Vector(this.x + v.x,this.y + v.y);
    }
    
    
    Vector resta(Vector v){ // resta x de uno y otro, igual con y, con los resltados crea un nuevo Vector
        /*
        int newx = this.x - v.x;
        int newy = this.y - v.y;
        Vector newVector = new Vector(newx,newy);
        return newVector;
        */
        return new Vector(this.x - v.x,this.y - v.y);
    }
    

      
    Vector opera(Vector v, char operacion){ // si le pasa un + o un menos - y si es otro return NULL, con los resltados crea un nuevo Vector
        /*
        if (operacion == '+') {
            return new Vector(this.x + v.x,this.y + v.y);
        } else if (operacion == '-') {
            return new Vector(this.x - v.x,this.y - v.y);
        } else {
            return null;
        }
        */
        return operacion != '+' && operacion != '-' ? null: operacion == '+' ? new Vector(this.x + v.x,this.y + v.y): new Vector(this.x - v.x,this.y - v.y);
    }
    
    Vector prod(int n){ // e. producto de un vector por un escalar.
        return new Vector(this.x * n,this.y * n);
    }
    
    Vector opera(int n){ // f
        System.out.printf("%d * (%d, %d) = (%d, %d)",n,this.x,this.y,this.x*n,this.y*n);
        return prod(n);
    }
    
    int prodE(Vector v){ // g producto escalar de vectores.
        return this.x * v.x + this.y * v.y;
    }
    
    int prodV(Vector v){ // h producto vectorial de vectores.
        return this.x * v.y - this.y * v.x;
    }
    
    boolean esPerpendicular(Vector v){ // i
        return x == 0 && y == 0 || v.x == 0 && v.y == 0 ? false : prodV(v) == 0;
    }
   
    boolean esParalelo(Vector v){ // j
        return x == 0 && y == 0 || v.x == 0 && v.y == 0 ? false : prodE(v) == 0;
    }
    
}
