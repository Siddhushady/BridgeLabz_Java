package CoreProgramming.String.Level2;

import java.util.Scanner;

public class SplitTextCompare {

    // Find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Split text using charAt()
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        String[] customSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Are both same: " +
                compareArrays(customSplit, builtInSplit));
    }
}
