package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

/**
 * DistanceConvert class converts distance from feet to yards and miles using user input.
 * The program demonstrates Scanner usage and unit conversion by reading a distance in feet
 * from the user, converting it to yards (1 yard = 3 feet), and then to miles (1 mile = 1760 yards).
 * It displays the converted distances in both yards and miles.
 */
public class DistanceConvert {
    public static void main(String[] args){
        // Creating Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        // Reading distance in feet from user
        double feetValue=sc.nextDouble();
        // Converting feet to yards: 1 yard = 3 feet
        double yardsVal=feetValue/3;
        // Converting yards to miles: 1 mile = 1760 yards
        double milesVal=yardsVal/1760;
        // Displaying converted distances in yards and miles
        System.out.println("The distance in yards is "+yardsVal+" while the distance in miles is "+milesVal);
    }
}
