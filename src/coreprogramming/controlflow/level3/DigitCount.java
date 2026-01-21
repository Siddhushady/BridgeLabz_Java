package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * DigitCount class counts the number of digits in a given number.
 * The program reads a number from the user and repeatedly divides it by 10
 * until it becomes 0, counting each division to determine the total number
 * of digits. This is an efficient way to count digits without converting to string.
 */
public class DigitCount {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number for digit counting
        int number = input.nextInt();
        // Initializing counter to track number of digits
        int count = 0;

        // Loop to repeatedly divide number by 10 until it becomes 0
        while (number != 0) {
            // Removing the last digit by integer division
            number = number / 10;
            // Incrementing digit count
            count++;
        }

        // Displaying the total number of digits
        System.out.println("Number of digits: " + count);

        // Closing the Scanner to free resources
        input.close();
    }
}
