package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

/**
 * BasicCalc class performs basic arithmetic operations (addition, subtraction, multiplication, division)
 * on two numbers using user input.
 * The program demonstrates Scanner usage and arithmetic operations by reading two numbers from the user
 * and performing all four basic operations. It displays the results of addition, subtraction,
 * multiplication, and division.
 */
public class BasicCalc {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading first number from user
        double firstVal=sc.nextDouble();
        // Reading second number from user
        double secondVal=sc.nextDouble();
        // Calculating sum of two numbers
        double sumAns=firstVal+secondVal;
        // Calculating difference of two numbers
        double substractionAns=firstVal-secondVal;
        // Calculating product of two numbers
        double prodAns=firstVal*secondVal;
        // Calculating quotient of two numbers
        double divAns=firstVal/secondVal;
        // Displaying all four operation results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+firstVal+" and "+secondVal+" is "+sumAns+", "+substractionAns+", "+prodAns+", and "+divAns);
    }
}
