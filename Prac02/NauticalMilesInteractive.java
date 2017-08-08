import java.util.Scanner;
public class NauticalMilesInteractive {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double numKilometers = 1.852;
        double numMiles = 1.150779;
        System.out.println("Enter number of nautical miles: ");
        int nauticalMiles = userInput.nextInt();
        System.out.println("Number of nautical miles: " + nauticalMiles +
                "\nValue in kilometers: " + (nauticalMiles*numKilometers) +
                "\nValue in miles: " + (nauticalMiles*numMiles));
    }
}
