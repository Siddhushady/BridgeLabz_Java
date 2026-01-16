package Core_Programming.Methods.Level3;

public class NumberChecker1 {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits)
            if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == n;
    }

    public static void findLargestSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    public static void findSmallestSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));
        findLargestSecondLargest(digits);
        findSmallestSecondSmallest(digits);
    }
}
