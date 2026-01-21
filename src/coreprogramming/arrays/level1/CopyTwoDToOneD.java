package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * CopyTwoDToOneD class converts a two-dimensional matrix into a one-dimensional array.
 * The program reads the dimensions (rows and columns) of a 2D matrix from the user,
 * then reads all matrix elements and stores them in a 1D array in row-major order.
 * Finally, it displays all elements of the converted 1D array.
 */
public class CopyTwoDToOneD {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading the number of rows for the 2D matrix
        int rows = sc.nextInt();
        // Reading the number of columns for the 2D matrix
        int cols = sc.nextInt();

        // Declaring a 2D array to store the matrix elements
        int[][] matrix = new int[rows][cols];
        // Declaring a 1D array with size equal to total elements (rows * cols)
        int[] array = new int[rows * cols];

        // Index variable to track position in the 1D array
        int index = 0;

        // Outer loop to iterate through each row of the matrix
        for (int i = 0; i < rows; i++) {
            // Inner loop to iterate through each column of the current row
            for (int j = 0; j < cols; j++) {
                // Reading matrix element from user input
                matrix[i][j] = sc.nextInt();
                // Copying the matrix element to 1D array and incrementing index
                array[index++] = matrix[i][j];
            }
        }

        // Loop to display all elements of the converted 1D array
        for (int i = 0; i < array.length; i++) {
            // Printing each element followed by a space
            System.out.print(array[i] + " ");
        }
        // Closing the Scanner to free resources
        sc.close();
    }
}
