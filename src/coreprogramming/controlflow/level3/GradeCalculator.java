package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * GradeCalculator class calculates average marks and assigns performance levels.
 * The program reads marks in Physics, Chemistry, and Maths, calculates the average,
 * and assigns a performance level based on the average score. The levels range from
 * Level 4 (highest) to Remedial Standards (lowest), with specific thresholds for each level.
 */
public class GradeCalculator {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading marks in Physics
        int physics = input.nextInt();
        // Reading marks in Chemistry
        int chemistry = input.nextInt();
        // Reading marks in Maths
        int maths = input.nextInt();

        // Calculating average of three subjects (using 3.0 to ensure double division)
        double average = (physics + chemistry + maths) / 3.0;

        // Displaying the calculated average marks
        System.out.println("Average Marks: " + average);

        // Assigning performance level based on average score ranges
        if (average >= 80) {
            System.out.println("Level 4 | Above agency normalised standards");
        } else if (average >= 70) {
            System.out.println("Level 3 | At agency normalised standards");
        } else if (average >= 60) {
            System.out.println("Level 2 | Below, but approaching agency normalised standards");
        } else if (average >= 50) {
            System.out.println("Level 1 | Well below agency normalised standards");
        } else if (average >= 40) {
            System.out.println("Level 1- | too below agency normalised standards");
        } else {
            System.out.println("Remedial Standards");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
