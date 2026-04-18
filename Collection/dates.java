package Collection;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dates {
    public static void main(String[] args) {

        // Old methods for Date
        Date datetime = new Date();
        System.out.println(datetime.toLocaleString());
        System.out.println(datetime.getDay());
        System.out.println(datetime.toString());
        System.out.println(datetime.getYear());

        // new methods for Date
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 1. Better toString/Locale equivalent
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        // 2. Get Day of the week
        System.out.println(now.getDayOfWeek());
        // 3. Simple toString
        System.out.println(now.toString());
        // 4. Get the actual Year (no math required!)
        System.out.println(now.getYear());
        System.out.print(now.getHour() + ":");
        System.out.print(now.getMinute() + ":");
        System.out.print(now.getSecond() + ":");
        System.out.println(now.getNano());

        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        
        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);
    }
}
