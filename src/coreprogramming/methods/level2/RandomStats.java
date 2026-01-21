package Core_Programming.Methods.Level2;

/**
 * RandomStats class generates random 4-digit numbers and calculates statistics using methods.
 * The program demonstrates method usage by creating functions to generate random 4-digit
 * numbers and calculate average, minimum, and maximum values. It generates 5 random numbers
 * and displays them along with their statistics.
 */
public class RandomStats {

    /**
     * Generates an array of random 4-digit numbers.
     * @param size Number of random numbers to generate
     * @return Array of random 4-digit numbers (1000-9999)
     */
    public static int[] generate4DigitRandomArray(int size) {
        // Creating array to store random numbers
        int[] arr = new int[size];
        // Loop to generate random 4-digit numbers
        for (int i = 0; i < size; i++)
            // Generating random number between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        // Returning array of random numbers
        return arr;
    }

    /**
     * Calculates average, minimum, and maximum of an array of numbers.
     * @param numbers Array of numbers to analyze
     * @return Array containing [average, min, max]
     */
    public static double[] findAverageMinMax(int[] numbers) {
        // Initializing min, max to first element, sum to 0
        int min = numbers[0], max = numbers[0], sum = 0;

        // Enhanced for loop to process all numbers
        for (int n : numbers) {
            // Adding number to sum
            sum += n;
            // Updating minimum if current number is smaller
            min = Math.min(min, n);
            // Updating maximum if current number is larger
            max = Math.max(max, n);
        }

        // Returning array with average, min, and max
        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        // Calling method to generate 5 random 4-digit numbers
        int[] numbers = generate4DigitRandomArray(5);
        // Calling method to calculate statistics
        double[] result = findAverageMinMax(numbers);

        // Displaying all generated numbers
        for (int n : numbers) System.out.print(n + " ");
        System.out.println("\nAverage = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
}
