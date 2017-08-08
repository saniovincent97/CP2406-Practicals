public class QuartsToGallons {
    public static void main(String[] args){
        int quartsInAGallon = 4;
        int quartsForPainting = 23;
        int computeQuarts = quartsForPainting/quartsInAGallon;
        System.out.println("A job that needs " + quartsForPainting + " quarts, requires " + computeQuarts +
                " gallons plus " + (quartsForPainting % quartsInAGallon) + " quarts");
    }
}
