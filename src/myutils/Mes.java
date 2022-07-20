package myutils;

public enum Mes {
    ENE("Enero",1), FEB("Febrero",2), MAR("Marzo",3), ABR("Abril",4), 
    MAY("Mayo",5), JUN("Junio",6), JUL("Julio",7), AGO("Agosto",8), 
    SEP("Septiembre",9), OCT("Octubre",10), NOV("Noviembre",11), 
    DIC("Diciembre",12);
    
    private String nombreCompleto;
    private int numAsociado;

    
    // constructors
    
    private Mes(String nombreCompleto, int numAsociado) {
        this.nombreCompleto = nombreCompleto;
        this.numAsociado = numAsociado;
    }
    
    // Methods

    @Override
    public String toString() {
        return "Mes{" + "nombreCompleto=" + nombreCompleto + ", numAsociado=" + 
                numAsociado + '}';
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getNumAsociado() {
        return numAsociado;
    }
    
    
    
}
