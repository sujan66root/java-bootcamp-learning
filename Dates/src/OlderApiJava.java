import java.text.SimpleDateFormat;
import java.util.Date;

public class OlderApiJava {
    public static void main(String[] args) {
        System.out.println("Date Example:");
        Date date = new Date();
        System.out.println("Current date and time:" + date);
        long milliseconds = date.getTime();
        System.out.println("Current date in milliseconds:" +milliseconds);
        Date specificDate = new Date(milliseconds);
        System.out.println("Specific date from milliseconds:" +specificDate);
        System.out.println("Formatting Dates:");
        SimpleDateFormat formatter = new SimpleDateFormat();
        System.out.println("Formatted Current date: " + formatter.format(date));
        String dateString = "25/12/2024 10:30:00";
        try {
            Date parsedDate = formatter.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
