package CoreProgramming.ProgrammingElements.Level1;

/**
 * PenShare class distributes pens among kids and calculates remainder.
 * The program demonstrates basic variable usage and arithmetic operations by calculating
 * how many pens each kid gets (quotient) and how many pens remain undistributed
 * (remainder) when dividing total pens by number of kids. This is similar to PensDistribution
 * but uses different variable names.
 */
public class PenShare {
    public static void main(String[] args){
        // Storing total number of pens
        int totalPens=14;
        // Storing number of kids
        int kids=3;
        // Calculating pens per kid using integer division
        int each=totalPens/kids;
        // Calculating remaining pens using modulo operator
        int left=totalPens%kids;
        // Displaying pens per kid and remaining pens
        System.out.println("The Pen Per Student is "+each+" and the remaining pen not distributed is "+left);
    }
}
