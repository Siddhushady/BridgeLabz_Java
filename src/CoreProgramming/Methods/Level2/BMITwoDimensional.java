package Core_Programming.Methods.Level2;

import java.util.Scanner;

public class BMITwoDimensional {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    public static String[] getStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height cm
        }

        calculateBMI(data);
        String[] status = getStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][1] + " " + data[i][0] + " " + data[i][2] + " " + status[i]);
        }

        sc.close();
    }
}
