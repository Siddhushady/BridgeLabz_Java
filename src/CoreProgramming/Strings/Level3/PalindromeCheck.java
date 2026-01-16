package CoreProgramming.String.Level3;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + checkPalindrome(text));
        System.out.println("Logic 2: " + checkPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + text.equals(reverse(text)));
    }
}
