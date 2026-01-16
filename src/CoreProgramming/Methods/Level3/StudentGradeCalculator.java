package Core_Programming.Methods.Level3;

public class StudentGradeCalculator {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + (int)(Math.random() * 91); // 10–100
            }
        }
        return marks;
    }

    public static double calculatePercentage(int[] marks) {
        int total = marks[0] + marks[1] + marks[2];
        return Math.round((total / 300.0) * 10000.0) / 100.0;
    }

    public static String findGradeRemark(double percentage) {
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

    public static void displayScoreCard(int[][] marks) {
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            double percentage = calculatePercentage(marks[i]);
            String grade = findGradeRemark(percentage);

            System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t\t%s%n",
                    marks[i][0], marks[i][1], marks[i][2], percentage, grade);
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] marks = generateMarks(students);
        displayScoreCard(marks);
    }
}
