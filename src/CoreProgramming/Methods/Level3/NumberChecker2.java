package Core_Programming.Methods.Level3;

public class NumberChecker2 {

    public static int[] storeDigits(int n) {
        int[] d = new int[String.valueOf(n).length()];
        for (int i = d.length - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquareDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = storeDigits(number);

        System.out.println("Sum of digits = " + sumDigits(digits));
        System.out.println("Sum of squares = " + sumSquareDigits(digits));
        System.out.println("Harshad Number = " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < freq.length; i++)
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + " Frequency " + freq[i][1]);
    }
}
