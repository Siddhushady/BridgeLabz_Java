package CoreProgramming.String.Level1;

import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }


    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Are both arrays equal: " +
                compareArrays(customArray, builtInArray));
    }
}
