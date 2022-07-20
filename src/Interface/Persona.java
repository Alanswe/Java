package Interface;  

public class Persona extends Animal implements Movible {
    private int acerado;
    
    // interface implements methods
    
    @Override
    public boolean avanza(int distancia) {
        if ((acerado + distancia) > 100){
            acerado = 100;
            return false;
        } else {
            acerado += distancia;
            return true;
        }
    }

    @Override
    public boolean retorcede(int distancia) {
        if ((acerado - distancia) > 100){
            acerado = -100;
            return false;
        } else {
            acerado -= distancia;
            return true;
        }
    }

    // Constructors
    
    public Persona() {
        this.acerado = 10;
    }

    // methods
    
    @Override
    public String toString() {
        return "Persona{" + "acerado=" + acerado + '}';
    }
    
    
    
}
