package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

/**
 * PurchaseBill class calculates total purchase cost based on item rate and quantity using user input.
 * The program demonstrates Scanner usage and arithmetic operations by reading item rate (price per unit)
 * and item count (quantity) from the user, then calculating total cost by multiplying rate and quantity.
 * It displays the total purchase price along with quantity and unit price.
 */
public class PurchaseBill {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading item rate (price per unit) from user
        double itemRate=sc.nextDouble();
        // Reading item count (quantity) from user
        int itemCount=sc.nextInt();
        // Calculating total cost: rate * quantity
        double finalCost=itemRate*itemCount;
        // Displaying total purchase price with quantity and unit price
        System.out.println("The total purchase price is INR "+finalCost+" if the quantity "+itemCount+" and unit price is INR "+itemRate);
    }
}
