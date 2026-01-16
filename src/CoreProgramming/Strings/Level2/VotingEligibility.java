package CoreProgramming.String.Level2;

import java.util.Scanner;

/**
 * VotingEligibility class checks voting eligibility for multiple students using string arrays.
 * The program demonstrates string manipulation and array operations by creating methods to
 * generate random ages, check voting eligibility (age >= 18), and display results in a table format.
 * It uses 2D string arrays to store age and voting status for each student.
 */
public class VotingEligibility {

    /**
     * Generates an array of random ages.
     * @param n Number of ages to generate
     * @return Array of random ages (0-49)
     */
    public static int[] generateAges(int n) {
        // Creating array to store ages
        int[] ages = new int[n];
        // Loop to generate random ages
        for (int i = 0; i < n; i++) {
            // Generating random age between 0 and 49
            ages[i] = (int) (Math.random() * 50); // random age
        }
        // Returning array of ages
        return ages;
    }

    /**
     * Checks voting eligibility for all students and creates result table.
     * @param ages Array of student ages
     * @return 2D array with [age, status] for each student
     */
    public static String[][] checkVoting(int[] ages) {

        // Creating 2D array: same number of students, 2 columns [age, status]
        String[][] result = new String[ages.length][2];

        // Loop to process each student's age
        for (int i = 0; i < ages.length; i++) {
            // Converting age to string and storing in first column
            result[i][0] = String.valueOf(ages[i]);

            // Checking if age meets voting requirement (18 or older)
            if (ages[i] >= 18) {
                // Storing "Can Vote" status
                result[i][1] = "Can Vote";
            } else {
                // Storing "Cannot Vote" status
                result[i][1] = "Cannot Vote";
            }
        }
        // Returning array with age and status for each student
        return result;
    }

    /**
     * Displays the voting eligibility table.
     * @param table 2D array containing [age, status] for each student
     */
    public static void display(String[][] table) {
        // Displaying table header
        System.out.println("Age\tStatus");
        // Loop to display each student's data
        for (int i = 0; i < table.length; i++) {
            // Displaying age and voting status
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter number of students
        System.out.print("Enter number of students : ");
        // Reading number of students from user
        int n = sc.nextInt();

        // Calling method to generate random ages
        int[] ages = generateAges(n);
        // Calling method to check voting eligibility
        String[][] result = checkVoting(ages);

        // Calling method to display results table
        display(result);
    }
}
