package CoreProgramming.String.Level2;

import java.util.Scanner;

public class ShortestAndLongestWord {

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

    public static String[] splitUsingCharAt(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
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

    public static int[] findShortestAndLongest(String[] words) {

        int min = findLength(words[0]);
        int max = findLength(words[0]);

        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        int[] result = findShortestAndLongest(words);

        System.out.println("Shortest word length : " + result[0]);
        System.out.println("Longest word length : " + result[1]);
    }
}
