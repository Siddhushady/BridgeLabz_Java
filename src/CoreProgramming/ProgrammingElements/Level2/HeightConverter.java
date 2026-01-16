package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

/**
 * HeightConverter class converts height from centimeters to feet and inches using user input.
 * The program demonstrates Scanner usage, type casting, and unit conversion by reading height
 * in centimeters, converting to total inches (1 cm = 1/2.54 inches), then separating into
 * feet (12 inches = 1 foot) and remaining inches. It displays height in cm, feet, and inches.
 */
public class HeightConverter {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner input=new Scanner(System.in);
        // Reading height in centimeters from user
        double heightCm=input.nextDouble();
        // Converting centimeters to total inches: 1 cm = 1/2.54 inches
        double totalInches=heightCm/2.54;
        // Calculating feet by dividing total inches by 12 and casting to int
        int feet=(int)(totalInches/12);
        // Calculating remaining inches using modulo operator
        double inches=totalInches%12;
        // Displaying height in centimeters, feet, and inches
        System.out.println("Your Height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+inches);
    }
}
