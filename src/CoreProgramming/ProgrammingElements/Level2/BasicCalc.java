package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double firstVal=sc.nextDouble();
        double secondVal=sc.nextDouble();
        double sumAns=firstVal+secondVal;
        double substractionAns=firstVal-secondVal;
        double prodAns=firstVal*secondVal;
        double divAns=firstVal/secondVal;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+firstVal+" and "+secondVal+" is "+sumAns+", "+substractionAns+", "+prodAns+", and "+divAns);
    }
}
