import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date is: "+today);

        // local time
        LocalTime timenow = LocalTime.now();
        System.out.println("Current time is: "+timenow);
    
        DateTimeFormatter formatObject = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedtime = timenow.format(formatObject);
        System.out.println("Formatted time: "+formattedtime);
    
    }
    
}
