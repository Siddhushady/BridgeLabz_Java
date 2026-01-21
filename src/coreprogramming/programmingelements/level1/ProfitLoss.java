package coreprogramming.programmingelements.level1;

/**
 * ProfitLoss class calculates profit and profit percentage from cost and selling prices.
 * The program demonstrates basic variable usage and arithmetic operations by calculating
 * profit as the difference between selling price and cost price, then computing profit
 * percentage as (profit/cost price) * 100. It displays cost price, selling price, and profit percentage.
 */
public class ProfitLoss {
    public static void main(String[] args){
        // Storing the cost price
        int costPrice=129;
        // Storing the selling price
        int sellingPrice=191;
        // Calculating profit: selling price - cost price
        int profit=sellingPrice-costPrice;
        // Calculating profit percentage: (profit / cost price) * 100
        // Using (double) cast to ensure floating-point division
        double profitPercent=profit/(double)costPrice*100;
        // Displaying cost price, selling price, and profit percentage
        System.out.println("The cost price is INR "+ costPrice+" and selling price is INR "+ sellingPrice+"\nThe Profit Percentage is "+ profitPercent );
    }
}
