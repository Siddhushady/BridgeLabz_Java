package CoreProgramming.String.Level1;
import java.util.Scanner;

public class CompareStrings {
    public static boolean compareUsingCharAt( String s1 , String s2 ){
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i=0;i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

        String s1 , s2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        s1 = sc.nextLine();

        System.out.print("Enter second string : ");
        s2 = sc.nextLine();

        boolean result1 = compareUsingCharAt(s1 , s2);
        boolean result2 = s1.equals(s2);

        System.out.println("Using charAt(): " + result1);
        System.out.println("Using equals(): " + result2);



    }
}
