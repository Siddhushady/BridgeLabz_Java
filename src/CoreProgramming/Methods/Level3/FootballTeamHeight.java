package Core_Programming.Methods.Level3;

import java.util.Random;

public class FootballTeamHeight {

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + r.nextInt(101); // 150–250
            System.out.println("Player " + (i + 1) + " Height: " + heights[i]);
        }

        System.out.println("Shortest Height = " + shortestHeight(heights));
        System.out.println("Tallest Height = " + tallestHeight(heights));
        System.out.println("Mean Height = " + meanHeight(heights));
    }
}
