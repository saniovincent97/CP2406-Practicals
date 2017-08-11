import java.util.Scanner;
public class Eggs {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double dozen_eggs = 3.25;
        double egg = 0.45;
        System.out.println("How many eggs would you like to order?");
        int egg_order = userInput.nextInt();
        double total = (egg_order*12)*dozen_eggs + (egg_order%12)*egg;
        System.out.printf("You ordered %d. That's %d dozen at $3.25 per dozen and %d loose eggs at $0.45 cents each, for " +
                "a total of $%.2f", egg_order, egg_order/12, egg_order%12, total);
    }
}
