import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class grocery {
    public static double calculateTotal(int[] quantities, int[] prices){
        double total=0;
        for (int i = 0; i < prices.length; i++) {
            total += quantities[i] * prices[i];
        }
        if (total > 500) {
            double discount = total * 0.10;
            System.out.printf(" Discount Applied: Rs.%.2f\n", discount);
            total -= discount;
        }
        return total;
    }
    public static void main(String[] args){
         String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};
        int[] quantities = new int[items.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Available items and prices (per unit):");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - Rs." + prices[i]);
        }
        try {
            for (int i = 0; i < items.length; i++) {
                System.out.print("Enter quantity for " + items[i] + "(per units): ");
                quantities[i] = Integer.parseInt(scanner.nextLine());
            }
            double finalAmount = calculateTotal(quantities, prices);
            System.out.printf("Final Amount to Pay: Rs.%.2f\n", finalAmount);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Purchase Date & Time: " + now.format(formatter));
            } catch (NumberFormatException e) {
            System.out.println(" Invalid input! Please enter numeric values only.");
        }
        scanner.close();
    }
}


    

    

    

