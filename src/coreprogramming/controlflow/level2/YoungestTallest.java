package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * YoungestTallest class determines the youngest and tallest among three friends.
 * The program reads ages and heights of three friends (Amar, Akbar, Anthony) and
 * compares them to find who is the youngest (lowest age) and who is the tallest
 * (highest height). It displays the results for both categories.
 */
public class YoungestTallest {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading ages of the three friends
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        // Reading heights of the three friends
        int heightAmar = input.nextInt();
        int heightAkbar = input.nextInt();
        int heightAnthony = input.nextInt();

        // Comparing ages to find the youngest friend
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony)
            System.out.println("Amar is the youngest");
        else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        // Comparing heights to find the tallest friend
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony)
            System.out.println("Amar is the tallest");
        else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}
