package coreprogramming.programmingelements.level1;

/**
 * Average class calculates the average marks from three subjects (Math, Physics, Chemistry).
 * The program demonstrates basic variable usage and arithmetic operations by storing marks
 * in three subjects, calculating their sum, and then computing the average by dividing
 * the total by the number of subjects.
 */
public class Average {
    public static void main(String[] args){
        // Storing marks in Mathematics
        int math=94;
        // Storing marks in Physics
        int physics=95;
        // Storing marks in Chemistry
        int chemistry=96;
        // Calculating total marks from all three subjects
        int total = math + chemistry + physics;
        // Calculating average by dividing total by number of subjects (3)
        double average= total/3;
        // Displaying the calculated average marks
        System.out.println("Same's average mark in PCM is "+ average);
    }
}
