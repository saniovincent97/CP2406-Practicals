import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input GPA: ");
        double gpa = input.nextDouble();
        System.out.print("Input name: ");
        String name = input.next();
        computeCredit(gpa, name);
    }
    private static void computeCredit(double gpa, String name){
        System.out.printf("%s's GPA is %.1f. That means their Bookstore credit is: $%.2f\n", name, gpa, gpa*10);
    }
}
