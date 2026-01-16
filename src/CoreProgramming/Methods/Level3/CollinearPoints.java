package Core_Programming.Methods.Level3;

/**
 * CollinearPoints class checks if three points are collinear using two different methods.
 * The program demonstrates advanced method usage by creating functions that determine
 * collinearity using slope comparison and area calculation. Three points are collinear
 * if they lie on the same straight line.
 */
public class CollinearPoints {

    /**
     * Checks collinearity by comparing slopes between points.
     * @param x1 X coordinate of first point
     * @param y1 Y coordinate of first point
     * @param x2 X coordinate of second point
     * @param y2 Y coordinate of second point
     * @param x3 X coordinate of third point
     * @param y3 Y coordinate of third point
     * @return true if all three slopes are equal (points are collinear)
     */
    public static boolean isCollinearSlope(double x1, double y1,
                                           double x2, double y2,
                                           double x3, double y3) {
        // Calculating slope between points A and B
        double slopeAB = (y2 - y1) / (x2 - x1);
        // Calculating slope between points B and C
        double slopeBC = (y3 - y2) / (x3 - x2);
        // Calculating slope between points A and C
        double slopeAC = (y3 - y1) / (x3 - x1);
        // Points are collinear if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    /**
     * Checks collinearity by calculating area of triangle formed by three points.
     * @param x1 X coordinate of first point
     * @param y1 Y coordinate of first point
     * @param x2 X coordinate of second point
     * @param y2 Y coordinate of second point
     * @param x3 X coordinate of third point
     * @param y3 Y coordinate of third point
     * @return true if area is zero (points are collinear)
     */
    public static boolean isCollinearArea(double x1, double y1,
                                          double x2, double y2,
                                          double x3, double y3) {
        // Calculating area of triangle using determinant formula
        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));
        // Points are collinear if area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        // Testing collinearity using slope method
        System.out.println(isCollinearSlope(2,4,4,6,6,8));
        // Testing collinearity using area method
        System.out.println(isCollinearArea(2,4,4,6,6,8));
    }
}
