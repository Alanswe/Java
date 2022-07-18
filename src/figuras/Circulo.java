package figuras;

public class Circulo extends Figura{
    int numCirculos;
    int numLados =+1;
    double radio;
    
    // Métodos
    
    @Override
    public double area(){
        return (double)(3.14 * Math.pow(this.radio, 2));
    }
    
    @Override
    public double perimetro(){
        return (double)((2 * 3.14) * this.radio);
    }
    
    @Override
    public void show() {
        System.out.printf("Ese Circulo tiene un radio de %d y su perímetro es %d y su area es de %d.%n",(int)this.radio,(int)this.perimetro(),(int)this.area());
    }
    
    // contructor
    
    Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }
    
    Circulo(double radio){
        this(radio,"Negro");
    }
        
    Circulo(){
        this(10,"Negro");
    }
    
}
