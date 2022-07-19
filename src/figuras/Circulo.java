package figuras;

// import static java.lang.Math.*;

public class Circulo extends Figura{
    private static int numCirculos;
    private static final int NUM_LADOS =+1;
    private double radio;
    
    // Métodos
    
    @Override
    public double area(){
        return (double)(Math.PI * Math.pow(this.radio, 2));
    }
    
    @Override
    public double perimetro(){
        return ((2 * Math.PI) * this.radio);
    }
    
    @Override
    public void show() {
        System.out.printf("Ese Circulo tiene un radio de %d y su perímetro es %d"
                + " y su area es de %d y su color es %s.",(int)this.radio,(int)this.perimetro(),(int)this.area(),this.getColor());
        super.show();
    }
    
    // Contructores
    
    Circulo(double radio, String color){
        super(color);
        this.radio = radio;
        numCirculos++;
    }
    
    Circulo(double radio){
        this(radio,"Negro");
    }
        
    Circulo(){
        this(10,"Negro");
    }
    
}
