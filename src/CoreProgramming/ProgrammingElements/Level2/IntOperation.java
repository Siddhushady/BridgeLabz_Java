package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

/**
 * IntOperation class demonstrates operator precedence with integer values using user input.
 * The program demonstrates Scanner usage and operator precedence by reading three integer values
 * and performing four different arithmetic expressions that showcase how multiplication, division,
 * and modulo operations have higher precedence than addition. It displays all four results.
 */
public class IntOperation {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading first integer value from user
        int firstValue=sc.nextInt();
        // Reading second integer value from user
        int secondValue=sc.nextInt();
        // Reading third integer value from user
        int thirdValue=sc.nextInt();
        // Expression 1: multiplication has precedence: firstValue + (secondValue * thirdValue)
        int exprResult1=firstValue+secondValue*thirdValue;
        // Expression 2: multiplication has precedence: (firstValue * secondValue) + thirdValue
        int exprResult2=firstValue*secondValue+thirdValue;
        // Expression 3: division has precedence: thirdValue + (firstValue / secondValue)
        int exprResult3=thirdValue+firstValue/secondValue;
        // Expression 4: modulo has precedence: (firstValue % secondValue) + thirdValue
        int exprResult4=firstValue%secondValue+thirdValue;
        // Displaying all four expression results
        System.out.println("The results of Int Operations are "+exprResult1+", "+exprResult2+", "+exprResult3+", and "+exprResult4);
    }
}
