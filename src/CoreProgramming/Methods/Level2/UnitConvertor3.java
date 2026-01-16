package Core_Programming.Methods.Level2;

import java.util.Scanner;

public class UnitConvertor3 {

    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double p) {
        return p * 0.453592;
    }

    public static double convertKilogramsToPounds(double k) {
        return k * 2.20462;
    }

    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");

        int choice = sc.nextInt();
        double value = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = convertFarhenheitToCelsius(value); break;
            case 2: result = convertCelsiusToFarhenheit(value); break;
            case 3: result = convertPoundsToKilograms(value); break;
            case 4: result = convertKilogramsToPounds(value); break;
            case 5: result = convertGallonsToLiters(value); break;
            case 6: result = convertLitersToGallons(value); break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("Converted Value = " + result);
        sc.close();
    }
}
