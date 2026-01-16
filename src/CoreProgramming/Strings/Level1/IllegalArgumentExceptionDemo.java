package CoreProgramming.String.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate exception
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String text = sc.nextLine();


        handleException(text);
    }
}
