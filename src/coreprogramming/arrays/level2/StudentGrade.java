package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * StudentGrade class calculates percentage and assigns grades to multiple students.
 * The program reads the number of students, then for each student it reads marks in
 * Physics, Chemistry, and Maths. It calculates the average percentage and assigns
 * a grade (A, B, C, D, E, or R) based on percentage ranges. All data is stored in
 * parallel arrays and displayed at the end.
 */
public class StudentGrade {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number of students
        int n = sc.nextInt();

        // Declaring array to store Physics marks for all students
        int[] physics = new int[n];
        // Declaring array to store Chemistry marks for all students
        int[] chemistry = new int[n];
        // Declaring array to store Maths marks for all students
        int[] maths = new int[n];
        // Declaring array to store calculated percentages
        double[] percent = new double[n];
        // Declaring array to store assigned grades
        char[] grade = new char[n];

        // Loop to process each student's data
        for (int i = 0; i < n; i++) {
            // Reading Physics marks for current student
            physics[i] = sc.nextInt();
            // Reading Chemistry marks for current student
            chemistry[i] = sc.nextInt();
            // Reading Maths marks for current student
            maths[i] = sc.nextInt();

            // Calculating average percentage from three subjects
            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Assigning grade based on percentage ranges
            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Loop to display percentage and grade for each student
        for (int i = 0; i < n; i++) {
            // Printing percentage and corresponding grade
            System.out.println(percent[i] + " " + grade[i]);
        }

        // Closing the Scanner to free resources
        sc.close();
    }
}
