import java.util.Scanner;
public class Initials {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your first initial: ");
        char firstInitial = userInput.nextLine().toUpperCase().charAt(0);
        System.out.print("Enter your second initial: ");
        char secondInitial = userInput.nextLine().toUpperCase().charAt(0);
        System.out.print("Enter your third initial: ");
        char thirdInitial = userInput.nextLine().toUpperCase().charAt(0);
        System.out.printf("%c.%c.%c.",firstInitial, secondInitial, thirdInitial);
    }
}
