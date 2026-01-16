package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double feetValue=sc.nextDouble();
        double yardsVal=feetValue/3;
        double milesVal=yardsVal/1760;
        System.out.println("The distance in yards is "+yardsVal+" while the distance in miles is "+milesVal);
    }
}
