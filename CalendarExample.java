import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get the current month and year
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        // Set the calendar to the first day of the month
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get the day of the week of the first day of the month
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print the calendar header
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        System.out.println("Calendar for " + sdf.format(calendar.getTime()));
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first row
        for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("%3d ", day);

            // Go to the next line after Saturday
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }

            calendar.set(Calendar.DAY_OF_MONTH, day + 1);
        }

        // Print a new line at the end of the calendar
        System.out.println();
    }
}
