package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * VotingEligibility class determines if a person is eligible to vote based on their age.
 * The program reads a person's age from the user and checks if they are 18 years or older,
 * which is the standard voting age requirement. It displays a message indicating whether
 * the person can vote or not along with their age.
 */
public class VotingEligibility {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the person's age
        int age = input.nextInt();

        // Checking if age meets the voting eligibility requirement (18 or older)
        if (age >= 18) {
            // Displaying that the person is eligible to vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Displaying that the person is not eligible to vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
