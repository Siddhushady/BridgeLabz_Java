package Core_Programming.Methods.Level2;

import java.util.Scanner;

public class SumNaturalRecursive {

    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) return;

        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        System.out.println(sum1);
        System.out.println(sum2);

        sc.close();
    }
}
