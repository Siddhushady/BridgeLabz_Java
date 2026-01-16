package CoreProgramming.String.Level2;

/**
 * StudentGrade class calculates grades for multiple students using multiple methods.
 * The program demonstrates string manipulation and array operations by creating methods
 * to generate random marks, calculate totals/averages/percentages, and assign grades
 * based on percentage ranges. It displays a formatted score card for all students.
 */
public class StudentGrade {

    /**
     * Generates random marks for multiple students in three subjects (Physics, Chemistry, Maths).
     * @param students Number of students
     * @return 2D array with marks [student][subject] where subjects are Physics, Chemistry, Maths
     */
    public static int[][] generateMarks(int students) {

        // Creating 2D array: students rows, 3 columns (subjects)
        int[][] marks = new int[students][3];

        // Loop to generate marks for each student
        for (int i = 0; i < students; i++) {
            // Generating random marks (0-99) for Physics
            marks[i][0] = (int) (Math.random() * 100);
            // Generating random marks (0-99) for Chemistry
            marks[i][1] = (int) (Math.random() * 100);
            // Generating random marks (0-99) for Maths
            marks[i][2] = (int) (Math.random() * 100);
        }
        // Returning array of marks
        return marks;
    }

    /**
     * Calculates total, average, and percentage for all students.
     * @param marks 2D array containing marks for all students
     * @return 2D array with [total, average, percentage] for each student
     */
    public static double[][] calculateResults(int[][] marks) {

        // Creating result array: same number of students, 3 columns [total, avg, percent]
        double[][] result = new double[marks.length][3];

        // Loop to calculate results for each student
        for (int i = 0; i < marks.length; i++) {
            // Calculating total marks from three subjects
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            // Calculating average: total / 3
            double avg = total / 3.0;
            // Percentage is same as average (out of 100)
            double percent = avg;

            // Storing total in result array
            result[i][0] = total;
            // Storing rounded average (2 decimal places)
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            // Storing rounded percentage (2 decimal places)
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        // Returning array with calculated results
        return result;
    }

    /**
     * Determines grade based on percentage.
     * @param percent The percentage score
     * @return Grade letter (A, B, C, or D)
     */
    public static String getGrade(double percent) {
        // Assigning grade A for percentage >= 90
        if (percent >= 90) return "A";
        // Assigning grade B for percentage >= 75
        if (percent >= 75) return "B";
        // Assigning grade C for percentage >= 60
        if (percent >= 60) return "C";
        // Assigning grade D for percentage < 60
        return "D";
    }

    public static void main(String[] args) {

        // Setting number of students
        int students = 5;

        // Calling method to generate random marks
        int[][] marks = generateMarks(students);
        // Calling method to calculate results
        double[][] result = calculateResults(marks);

        // Displaying table header
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        // Loop to display data for all students
        for (int i = 0; i < students; i++) {
            // Displaying formatted score card row
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            getGrade(result[i][2])
            );
        }
    }
}
