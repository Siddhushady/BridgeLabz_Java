package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

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

        input.close();
    }
}
