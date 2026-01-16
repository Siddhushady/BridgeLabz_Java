package CoreProgramming.String.Level2;

import java.util.Scanner;

public class VotingEligibility {

    // Generate ages array
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 50); // random age
        }
        return ages;
    }

    // Check voting eligibility
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Display table
    public static void display(String[][] table) {
        System.out.println("Age\tStatus");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);

        display(result);
    }
}
