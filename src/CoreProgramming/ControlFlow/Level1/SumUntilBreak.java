package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

public class SumUntilBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}
