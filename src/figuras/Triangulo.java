package figuras;

public class Triangulo extends Figura{
    
    private static int numTriangulos;
    private static final int numLados = 3;
    private double base;
    private double altura;
      
    // Métodos 
    
    @Override
    public void show() {
        System.out.printf("Ese Triangulo tiene un perímetro de %d y un area de %d y su color es %s.",(int)this.perimetro(),(int)this.area(),this.getColor());
        super.show();
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
        numTriangulos++;
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

