package Interface;

public class Test {
    public static void main(String[] args) {
        
        
        Persona p = new Persona();
        Ente e = new Persona();
        Animal a = new Persona();
        Movible m = new Persona();
        
        System.out.println(p);
        p.avanza(1000);
        System.out.println(p);
        
        System.out.println("==========");
        
        System.out.println(m);
        m.retorcede(50);
        System.out.println(m);
        
        System.out.println("==========");

        Coche c = new Coche();
        Cosa c2 = new Coche();
        Movible m2 = new Coche();
        
        System.out.println(c);
        c.avanza(1000);
        System.out.println(c);
        
    }
}
