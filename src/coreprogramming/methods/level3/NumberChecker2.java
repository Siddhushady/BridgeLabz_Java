package Core_Programming.Methods.Level3;

/**
 * NumberChecker2 class performs digit analysis operations using multiple methods.
 * The program demonstrates advanced method usage by creating functions to store digits,
 * calculate sum of digits, sum of squares of digits, check for Harshad numbers, and
 * calculate frequency of each digit (0-9) in a number.
 */
public class NumberChecker2 {

    /**
     * Stores all digits of a number in an array.
     * @param n The number
     * @return Array containing all digits
     */
    public static int[] storeDigits(int n) {
        // Creating array with size equal to number of digits
        int[] d = new int[String.valueOf(n).length()];
        // Loop to extract digits from right to left
        for (int i = d.length - 1; i >= 0; i--) {
            // Extracting last digit
            d[i] = n % 10;
            // Removing last digit
            n /= 10;
        }
        // Returning array of digits
        return d;
    }

    /**
     * Calculates the sum of all digits.
     * @param digits Array of digits
     * @return Sum of all digits
     */
    public static int sumDigits(int[] digits) {
        // Initializing sum to accumulate total
        int sum = 0;
        // Enhanced for loop to add each digit
        for (int d : digits) sum += d;
        // Returning the calculated sum
        return sum;
    }

    /**
     * Calculates the sum of squares of all digits.
     * @param digits Array of digits
     * @return Sum of squares of all digits
     */
    public static int sumSquareDigits(int[] digits) {
        // Initializing sum to accumulate squares
        int sum = 0;
        // Enhanced for loop to add square of each digit
        for (int d : digits)
            // Adding square of digit
            sum += Math.pow(d, 2);
        // Returning the calculated sum of squares
        return sum;
    }

    /**
     * Checks if a number is a Harshad number (divisible by sum of its digits).
     * @param number The number to check
     * @param digits Array of digits
     * @return true if Harshad number, false otherwise
     */
    public static boolean isHarshad(int number, int[] digits) {
        // Returning true if number is divisible by sum of its digits
        return number % sumDigits(digits) == 0;
    }

    /**
     * Calculates frequency of each digit (0-9) in a number.
     * @param digits Array of digits
     * @return 2D array where each row contains [digit, frequency]
     */
    public static int[][] digitFrequency(int[] digits) {
        // Creating 2D array: 10 rows (for digits 0-9), 2 columns [digit, frequency]
        int[][] freq = new int[10][2];
        // Loop to initialize digit values (0-9)
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        // Enhanced for loop to count frequency of each digit
        for (int d : digits) freq[d][1]++;
        // Returning frequency array
        return freq;
    }

    public static void main(String[] args) {
        // Setting number to analyze
        int number = 21;
        // Calling method to store digits
        int[] digits = storeDigits(number);

        // Calling methods to calculate and display statistics
        System.out.println("Sum of digits = " + sumDigits(digits));
        System.out.println("Sum of squares = " + sumSquareDigits(digits));
        System.out.println("Harshad Number = " + isHarshad(number, digits));

        // Calling method to calculate digit frequencies
        int[][] freq = digitFrequency(digits);
        // Loop to display frequency of each digit that appears
        for (int i = 0; i < freq.length; i++)
            // Displaying only digits that appear at least once
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + " Frequency " + freq[i][1]);
    }
}
