import java.util.Scanner;
public class MetricConversion {
    static final double centimeter_conv_rate = 2.54;
    static final double liter_conv_rate = 3.7854;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = input.nextInt();
        inch_conversion(num);
        gallon_conversion(num);
    }
    public static void inch_conversion(int inches){
        double centimeters = inches* centimeter_conv_rate;
        System.out.printf("%d inches is %.2f centimeters\n", inches, centimeters);
    }
    public static void gallon_conversion(int gallons){
        double liters = gallons*liter_conv_rate;
        System.out.printf("%d gallons is %.2f liters\n", gallons, liters);
    }
}
