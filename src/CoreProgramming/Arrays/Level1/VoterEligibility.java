package Core_Programming.Arrays.Level1;

import java.util.Scanner;

public class VoterEligibility {
    static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] age = new int[10];
        System.out.println("Enter age of all 10 students");
        for  (int i = 0; i < age.length; i++) {
            age[i] = scan.nextInt();
        }

        for (int i : age) {
            if (i >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not Eligible to vote");
            }
        }
    }
}
