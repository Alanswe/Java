package figuras;

public abstract class Figura {
    
    private static int numFigs;
    private String color;
    private final int idFig;
    
    // Métodos
    
//    public abstract void show();
    public void show(){
        System.out.printf(" (Id %d)%n",this.idFig);
    }
    public abstract double area();
    public abstract double perimetro();
    
    // Constructor
    
    public Figura(String color){
        this.color = color;
        this.idFig = ++numFigs;
    }

    // Getters
    
    public String getColor() {
        return color;
    }
    
    public int getIdFig() {
        return idFig;
    }
    
    // Setters

    public void setColor(String color) {
        this.color = color;
    }
    
}
