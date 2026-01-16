package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * ReverseNumber class reverses the digits of a given number using an array.
 * The program first counts the number of digits in the input number, then extracts
 * all digits in reverse order and stores them in an array. Finally, it displays
 * the digits from the array to show the reversed number.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number to be reversed
        int number = sc.nextInt();

        // Creating a temporary copy to count digits without modifying original
        int temp = number, count = 0;
        // Loop to count the number of digits in the number
        while (temp != 0) {
            // Incrementing digit count
            count++;
            // Removing the last digit by integer division
            temp /= 10;
        }

        // Declaring array with size equal to the number of digits
        int[] digits = new int[count];
        // Loop to extract digits in reverse order and store in array
        for (int i = 0; i < count; i++) {
            // Extracting last digit and storing in array
            digits[i] = number % 10;
            // Removing the last digit by integer division
            number /= 10;
        }

        // Loop to display all digits in the array (which are already in reverse order)
        for (int i = 0; i < count; i++) {
            // Printing each digit to form the reversed number
            System.out.print(digits[i]);
        }

        // Closing the Scanner to free resources
        sc.close();
    }
}
