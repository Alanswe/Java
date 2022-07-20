package enumerados;
 // esta iniciado el archivo como enum
public enum WeekendDay {
    VI("Viernes"), SA("Sábado"), DO("Domingo");
    
    private String nombrelargo;
    
    
    private WeekendDay(String nombrelargo) {
        this.nombrelargo = nombrelargo;
    }

    public String getNombrelargo() {
        return nombrelargo;
    }
    
    
}
