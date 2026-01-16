package CoreProgramming.ProgrammingElements.Level1;

/**
 * PensDistribution class distributes pens among students and calculates remainder.
 * The program demonstrates basic variable usage and arithmetic operations by calculating
 * how many pens each student gets (quotient) and how many pens remain undistributed
 * (remainder) when dividing total pens by number of students.
 */
public class PensDistribution {
    public static void main(String[] args){
        // Storing total number of pens
        int pens=14;
        // Storing number of students
        int students=3;
        // Calculating pens per student using integer division
        int perStudent=pens/students;
        // Calculating remaining pens using modulo operator
        int remaining=pens%students;
        // Displaying pens per student and remaining pens
        System.out.println("The Pen Per Student is "+perStudent+" and the remaining pen not distributed is "+remaining);
    }
}
