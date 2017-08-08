import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int quartsInAGallon = 4;
        System.out.println("Enter an integer: ");
        int quartsForPainting = userInput.nextInt();
        int computeQuarts = quartsForPainting/quartsInAGallon;
        System.out.println("A job that needs " + quartsForPainting + " quarts, requires " + computeQuarts +
                " gallons plus " + (quartsForPainting % quartsInAGallon) + " quarts");
    }
}