package CoreProgramming.String.Level2;

public class StudentGrade {

    // Generate random PCM marks
    public static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int) (Math.random() * 100);
            marks[i][1] = (int) (Math.random() * 100);
            marks[i][2] = (int) (Math.random() * 100);
        }
        return marks;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = avg;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Calculate grade
    public static String getGrade(double percent) {
        if (percent >= 90) return "A";
        if (percent >= 75) return "B";
        if (percent >= 60) return "C";
        return "D";
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < students; i++) {
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
