package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;
public class SquareSideCalc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double perimeter=sc.nextDouble();
        double singleSide=perimeter/4;
        System.out.println("The length of the side is "+singleSide+" whose perimeter is "+perimeter);
    }
}
