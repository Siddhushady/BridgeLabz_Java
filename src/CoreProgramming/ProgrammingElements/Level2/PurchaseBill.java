package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;
public class PurchaseBill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double itemRate=sc.nextDouble();
        int itemCount=sc.nextInt();
        double finalCost=itemRate*itemCount;
        System.out.println("The total purchase price is INR "+finalCost+" if the quantity "+itemCount+" and unit price is INR "+itemRate);
    }
}
