package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

/**
 * UserDistanceConverter class converts distance from kilometers to miles using user input.
 * The program demonstrates Scanner usage for user input and unit conversion by reading
 * a distance in kilometers from the user and converting it to miles using the conversion
 * factor (1 kilometer = 1/1.6 miles). It displays the converted distance.
 */
public class UserDistanceConverter {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner input=new Scanner(System.in);
        // Reading distance in kilometers from user
        double kilometers=input.nextDouble();
        // Converting kilometers to miles: 1 km = 1/1.6 miles
        double miles=kilometers/1.6;
        // Displaying the converted distance in miles
        System.out.println("The total miles is "+miles+" mile for the given "+kilometers+" km");
    }
}
