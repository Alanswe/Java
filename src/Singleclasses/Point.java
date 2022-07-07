package Singleclasses;

public class Point {
    // Propiedades
    byte x;// = this.x >= 0 && this.x <= 12 ? this.x:12; // solo valores entre 0 y 12, ambos incluidos.
    byte y; // = this.y >= 0 && this.y <= 7 ? this.y:7;
    String colour; // = this.validaColor();
    char symbol;
    
    /*
    String validaColor (){
        switch (colour) {
            case "black": 
                return "\033[30m";
            case "red":
                return "\033[31m";
            case "green":
                return "\033[32m";
            case "yellow":
                return "\033[33m";
            case "blue":
                return "\033[34m"; 
            case "purple":
                return "\033[35m"; 
            default:
                return "\u001B[0m"; 
        }
    }
    */
    
    
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point((byte)2,(byte)5,"red",'$');
        Point p3 = new Point((byte)7, (byte)5,"red",'@');
    
        p2.show();
        p2.showSimple();

    }
    
    // Constructores

    public Point() {
        this.x = this.y = 0;
    }

    public Point(byte x, byte y) {
        this.x = x < 0 ? 0 : x > 12 ? 12 : x;// this.x = this.x >= 0 && this.x <= 12 ? this.x : 12; // solo valores entre 0 y 12, ambos incluidos.
        this.y = y < 0 ? 0 : y > 7 ? 7 : y; //this.y = this.y >= 0 && this.y <= 7 ? this.y : 7;
    }
    
    Point(byte x,byte y,String colour,char symbol){
        this(x, y);
        this.colour = colour == "red" || colour == "green" ||colour == "yellow" ||colour == "blue" ||colour == "purple" ? colour : "black";
        this.symbol = symbol;
    }

    public Point(String colour, char symbol) {
        this((byte)0, (byte)0);
        this.colour = colour == "red" || colour == "green" ||colour == "yellow" ||colour == "blue" ||colour == "purple" ? colour : "black";
        this.symbol = symbol;
    }
    
        
    Point(Point pointOriginal){ //point copia
        this.x = pointOriginal.x;
        this.y = pointOriginal.y;
        this.colour = pointOriginal.colour;
        this.symbol = pointOriginal.symbol;
    }
    
    // Métodos
    
    void showSimple(){
        System.out.printf("Point '%s' de color %s (%d, %d)%n",this.symbol,this.colour,this.x,this.y);
    }
    
    boolean up(){
        if (y == 7){
            return false;
        } else {
            this.y++;
            return true;
        }
    }
    
    boolean down(){
        if (y == 12){
            return false;
        } else {
            this.y++;
            return true;
        }
    }
    
    boolean left(){
        if (x == 7){
            return false;
        } else {
            this.x++;
            return true;
        }
    }
    
    boolean right(){//12
        if (x == 12){
            return false;
        } else {
            this.x++;
            return true;
        }
    }
    
    void show(){
        int[] lineax = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] lineay = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("");
        
        for (int numerox : lineax){
            for (int numeroy: lineay){
                if (numeroy <= 11){
                    if (numeroy == 0){
                        System.out.print(7-numerox + " ");
                    }
                    System.out.print("+");System.out.print("--");
                } else {
                    System.out.print("+");
                    if (7 > numerox){
                        System.out.printf("%n  |  |  |  |  |  |  |  |  |  |  |  |  |%n");
                        break;
                    } else {
                        System.out.printf("%n  0  1  2  3  4  5  6  7  8  9 10 11 12%n");
                        break;
                    }
                }
            }
        }
        
        
    
    }
    
    
}
