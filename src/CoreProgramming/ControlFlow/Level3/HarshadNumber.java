package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        input.close();
    }
}
