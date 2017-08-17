public class Percentages {
    public static void main(String[] args){
        double num_one = 3.52;
        double num_two = 4.85;
        computePercent(num_one, num_two);
        computePercent(num_two, num_one);
    }
    private static void computePercent(double x, double y){
        System.out.printf("%.2f of %.2f = %.2f%%\n", x, y, (x/y)*100);
    }
}
