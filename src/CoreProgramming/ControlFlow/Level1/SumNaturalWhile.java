package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            int i = 1;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using while loop = " + sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
