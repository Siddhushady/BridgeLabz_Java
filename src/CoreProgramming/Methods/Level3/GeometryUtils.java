package Core_Programming.Methods.Level3;

public class GeometryUtils {

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 4, x2 = 6, y2 = 8;

        System.out.println("Distance: " + findDistance(x1, y1, x2, y2));

        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
    }
}
