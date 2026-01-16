package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
