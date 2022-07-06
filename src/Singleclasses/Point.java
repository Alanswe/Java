package Singleclasses;

public class Point {
    // Propiedades
    byte x;// = this.x >= 0 && this.x <= 12 ? this.x:12; // solo valores entre 0 y 12, ambos incluidos.
    byte y; // = this.y >= 0 && this.y <= 7 ? this.y:7;
    String colour; // = this.validaColor();
    char symbol;
    
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
    
    public static void main(String[] args) {
        Point p1 = new Point();
        //Point p2 = new Point(2,5,"red",'$');
    
        System.out.println(p1.showSimple());
    }
    
    String showSimple(){
        return "Vector: valor x=" + this.x + " y valor y=" + this.y + ", simbolo " + this.symbol + "y color " + this.colour + ".";
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
    
}
