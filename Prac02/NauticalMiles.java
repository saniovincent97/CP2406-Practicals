public class NauticalMiles {
    public static void main(String[] args){
        double numKilometers = 1.852;
        double numMiles = 1.150779;
        int nauticalMiles = 15;
        System.out.println("Number of nautical miles: " + nauticalMiles +
                "\nValue in kilometers: " + (nauticalMiles*numKilometers) +
                "\nValue in miles: " + (nauticalMiles*numMiles));
    }
}