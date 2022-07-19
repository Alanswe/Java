package figuras;

public class Rectangulo extends Figura{

    private int numRectangulos;
    public static final int NUM_LADOS = 4;
    private double base;
    private double altura;
    
    // Métodos
    
    public boolean isCuadrado(){
       return this.base == this.altura; 
    }
    
    @Override
    public void show() {
        System.out.printf("Este %s tiene un perímetro de %d, un area de %d y su color es %s.",this.isCuadrado() ? "cuadrado" : "rectangulo",(int)this.perimetro(),(int)this.area(),this.getColor());
        super.show();
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
        numRectangulos++;
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
