package CoreProgramming.String.Level2;

import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String result = checkChar(text.charAt(i));

            if (result.equals("Vowel")) vowels++;
            if (result.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        int[] result = countVowelsAndConsonants(text);

        System.out.println("Vowels : " + result[0]);
        System.out.println("Consonants : " + result[1]);
    }
}
