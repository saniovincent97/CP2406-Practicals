import java.util.Scanner;
public class Percentages2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num_one = input.nextDouble();
        System.out.print("Enter your second number: ");
        double num_two = input.nextDouble();
        computePercent(num_one, num_two);
        computePercent(num_two, num_one);
    }
    private static void computePercent(double x, double y){
        System.out.printf("%.2f of %.2f = %.2f%%\n", x, y, (x/y)*100);
    }
}
