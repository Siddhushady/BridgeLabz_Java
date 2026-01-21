package coreprogramming.String.Level2;

import java.util.Scanner;

/**
 * TrimSpaces class trims leading and trailing spaces from a string using custom methods.
 * The program demonstrates string manipulation by creating methods to find trim indexes
 * (start and end positions after removing spaces), create substring using charAt(),
 * and compare strings. It shows how to manually implement trim functionality.
 */
public class TrimSpaces {

    /**
     * Finds the start and end indexes after trimming leading and trailing spaces.
     * @param text Input string
     * @return Array containing [start index, end index] after trimming
     */
    public static int[] findTrimIndexes(String text) {

        // Initializing start index to beginning of string
        int start = 0;
        // Initializing end index to last character of string
        int end = text.length() - 1;

        // Loop to skip leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            // Moving start index forward
            start++;
        }

        // Loop to skip trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            // Moving end index backward
            end--;
        }

        // Returning array with start index and end+1 (for substring end parameter)
        return new int[]{start, end + 1};
    }

    /**
     * Creates a substring using charAt() method.
     * @param text Input string
     * @param start Start index (inclusive)
     * @param end End index (exclusive)
     * @return Substring from start to end-1
     */
    public static String createSubstring(String text, int start, int end) {
        // Initializing result string
        String result = "";
        // Loop to extract characters from start to end-1
        for (int i = start; i < end; i++) {
            // Appending character at index i to result
            result += text.charAt(i);
        }
        // Returning the created substring
        return result;
    }

    /**
     * Compares two strings character by character using charAt().
     * @param s1 First string
     * @param s2 Second string
     * @return true if strings are equal, false otherwise
     */
    public static boolean compareStrings(String s1, String s2) {
        // Checking if strings have different lengths
        if (s1.length() != s2.length()) return false;

        // Loop to compare each character
        for (int i = 0; i < s1.length(); i++) {
            // Returning false if any character differs
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        // Returning true if all characters match
        return true;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
    }
}