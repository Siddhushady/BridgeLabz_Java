package CoreProgramming.String.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate exception
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value : ");
        String text = sc.nextLine();

        // generateException(text);
        handleException(text);
    }
}
