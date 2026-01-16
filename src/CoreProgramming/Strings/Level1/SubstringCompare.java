package CoreProgramming.String.Level1;

import java.util.Scanner;

public class SubstringCompare {

    // Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }


    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        System.out.print("Enter start index : ");
        int start = sc.nextInt();

        System.out.print("Enter end index : ");
        int end = sc.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both equal: " +
                compareUsingCharAt(customSubstring, builtInSubstring));
    }
}
