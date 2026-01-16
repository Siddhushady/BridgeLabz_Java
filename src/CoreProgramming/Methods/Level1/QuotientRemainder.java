package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * QuotientRemainder class calculates quotient and remainder using a method.
 * The program demonstrates method usage by creating a function that performs division
 * and returns both the quotient (result of division) and remainder (modulo result)
 * when dividing a number by a divisor. The results are returned as an array.
 */
public class QuotientRemainder {
    /**
     * Calculates quotient and remainder when dividing number by divisor.
     * @param number The dividend
     * @param divisor The divisor
     * @return Array containing [quotient, remainder]
     */
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Returning array with quotient (integer division) and remainder (modulo)
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading the number to be divided
        int number = sc.nextInt();
        // Reading the divisor
        int divisor = sc.nextInt();

        // Calling method to calculate quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);
        // Displaying the quotient
        System.out.println("Quotient = " + result[0]);
        // Displaying the remainder
        System.out.println("Remainder = " + result[1]);

        // Closing the Scanner to free resources
        sc.close();
    }
}
