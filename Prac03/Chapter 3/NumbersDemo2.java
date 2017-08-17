import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num_one = input.nextInt();
        System.out.print("Enter your second number: ");
        int num_two = input.nextInt();
        System.out.println("displayTwiceTheNumber:");
        displayTwiceTheNumber(num_one);
        displayTwiceTheNumber(num_two);
        System.out.println("displayNumberPlusFive:");
        displayNumberPlusFive(num_one);
        displayNumberPlusFive(num_two);
        System.out.println("displayNumberPlusFive:");
        displayNumberSquared(num_one);
        displayNumberSquared(num_two);
    }
    private static void displayTwiceTheNumber(int x){
        System.out.printf("%d x 2 = %d\n", x, x*2);
    }
    private static void displayNumberPlusFive(int x){
        System.out.printf("%d + 5 = %d\n", x, x+5);
    }
    private static void displayNumberSquared(int x){
        System.out.printf("%d Squared = %d\n", x, x*x);
    }
}
