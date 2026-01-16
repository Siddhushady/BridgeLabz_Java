package Core_Programming.Arrays.Level1;

import java.util.Scanner;

public class PositiveNegative {
    static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter N" + (i + 1) + ": ");
            n[i] = scan.nextInt();
        }
        System.out.println();

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                System.out.print("N" + (i + 1) + ": Positive, ");
                if (n[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            }
            else if (n[i] == 0)
                System.out.println("N" + (i + 1) + ": Zero");
            else
                System.out.println("N" + (i + 1) + ": Negative");
        }
        System.out.println();

        if (n[1] > n[n.length - 1])
            System.out.println("N1 is greater than N5");
        else if (n[1] == n[n.length - 1])
            System.out.println("N1 is equal to N5");
        else
            System.out.println("N1 is less than N5");
    }
}
