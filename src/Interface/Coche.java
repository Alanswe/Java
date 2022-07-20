package Interface;

public class Coche extends Cosa implements Movible{
    private int carretera;
    // interface implements methods
    
    @Override
    public boolean avanza(int distancia) {
        if ((carretera + distancia) > 100){
            carretera = 100;
            return false;
        } else {
            carretera += distancia;
            return true;
        }
    }

    @Override
    public boolean retorcede(int distancia) {
        if ((carretera - distancia) > 100){
            carretera = -100;
            return false;
        } else {
            carretera -= distancia;
            return true;
        }
    }

    // Constructors
    
    public Coche() {
        this.carretera = 10;
    }

    // methods
    
    @Override
    public String toString() {
        return "Coche{" + "carretera=" + carretera + '}';
    }
    
}
