import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

public class SqlDateTime {
    public static void main(String[] args) {
        System.out.println("Working with sql date time");
        Date sqlDate = Date.valueOf("2024-12-25");
        System.out.println("SQL Date: " + sqlDate);

        // java.sql.Time
        Time sqlTime = Time.valueOf("10:30:00");
        System.out.println("SQL Time: " + sqlTime);

        // java.sql.Timestamp
        Timestamp sqlTimestamp = Timestamp.valueOf("2024-12-25 10:30:00");
        System.out.println("SQL Timestamp: " + sqlTimestamp);
    }
}
