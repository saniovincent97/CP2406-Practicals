// Incomplete
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class FitnessTracker
{
    private int participation;
    private String sport;
    private Date date;
    public FitnessTracker()
    {
        participation = 0;
        sport = "running";
        date = new Date(1); // Set to 2017
    }
    public FitnessTracker(int participation, String sport, Date date){
        participation = participation;
        sport = sport;
        date = date;
    }
    public void getMinutes()
    {
        System.out.printf("%d minutes\n", participation);
    }
    public void getSport()
    {
        System.out.printf("Sport: %S\n", sport);
    }
    public void getDate() //Doesn't return dates other than the 1st of January
    {
        Calendar now = Calendar.getInstance();
        int current_year = now.get(Calendar.YEAR);
        SimpleDateFormat date_print = new SimpleDateFormat("MMMM d");
        System.out.println(date_print.format(date)+", "+current_year);
    }
}

