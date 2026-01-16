package CoreProgramming.ProgrammingElements.Level1;

public class ProfitLoss {
    public static void main(String[] args){
        int costPrice=129;
        int sellingPrice=191;
        int profit=sellingPrice-costPrice;
        double profitPercent=profit/(double)costPrice*100;
        System.out.println("The cost price is INR "+ costPrice+" and selling price is INR "+ sellingPrice+"\nThe Profit Percentage is "+ profitPercent );
    }
}
