import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of inches: ");
        int inches = userInput.nextInt();
        int feetConversionRate = 12;
        int feet = inches/feetConversionRate;
        int remainder = inches%feetConversionRate;
        System.out.println(inches + " inches becomes " + feet + " feet and " + remainder + " inches.");
    }
}
