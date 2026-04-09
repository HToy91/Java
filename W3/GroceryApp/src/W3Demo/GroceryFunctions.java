package W3Demo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryFunctions {
    public static void GroceryCheckout(Scanner scanner) {
        String answer;
        List<GroceryItem> cart = new ArrayList<>();

        do {
            cart.add(EnterItem(scanner));

            System.out.println("Would you like to add another item (Y/N)?");
            answer = scanner.next();

            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Invalid input, please enter Y or N");
                answer = scanner.next();
            }
        } while (answer.equalsIgnoreCase("y"));

        CalculateCheckout(cart);
    }

    public static GroceryItem EnterItem(Scanner scanner) {
        System.out.println("Please enter the item name");
        String itemName = scanner.next();

        System.out.println("Pleas enter the Item Quantity");
        int itemQuantity = scanner.nextInt();

        System.out.println("Please enter the Item Price");
        double itemPrice = scanner.nextDouble();

        return (new GroceryItem(itemName, itemQuantity, itemPrice));
    }

    public static void CalculateCheckout(List<GroceryItem> cart) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        double totalCost = 0;

        for (var item: cart) {
            double itemTotalPrice = item.itemQuantity * item.itemPrice;
            totalCost = totalCost + itemTotalPrice;

            System.out.println(
                    "\nItemName: " + item.itemName
                            + "\nItem Quantity: " + item.itemQuantity
                            + "\nItem Total Price: " + formatter.format(itemTotalPrice)
            );

            System.out.println("\nTotal Price: " + formatter.format(totalCost));
        }

        System.out.println("\nRECEIPT");
    }
}
