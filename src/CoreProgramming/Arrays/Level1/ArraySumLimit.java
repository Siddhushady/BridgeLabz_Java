package Core_Programming.Arrays.Level1;

import java.util.Scanner;

public class ArraySumLimit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] n = new double[10];
        double sum = 0.0;
        int index = 0;

        while (true) {
            double value = sc.nextDouble();
            if (value <= 0 || index == 9)
                break;
            n[index++] = value;
        }

        for (int i = 0; i < index; i++) {
            sum += n[i];
        }

        System.out.println("\nSum: " + sum);
    }
}
