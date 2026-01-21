package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * VoterEligibility class checks the voting eligibility of 10 students based on their age.
 * The program reads the ages of 10 students, stores them in an array, and then checks
 * each student's eligibility to vote. A student is eligible to vote if their age is
 * 18 years or older. The program displays the eligibility status for each student.
 */
public class VoterEligibility {
    static void main (String[] args) {
        // Creating Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Declaring array to store ages of 10 students
        int[] age = new int[10];
        // Prompting user to enter ages of all 10 students
        System.out.println("Enter age of all 10 students");
        // Loop to read ages of all 10 students
        for  (int i = 0; i < age.length; i++) {
            // Reading and storing each student's age in the array
            age[i] = scan.nextInt();
        }

        // Enhanced for loop to iterate through each age in the array
        for (int i : age) {
            // Checking if the age is 18 or above (voting eligibility threshold)
            if (i >= 18) {
                // Displaying that the student is eligible to vote
                System.out.println("Eligible to vote");
            } else {
                // Displaying that the student is not eligible to vote
                System.out.println("Not Eligible to vote");
            }
        }
    }
}
