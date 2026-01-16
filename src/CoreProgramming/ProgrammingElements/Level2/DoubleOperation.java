package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstValue = sc.nextDouble();
        double secondValue = sc.nextDouble();
        double thirdValue = sc.nextDouble();
        double exprResult1 = firstValue + secondValue * thirdValue;
        double exprResult2 = firstValue * secondValue + thirdValue;
        double exprResult3 = thirdValue + firstValue / secondValue;
        double exprResult4 = firstValue % secondValue + thirdValue;
        System.out.println(
                "The results of Double Operations are " +
                        exprResult1 + ", " +
                        exprResult2 + ", " +
                        exprResult3 + ", and " +
                        exprResult4
        );
    }
}
