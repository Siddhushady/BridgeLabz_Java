package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

/**
 * UserFeeDiscount class calculates discount and final fee using user input.
 * The program demonstrates Scanner usage for user input and arithmetic operations by reading
 * fee amount and discount percentage from the user, calculating discount amount, and then
 * computing the final fee after discount. It displays both the discount amount and final fee.
 */
public class UserFeeDiscount {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner input=new Scanner(System.in);
        // Reading fee amount from user
        double fee=input.nextDouble();
        // Reading discount percentage from user
        double discountPercent=input.nextDouble();
        // Calculating discount amount: fee * percentage / 100
        double discountAmount=fee*discountPercent/100;
        // Calculating final fee after discount: original fee - discount amount
        double finalFee=fee-discountAmount;
        // Displaying discount amount and final discounted fee
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
    }
}
