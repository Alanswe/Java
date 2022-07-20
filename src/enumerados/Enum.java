package enumerados;

public class Enum {
    public enum WeekDay {
	LU("Lunes", "Monday"), MA("Martes", "Tuesday"), 
        MI("Miércoles", "Wednesday"), JU("Jueves", "Thursday"), 
        VI("Viernes", "Friday"), SA("Sábado", "Saturday"), 
        DO("Domingo", "Sunday"),;

    private String longNameSP;
    private String longNameEN;

    private WeekDay(String longNameSP, String longNameEN){
        this.longNameSP = longNameSP;
        this.longNameEN = longNameEN;
    }

    public String getLongNameSP() {
        return longNameSP;
    }

    public String getLongNameEN() {
        return longNameEN;
    }
    
    }

    public static void main(String[] args) {
        // Para llamar al método
        WeekDay.MA.getLongNameSP();

        System.out.println(WeekDay.MA.getLongNameSP()); 
        System.out.println(WeekDay.MA.getLongNameEN());
    }

}
