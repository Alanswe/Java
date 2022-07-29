package DateTimeJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.TimeZone;

/**
 *
 * @author javilukt
 */

public class Test {
    
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalDate d2= LocalDate.of(1966,9,15);
        System.out.println(d2);        
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalTime t2 = LocalTime.of(15,30,20,1300);
        System.out.println(t2);
        LocalDateTime dt1 = LocalDateTime.of(1966,9,15,15,30,20,1300);
        System.out.println(dt1);
        LocalDateTime ldt2 = LocalDateTime.of(d1, t1);
        System.out.println(dt1);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        

        TimeZone z1 = TimeZone.getDefault();
        System.out.println(z1);
        LocalDate d3= LocalDate.of(1966,Month.SEPTEMBER,15);
        System.out.println(d3);
        Period p = Period.ofDays(10);
        d3.minus(p);
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm:ss");
        DateTimeFormatter dtf5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        dtf1.format(dt1);
        
    }

    
}