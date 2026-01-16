package Core_Programming.Methods.Level3;

/**
 * GeometryUtils class provides geometric utility methods for distance and line equation calculations.
 * The program demonstrates advanced method usage by creating functions to calculate the distance
 * between two points using the Euclidean distance formula and to find the equation of a line
 * passing through two points in slope-intercept form (y = mx + b).
 */
public class GeometryUtils {

    /**
     * Calculates the Euclidean distance between two points.
     * @param x1 X coordinate of first point
     * @param y1 Y coordinate of first point
     * @param x2 X coordinate of second point
     * @param y2 Y coordinate of second point
     * @return Distance between the two points
     */
    public static double findDistance(double x1, double y1, double x2, double y2) {
        // Calculating distance using formula: sqrt((x2-x1)^2 + (y2-y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Finds the equation of a line passing through two points in slope-intercept form.
     * @param x1 X coordinate of first point
     * @param y1 Y coordinate of first point
     * @param x2 X coordinate of second point
     * @param y2 Y coordinate of second point
     * @return Array containing [slope, y-intercept]
     */
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculating slope: (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        // Calculating y-intercept: b = y1 - m*x1
        double b = y1 - m * x1;
        // Returning array with slope and y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        // Setting coordinates for two points
        double x1 = 2, y1 = 4, x2 = 6, y2 = 8;

        // Calling method to calculate and display distance
        System.out.println("Distance: " + findDistance(x1, y1, x2, y2));

        // Calling method to find line equation
        double[] line = findLineEquation(x1, y1, x2, y2);
        // Displaying line equation in slope-intercept form
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
    }
}
