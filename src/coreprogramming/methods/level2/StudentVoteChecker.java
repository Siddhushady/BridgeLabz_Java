package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * StudentVoteChecker class checks voting eligibility for multiple students using a method.
 * The program demonstrates method usage by creating a function that determines if a student
 * can vote based on their age. A student must be 18 or older to vote. It processes 10 students
 * and displays the voting eligibility for each.
 */
public class StudentVoteChecker {

    /**
     * Checks if a student can vote based on age.
     * @param age The student's age
     * @return true if age >= 18 and age >= 0, false otherwise
     */
    public static boolean canStudentVote(int age) {
        // Checking if age is invalid (negative)
        if (age < 0) return false;
        // Returning true if age meets voting requirement (18 or older)
        return age >= 18;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Declaring array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to read and check voting eligibility for 10 students
        for (int i = 0; i < 10; i++) {
            // Reading age of current student
            ages[i] = sc.nextInt();
            // Calling method to check eligibility and displaying result
            System.out.println(canStudentVote(ages[i]));
        }
        // Closing the Scanner to free resources
        sc.close();
    }
}
