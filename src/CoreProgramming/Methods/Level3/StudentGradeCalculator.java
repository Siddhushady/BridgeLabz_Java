package Core_Programming.Methods.Level3;

/**
 * StudentGradeCalculator class calculates grades for multiple students using multiple methods.
 * The program demonstrates advanced method usage by creating functions to generate random marks,
 * calculate percentages, assign grades based on percentage ranges, and display formatted score cards.
 * It processes marks for Physics, Chemistry, and Maths for each student.
 */
public class StudentGradeCalculator {

    /**
     * Generates random marks for multiple students in three subjects.
     * @param students Number of students
     * @return 2D array with marks [student][subject] where subjects are Physics, Chemistry, Maths
     */
    public static int[][] generateMarks(int students) {
        // Creating 2D array: students rows, 3 columns (subjects)
        int[][] marks = new int[students][3];
        // Nested loops to generate marks for each student and subject
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                // Generating random marks between 10 and 100
                marks[i][j] = 10 + (int)(Math.random() * 91); // 10–100
            }
        }
        // Returning array of marks
        return marks;
    }

    /**
     * Calculates percentage from marks in three subjects.
     * @param marks Array containing marks in [Physics, Chemistry, Maths]
     * @return Percentage rounded to 2 decimal places
     */
    public static double calculatePercentage(int[] marks) {
        // Calculating total marks from three subjects
        int total = marks[0] + marks[1] + marks[2];
        // Calculating percentage and rounding to 2 decimal places
        return Math.round((total / 300.0) * 10000.0) / 100.0;
    }

    /**
     * Determines grade and remark based on percentage.
     * @param percentage The percentage score
     * @return Grade string with level and remark
     */
    public static String findGradeRemark(double percentage) {
        // Assigning grade based on percentage ranges
        if (percentage >= 80)
            return "A (Level 4, above agency-normalized standards)";
        else if (percentage >= 70)
            return "B (Level 3, at agency-normalized standards)";
        else if (percentage >= 60)
            return "C (Level 2, below, but approaching agency-normalized standards)";
        else if (percentage >= 50)
            return "D (Level 1, well below agency-normalized standards)";
        else if (percentage >= 40)
            return "E (Level 1-, too below agency-normalized standards)";
        else
            return "R (Remedial standards)";
    }

    /**
     * Displays formatted score card for all students.
     * @param marks 2D array containing marks for all students
     */
    public static void displayScoreCard(int[][] marks) {
        // Displaying header row
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        // Loop to process each student's data
        for (int i = 0; i < marks.length; i++) {
            // Calling method to calculate percentage
            double percentage = calculatePercentage(marks[i]);
            // Calling method to get grade and remark
            String grade = findGradeRemark(percentage);

            // Displaying formatted score card row
            System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t\t%s%n",
                    marks[i][0], marks[i][1], marks[i][2], percentage, grade);
        }
    }

    public static void main(String[] args) {
        // Setting number of students
        int students = 5;
        // Calling method to generate random marks
        int[][] marks = generateMarks(students);
        // Calling method to display score cards
        displayScoreCard(marks);
    }
}
