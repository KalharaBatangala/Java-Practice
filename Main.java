import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date is: "+today);

        // local time
        LocalTime timenow = LocalTime.now();
        System.out.println("Current time is: "+timenow);
    }
    
}
