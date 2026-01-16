package CoreProgramming.ProgrammingElements.Level1;

/**
 * EarthVolumeCalculator class calculates the volume of Earth in cubic kilometers and cubic miles.
 * The program demonstrates use of Math class methods and unit conversion by calculating
 * volume using the sphere volume formula (4/3 * π * r³), then converting the result
 * from cubic kilometers to cubic miles using the conversion factor.
 */
public class EarthVolumeCalculator {
    public static void main(String[] args){
        // Storing Earth's radius in kilometers
        double radiusKm=6378;
        // Calculating volume in cubic kilometers using sphere formula: 4/3 * π * r³
        double volumeKm=4.0/3*Math.PI*Math.pow(radiusKm,3);
        // Converting volume from cubic kilometers to cubic miles (1 km = 1.6 miles, so 1 km³ = 1.6³ miles³)
        double volumeMiles=volumeKm/Math.pow(1.6,3);
        // Displaying volume in both cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeMiles);
    }
}
