import java.util.Scanner;
public class ChiliToGo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int adult_meal = 7;
        int kids_meal = 4;
        System.out.println("How many adult meals would you like to order? ");
        int adult_order = userInput.nextInt();
        System.out.println("How many kids meals would you like to order? ");
        int kids_order = userInput.nextInt();
        int adult_cost = adult_meal*adult_order;
        int kids_cost = kids_meal*kids_order;
        int total_cost = adult_cost + kids_cost;
        System.out.printf("Adult meals: $%d\nKids meals: $%d\nTotal: $%d", adult_cost, kids_cost, total_cost);
    }
}
