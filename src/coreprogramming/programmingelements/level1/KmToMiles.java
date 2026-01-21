package coreprogramming.programmingelements.level1;

/**
 * KmToMiles class converts distance from kilometers to miles.
 * The program demonstrates basic variable usage and unit conversion by reading
 * a distance in kilometers and converting it to miles using the conversion factor
 * (1 kilometer = 1/1.6 miles). It displays the converted distance.
 */
public class KmToMiles {
    public static void main(String[] args){
        // Storing distance in kilometers
        double km=10.8;
        // Converting kilometers to miles: 1 km = 1/1.6 miles
        double miles=km/1.6;
        // Displaying the converted distance in miles
        System.out.println("The distance "+km+" km in miles is "+miles);
    }
}
