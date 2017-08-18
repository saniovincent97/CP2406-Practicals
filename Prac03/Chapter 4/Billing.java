public class Billing {
    public static void main(String[] args){
        double price = 29.99;
        int amount_ordered = 3;
        double coupon = 25.0;
        System.out.printf("Cost of single book: %.2f\n",computeBill(price));
        System.out.printf("Cost of %d books: %.2f\n",amount_ordered,computeBill(price, amount_ordered));
        System.out.printf("Cost of %d books, at %.0f%% discount: %.2f"
                ,amount_ordered,coupon,computeBill(price, amount_ordered, coupon));
    }
    public static double computeBill(double price){
        return price+(price*0.08);
    }
    public static double computeBill(double price, int quantity){
        double total = price*quantity;
        return total+(total*0.08);
    }
    public static double computeBill(double price, int quantity, double coupon){
        double total = price*quantity;
        double discount = total*(coupon/100);
        return total+(total*0.08)-discount;
    }
}
