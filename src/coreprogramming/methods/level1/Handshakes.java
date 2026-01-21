package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * Handshakes class calculates the maximum number of handshakes possible among n people.
 * The program demonstrates method usage by creating a function that calculates handshakes
 * using the combination formula: n * (n-1) / 2, which represents the number of ways
 * to choose 2 people from n people (each pair shakes hands once).
 */
public class Handshakes {
    /**
     * Calculates maximum number of handshakes among n people.
     * @param n Number of people
     * @return Maximum number of handshakes possible
     */
    public static int calculateHandshakes(int n) {
        // Calculating handshakes using combination formula: C(n,2) = n*(n-1)/2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading number of students
        int students = sc.nextInt();

        // Calling method to calculate and display maximum handshakes
        System.out.println("Maximum handshakes = " + calculateHandshakes(students));
        // Closing the Scanner to free resources
        sc.close();
    }
}
