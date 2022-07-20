package enumerados;

public class Test {
    public static void main(String[] args) {
        WeekendDay wd1 = WeekendDay.DO;
        System.out.println(wd1.getNombrelargo());
        System.out.println(WeekendDay.DO.getNombrelargo());     
        
        System.out.println(WeekendDay.values());
        WeekendDay.values();     
                
    }
    
}
