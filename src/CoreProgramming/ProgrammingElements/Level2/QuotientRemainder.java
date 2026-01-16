package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

/**
 * QuotientRemainder class calculates quotient and remainder of division using user input.
 * The program demonstrates Scanner usage and arithmetic operations by reading two integers
 * from the user and performing integer division (quotient) and modulo operation (remainder).
 * It displays both the quotient and remainder along with the two input numbers.
 */
public class QuotientRemainder {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading first number (dividend) from user
        int firstNum=sc.nextInt();
        // Reading second number (divisor) from user
        int secondNum=sc.nextInt();

        // Calculating quotient using integer division
        int divResult=firstNum/secondNum;
        // Calculating remainder using modulo operator
        int modResult=firstNum%secondNum;

        // Displaying quotient and remainder with the two input numbers
        System.out.println("The Quotient is "+divResult+" and Reminder is "+modResult+" of two number "+firstNum+" and "+secondNum);
    }
}
