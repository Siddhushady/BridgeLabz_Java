package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/**
 * DoubleOperation class demonstrates operator precedence with double values using user input.
 * The program demonstrates Scanner usage and operator precedence by reading three double values
 * and performing four different arithmetic expressions that showcase how multiplication, division,
 * and modulo operations have higher precedence than addition. It displays all four results.
 */
public class DoubleOperation {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading first double value from user
        double firstValue = sc.nextDouble();
        // Reading second double value from user
        double secondValue = sc.nextDouble();
        // Reading third double value from user
        double thirdValue = sc.nextDouble();
        // Expression 1: multiplication has precedence: firstValue + (secondValue * thirdValue)
        double exprResult1 = firstValue + secondValue * thirdValue;
        // Expression 2: multiplication has precedence: (firstValue * secondValue) + thirdValue
        double exprResult2 = firstValue * secondValue + thirdValue;
        // Expression 3: division has precedence: thirdValue + (firstValue / secondValue)
        double exprResult3 = thirdValue + firstValue / secondValue;
        // Expression 4: modulo has precedence: (firstValue % secondValue) + thirdValue
        double exprResult4 = firstValue % secondValue + thirdValue;
        // Displaying all four expression results
        System.out.println(
                "The results of Double Operations are " +
                        exprResult1 + ", " +
                        exprResult2 + ", " +
                        exprResult3 + ", and " +
                        exprResult4
        );
    }
}
