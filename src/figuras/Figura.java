package figuras;

public abstract class Figura {
    
    private static int numFigs;
    private String color;
    private int idFig;
    
    // Métodos
    
    public abstract void show();
    public abstract double area();
    public abstract double perimetro();

    public String getColor() {
        return color;
    }
    
    // Constructor
    
    public Figura(String color){
        this.color = color;
        this.idFig = ++numFigs;
    }
    
}
