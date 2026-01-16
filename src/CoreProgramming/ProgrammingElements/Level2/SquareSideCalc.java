package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

/**
 * SquareSideCalc class calculates the side length of a square from its perimeter using user input.
 * The program demonstrates Scanner usage and arithmetic operations by reading the perimeter
 * of a square from the user and calculating the side length by dividing perimeter by 4
 * (since a square has 4 equal sides). It displays the calculated side length and perimeter.
 */
public class SquareSideCalc {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading perimeter of square from user
        double perimeter=sc.nextDouble();
        // Calculating side length: perimeter / 4 (square has 4 equal sides)
        double singleSide=perimeter/4;
        // Displaying calculated side length and perimeter
        System.out.println("The length of the side is "+singleSide+" whose perimeter is "+perimeter);
    }
}
