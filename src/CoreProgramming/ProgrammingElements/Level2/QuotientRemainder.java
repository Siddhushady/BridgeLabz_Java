package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int firstNum=sc.nextInt();
        int secondNum=sc.nextInt();

        int divResult=firstNum/secondNum;
        int modResult=firstNum%secondNum;

        System.out.println("The Quotient is "+divResult+" and Reminder is "+modResult+" of two number "+firstNum+" and "+secondNum);
    }
}
