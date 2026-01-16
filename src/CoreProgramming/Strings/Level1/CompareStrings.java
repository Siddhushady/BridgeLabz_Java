package CoreProgramming.String.Level1;
import java.util.Scanner;

/**
 * CompareStrings class compares two strings using custom charAt() method and built-in equals() method.
 * The program demonstrates string comparison by creating a custom method that compares strings
 * character by character using charAt(), then comparing it with the built-in equals() method.
 * It shows two different approaches to string comparison and verifies they produce the same result.
 */
public class CompareStrings {
    /**
     * Compares two strings character by character using charAt().
     * @param s1 First string
     * @param s2 Second string
     * @return true if strings are equal, false otherwise
     */
    public static boolean compareUsingCharAt( String s1 , String s2 ){
        // Checking if strings have different lengths
        if (s1.length() != s2.length()){
            return false;
        }
        // Loop to compare each character
        for (int i=0;i < s1.length();i++){
            // Returning false if any character differs
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        // Returning true if all characters match
        return true;
    }

    public static void main(String[] args){

        // Declaring string variables
        String s1 , s2;

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter first string
        System.out.print("Enter first string : ");
        // Reading first string from user
        s1 = sc.nextLine();

        // Prompting user to enter second string
        System.out.print("Enter second string : ");
        // Reading second string from user
        s2 = sc.nextLine();

        // Calling custom method to compare strings
        boolean result1 = compareUsingCharAt(s1 , s2);
        // Using built-in method to compare strings
        boolean result2 = s1.equals(s2);

        // Displaying comparison results from both methods
        System.out.println("Using charAt(): " + result1);
        System.out.println("Using equals(): " + result2);
    }
}
