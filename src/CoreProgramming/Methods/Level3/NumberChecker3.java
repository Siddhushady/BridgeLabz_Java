package Core_Programming.Methods.Level3;

public class NumberChecker3 {

    public static int[] storeDigits(int n) {
        int[] d = new int[String.valueOf(n).length()];
        for (int i = d.length - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits)
            if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        int[] digits = storeDigits(number);

        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
