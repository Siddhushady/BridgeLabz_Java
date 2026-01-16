package Core_Programming.Arrays.Level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }

        sc.close();
    }
}
