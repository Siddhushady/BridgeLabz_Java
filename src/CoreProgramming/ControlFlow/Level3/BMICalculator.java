package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double heightCm = input.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 40) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
