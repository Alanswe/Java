package figuras;

public class Rectangulo extends Figura{

    int numRectangulos;
    public static final int NUM_LADOS = 4;
    double base;
    double altura;
    
    // Métodos
    
    public boolean isCuadrado(){
       return this.base == this.altura; 
    }
    
    @Override
    public void show() {
        System.out.printf("Ese %s tiene un perímetro de %d, un area de %d y su colos es %s.%n",this.isCuadrado() == true ? "Cuadrado" : "Rectangulo",(int)this.perimetro(),(int)this.area(),this.getColor());
    }

    @Override
    public double area() {
        return this.base * this.altura; 
    }

    @Override
    public double perimetro() {
        return 9999;
    }
    
    // Constructor
    
    public Rectangulo(double base, double altura, String color){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(){
        this(10,10,"Negro");
//        super("Negro");
//        this.base = 10;
//        this.altura = 10;
    }
    
    public Rectangulo(double lado){
        this(lado,lado,"Negro");
    }
    
}
