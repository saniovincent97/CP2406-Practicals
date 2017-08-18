public class FormLetterWriter {
    public static void main(String[] args){
        String first_name = "John";
        String last_name = "Thompson";
        displaySalutation(last_name);
        displaySalutation(first_name, last_name);
    }
    public static void displaySalutation(String last_name){
        System.out.println("Dear Mr. or Ms. " + last_name);
    }
    public static void displaySalutation(String first_name, String last_name){
        System.out.println("Dear " + first_name + " " + last_name + ". If we end this message with the words 'Thank " +
                "you for your recent order', that means your order has been denied. Thank you for your recent order.");
    }
}
