import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewJavaDateApi {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: "+currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now(); // Current date and time
        System.out.println("Current DateTime: " + currentDateTime);
        LocalDate specificDate = LocalDate.of(2025, 12, 25); // Specific date
        System.out.println("Specific Date: " + specificDate);

        LocalTime specificTime = LocalTime.of(10, 30); // Specific time
        System.out.println("Specific Time: " + specificTime);

        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime); // Specific date and time
        System.out.println("Specific DateTime: " + specificDateTime);

        LocalDate nextWeek = currentDate.plusDays(7); // Date after 7 days
        System.out.println("Date after 7 days: " + nextWeek);

        System.out.println("Formatter");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        String dateString = "25/12/2024 10:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);
    }
}
