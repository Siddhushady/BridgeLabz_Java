package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * DigitFrequency class counts the frequency of each digit (0-9) in a given number.
 * The program reads a number from the user, extracts each digit from the number,
 * and maintains a frequency count for each digit using an array. Finally, it
 * displays how many times each digit appears in the number.
 */
public class DigitFrequency {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for digit frequency analysis
        int number = sc.nextInt();

        // Declaring array to store frequency of each digit (0-9)
        int[] freq = new int[10];

        // Loop to extract digits from the number until it becomes 0
        while (number != 0) {
            // Extracting the last digit using modulo operation
            int digit = number % 10;
            // Incrementing the frequency count for this digit
            freq[digit]++;
            // Removing the last digit by integer division
            number /= 10;
        }

        // Loop to display frequency of each digit that appeared in the number
        for (int i = 0; i < 10; i++) {
            // Checking if the digit appeared at least once
            if (freq[i] > 0)
                // Displaying the digit and its frequency count
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }

        // Closing the Scanner to free resources
        sc.close();
    }
}
