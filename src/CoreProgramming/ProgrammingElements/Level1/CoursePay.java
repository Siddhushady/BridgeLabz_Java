package CoreProgramming.ProgrammingElements.Level1;

/**
 * CoursePay class calculates discount and final fee for a course.
 * The program demonstrates basic variable usage and arithmetic operations by calculating
 * discount amount based on a percentage, and then computing the final fee after applying
 * the discount. It displays both the discount amount and the final discounted fee.
 */
public class CoursePay {
    public static void main(String[] args){
        // Storing the original fee amount
        double feeAmt=125000;
        // Storing the discount percentage
        double cut=10;
        // Calculating discount amount: fee * percentage / 100
        double off=feeAmt*cut/100;
        // Calculating final fee after discount: original fee - discount
        double pay=feeAmt-off;
        // Displaying discount amount and final discounted fee
        System.out.println("The discount amount is INR "+off+" and final discounted fee is INR "+pay);
    }
}
