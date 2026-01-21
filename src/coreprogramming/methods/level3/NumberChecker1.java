package Core_Programming.Methods.Level3;

/**
 * NumberChecker1 class performs various number analysis operations using multiple methods.
 * The program demonstrates advanced method usage by creating functions to count digits,
 * store digits in an array, check for duck numbers, check for Armstrong numbers, and
 * find largest/second largest and smallest/second smallest digits in a number.
 */
public class NumberChecker1 {

    /**
     * Counts the number of digits in a number.
     * @param n The number
     * @return Number of digits
     */
    public static int countDigits(int n) {
        // Converting number to string and returning its length
        return String.valueOf(n).length();
    }

    /**
     * Stores all digits of a number in an array.
     * @param n The number
     * @return Array containing all digits
     */
    public static int[] storeDigits(int n) {
        // Getting count of digits to determine array size
        int count = countDigits(n);
        // Creating array to store digits
        int[] digits = new int[count];
        // Loop to extract digits from right to left
        for (int i = count - 1; i >= 0; i--) {
            // Extracting last digit
            digits[i] = n % 10;
            // Removing last digit
            n /= 10;
        }
        // Returning array of digits
        return digits;
    }

    /**
     * Checks if a number is a duck number (contains at least one non-zero digit).
     * @param digits Array of digits
     * @return true if duck number, false otherwise
     */
    public static boolean isDuckNumber(int[] digits) {
        // Enhanced for loop to check each digit
        for (int d : digits)
            // Returning true if any digit is non-zero
            if (d != 0) return true;
        // Returning false if all digits are zero
        return false;
    }

    /**
     * Checks if a number is an Armstrong number (sum of digits raised to power equals the number).
     * @param n The number to check
     * @param digits Array of digits
     * @return true if Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int n, int[] digits) {
        // Power is the number of digits
        int power = digits.length;
        // Initializing sum to accumulate powers
        int sum = 0;
        // Enhanced for loop to calculate sum of digits raised to power
        for (int d : digits)
            // Adding digit raised to power
            sum += Math.pow(d, power);
        // Returning true if sum equals original number
        return sum == n;
    }

    /**
     * Finds the largest and second largest digits in a number.
     * @param digits Array of digits
     */
    public static void findLargestSecondLargest(int[] digits) {
        // Initializing max values to minimum integer
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        // Enhanced for loop to find largest and second largest
        for (int d : digits) {
            // Checking if current digit is larger than max1
            if (d > max1) {
                // Updating second largest to previous largest
                max2 = max1;
                // Updating largest to current digit
                max1 = d;
            } 
            // Checking if current digit is larger than max2 but not equal to max1
            else if (d > max2 && d != max1) {
                // Updating second largest
                max2 = d;
            }
        }
        // Displaying largest and second largest digits
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    /**
     * Finds the smallest and second smallest digits in a number.
     * @param digits Array of digits
     */
    public static void findSmallestSecondSmallest(int[] digits) {
        // Initializing min values to maximum integer
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        // Enhanced for loop to find smallest and second smallest
        for (int d : digits) {
            // Checking if current digit is smaller than min1
            if (d < min1) {
                // Updating second smallest to previous smallest
                min2 = min1;
                // Updating smallest to current digit
                min1 = d;
            } 
            // Checking if current digit is smaller than min2 but not equal to min1
            else if (d < min2 && d != min1) {
                // Updating second smallest
                min2 = d;
            }
        }
        // Displaying smallest and second smallest digits
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        // Setting number to analyze
        int number = 153;
        // Calling method to store digits
        int[] digits = storeDigits(number);

        // Calling methods to check number properties and display results
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));
        // Finding and displaying largest and second largest
        findLargestSecondLargest(digits);
        // Finding and displaying smallest and second smallest
        findSmallestSecondSmallest(digits);
    }
}
