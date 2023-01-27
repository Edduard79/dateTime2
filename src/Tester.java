import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;


public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm");
        System.out.println(LocalDateTime.now().format(form1));
        
        System.out.println(ZonedDateTime.now().format(form1.ISO_ZONED_DATE_TIME));









    }
}
