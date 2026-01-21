package coreprogramming.programmingelements.level2;
import java.util.Scanner;

/**
 * TriangleArea class calculates the area of a triangle in square centimeters and square inches
 * using user input.
 * The program demonstrates Scanner usage, arithmetic operations, and unit conversion by reading
 * base and height in centimeters, calculating area using formula (0.5 * base * height), and then
 * converting from square centimeters to square inches (1 cm² = 1/(2.54)² in²). It displays area in both units.
 */
public class TriangleArea {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading base of triangle in centimeters from user
        double baseCm=sc.nextDouble();
        // Reading height of triangle in centimeters from user
        double heightCm=sc.nextDouble();
        // Calculating area in square centimeters: 0.5 * base * height
        double areaSqCm=0.5*baseCm*heightCm;
        // Converting area from square centimeters to square inches: 1 cm² = 1/(2.54)² in²
        double areaSqIn=areaSqCm/(2.54*2.54);
        // Displaying area in both square inches and square centimeters
        System.out.println("The Area of the triangle in sq in is "+areaSqIn+" and sq cm is "+areaSqCm);
    }
}
