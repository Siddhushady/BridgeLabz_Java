package coreprogramming.programmingelements.level1;

/**
 * AgeCalculator class calculates a person's age based on birth year and current year.
 * The program demonstrates basic variable usage and arithmetic operations by calculating
 * age as the difference between current year and birth year. It displays the calculated age.
 */
public class AgeCalculator {
    public static void main(String[] args){
        // Storing birth year
        int year=2000;
        // Storing current year
        int currentYear=2024;
        // Calculating and displaying age (current year - birth year)
        System.out.println("Harry's age in 2024 is "+( currentYear-year));
    }
}
