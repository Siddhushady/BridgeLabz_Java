package Core_Programming.Methods.Level2;

import java.util.Scanner;

public class FriendsCompare {

    public static int findYoungest(int[] age) {
        int min = 0;
        for (int i = 1; i < age.length; i++)
            if (age[i] < age[min]) min = i;
        return min;
    }

    public static int findTallest(double[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++)
            if (height[i] > height[max]) max = i;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        System.out.println(names[findYoungest(age)]);
        System.out.println(names[findTallest(height)]);

        sc.close();
    }
}
