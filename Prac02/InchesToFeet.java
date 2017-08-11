public class InchesToFeet {
    public static void main(String[] args){
        int inches = 86;
        int feetConversionRate = 12;
        int feet = inches/feetConversionRate;
        int remainder = inches%feetConversionRate;
        System.out.println(inches + " inches becomes " + feet + " feet and " + remainder + " inches.");
    }
}
