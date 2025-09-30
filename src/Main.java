//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // before the class at top of the file

public class Main {
    public static void main(String[] args) {
        // Ask user for item price
        // If price >= 100 then shipping = 0
        // Else shipping = 2% of price
        // Total = price + shipping
        // Print shipping cost and total

        Scanner in = new Scanner(System.in);
        double price = 0;
        double shippingCost = 0;
        double total = 0;
        String trash = ""; // for bad input

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            // OK safe to read in a double
            price = in.nextDouble();
            in.nextLine(); // clear buffer

            if (price >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = price * 0.02;
            }

            total = price + shippingCost;

            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total cost: $" + total);
        } else {
            // Not a double, read as String instead
            trash = in.nextLine();
            System.out.println("\nYou said your item price was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
        }
    }
}