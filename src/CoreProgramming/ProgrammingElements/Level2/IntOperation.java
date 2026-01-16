package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int firstValue=sc.nextInt();
        int secondValue=sc.nextInt();
        int thirdValue=sc.nextInt();
        int exprResult1=firstValue+secondValue*thirdValue;
        int exprResult2=firstValue*secondValue+thirdValue;
        int exprResult3=thirdValue+firstValue/secondValue;
        int exprResult4=firstValue%secondValue+thirdValue;
        System.out.println("The results of Int Operations are "+exprResult1+", "+exprResult2+", "+exprResult3+", and "+exprResult4);
    }
}
