// Incomplete
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class FitnessTracker {
    int participation = 0;
    String sport = "running";
    Date date = new Date(1);
    SimpleDateFormat date_print = new SimpleDateFormat("MMMM d");

    System.out.println(date_print.format(date));
    date = AddDay(date);
    System.out.println(date_print.format(date));

    }
    public static int GetMinutes(int minutes){
        return minutes;
    }
    public static void Run(int participation ){

    }
    public static Date AddDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }
}
