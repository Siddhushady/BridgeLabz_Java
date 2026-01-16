package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * SwitchCalculator class implements a basic calculator using switch-case statements.
 * The program reads two numbers and an operator (+, -, *, /) from the user and performs
 * the corresponding arithmetic operation. It uses a switch statement to handle different
 * operators and displays the result. If an invalid operator is provided, it shows an error message.
 */
public class SwitchCalculator {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the first number
        double first = input.nextDouble();
        // Reading the second number
        double second = input.nextDouble();
        // Reading the operator (+, -, *, /)
        String op = input.next();

        // Switch statement to perform operation based on operator
        switch (op) {
            // Case for addition
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            // Case for subtraction
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            // Case for multiplication
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            // Case for division
            case "/":
                System.out.println("Result: " + (first / second));
                break;
            // Default case for invalid operators
            default:
                System.out.println("Invalid Operator");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
