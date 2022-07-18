package figuras;

public class Triangulo extends Figura{
    
    int numTriangulos;
    int numLados = 3;
    double base;
    double altura;
      
    // Métodos 
    
    @Override
    public void show() {
        System.out.printf("Ese Triangulo tiene un perímetro de %d y un area es %d.%n",(int)this.perimetro(),(int)this.area());
    }

    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }

    @Override
    public double perimetro() { // la suma de sus lados
        return 9999;
    }

    // Contructor
    
    Triangulo(double base,double altura,String color){
        super(color);
        this.base = base;
        this.altura = altura;
    }
       
    Triangulo(double base,double altura){
        super("Negro");
        this.base = base;
        this.altura = altura;
    }
    
    Triangulo(){
        super("Negro");
        this.base = 10;
        this.altura = 10;
    }
}

