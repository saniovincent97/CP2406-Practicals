import java.util.Date;
public class TestFitnessTracker {
    public static void main(String[] args){
        int participation = 15;
        String sport = "basketball";
        Date date = new Date(30);

        FitnessTracker test = new FitnessTracker();
        test.getMinutes();
        test.getSport();
        test.getDate();

        FitnessTracker test1 = new FitnessTracker(participation, sport, date);
        test1.getMinutes();
        test1.getSport();
        test1.getDate(); //Not working with a custom date

    }

}
