package Singleclasses;

public class PointDos {
    //
    private static int nextId;
    
    // propiedades de clase
    private byte x;
    private byte y;
    private String colour = "black";
    private char symbol = 'o';
    private int id;
    
    // Constructores
    
    PointDos(){
        this((byte)0,(byte)0,"",'o');
    }
    
    PointDos(byte x, byte y){
        this((byte)x,(byte)y,"",'o');
    }
    
    PointDos(byte x, byte y, String colour, char symbol){ // principal
        this.id = ++nextId;
        this.x = x < 0 ? 0 : x > 12 ? 12 : x;        
        this.y = y < 0 ? 0 : y >  7 ?  7 : y;        
        this.symbol = symbol;
        if (colour.equals("red")||colour.equals("green")||colour.equals("yellow")
                ||colour.equals("blue")||colour.equals("purple"))
            this.colour = colour;       
    }
    
    PointDos(String colour, char symbol){
        this((byte)0, (byte)0, colour, symbol);
    }    
    
    PointDos(PointDos p){
        this(p.x,p.y,p.colour,p.symbol);
        /*
        this.x = p.x;
        this.y = p.y;
        this.colour = p.colour;
        this.symbol = p.symbol;
        */
    }

    // Métodos
    
    boolean up(){
        if (y == 7) return false;
        y++;
        return true;  
    }
    
    boolean down(){
        if (y == 0) return false;
        y--;
        return true;  
    } 
    
    boolean right(){
        if (x == 12) return false;
        x++;
        return true;  
    } 
    
    boolean left(){
        if (x == 0) return false;
        x--;
        return true;  
    } 
    
    void showSimple(){
        showSimple("\033[30m");
    }
    
    void showSimple(String colourCode){
        System.out.printf("%sPoint %c de color %s (%d, %d)%n\033[30m",
                colourCode, symbol, colour, x, y);        
    }
    
    void showSimpleStatic(PointDos p){
        p.showSimple();        
    }
    
    String activeLine(int n, char c, byte x, String colourCode){
        String activeLine = "" + n + "  ";
        for(int i = 0;  i <= 12; i++){
            if (i != x) activeLine += "+";
            else {
                activeLine += colourCode;
                activeLine += c;
                activeLine += "\033[30m"; 
            }
            if (i != 12) activeLine += "--";
        }        
        return activeLine;
    } 
    
    String pasiveLine(){
        String pasiveLine = "   ";
        for(int i = 0;  i < 12; i++) pasiveLine += "|  ";
        return pasiveLine += "|";
    } 
    
    String bottomLine(){
        return "   0  1  2  3  4  5  6  7  8  9 10 11 12";
    } 
     
    void show(){ 
        String colourCode;
        switch(colour){
            case "black":
                colourCode = "\033[30m"; 
                break;
            case "red":
                colourCode = "\033[31m"; 
                break;
            case "green":
                colourCode = "\033[32m"; 
                break;
            case "yellow":
                colourCode = "\033[33m"; 
                break;        
            case "blue":
                colourCode = "\033[34m"; 
                break;
            case "purple":
                colourCode = "\033[35m"; 
                break;
            default:
                colourCode = "\033[30m";
        }

        for(int i = 7; i >= 0 ; i--){
            if (i == y)
                System.out.println(activeLine(i, symbol, x, colourCode));
            else
                System.out.println(activeLine(i, '+', x, "\033[30m"));
            if (i == 0) break;
            System.out.println(pasiveLine());
        }
        System.out.println(bottomLine());
        this.showSimple(colourCode);    
    }
    
    public static void main(String[] args) {
        
        System.out.println("Prueba de constructores y método showSimple()");
        System.out.println("=============================================");
        PointDos p = new PointDos();
        p.showSimple();
        p = new PointDos((byte)3, (byte)5);
        p.showSimple();
        p = new PointDos((byte)5, (byte)3, "red", '#');
        p.showSimple();
        p = new PointDos("blue", '+');
        p.showSimple();
        p = new PointDos("blueau", '+');  
        p.showSimple();
        p = new PointDos(p);
        p.showSimple();
        System.out.println("=== El metodo estático");
        PointDos p3 = new PointDos((byte)7, (byte)2);
        p.showSimpleStatic(p3);        
        System.out.println();
        
        
        System.out.println("Prueba de métodos de desplazamiento");
        System.out.println("===================================");        
        PointDos p1 = new PointDos((byte)3, (byte)3);
        p1.showSimple();
        p1.up();
        p1.showSimple();
        for(int i=1; i <20; i++) p1.up();
        p1.showSimple();
        p1.down();
        p1.showSimple();
        for(int i=1; i <20; i++) p1.down();
        p1.showSimple();
        p1.right();
        p1.showSimple();
        for(int i=1; i <20; i++) p1.right();
        p1.showSimple();
        p1.left();
        p1.showSimple();
        for(int i=1; i <20; i++) p1.left();
        p1.showSimple();
        System.out.println();
        

        
        System.out.println("Prueba de método show");
        System.out.println("=====================");  
        PointDos p2 = new PointDos((byte)5, (byte)3, "red", '#');
        p2.show();
        p2 = new PointDos((byte)5, (byte)3, "green", '*');
        p2.show();
    }
    
}
