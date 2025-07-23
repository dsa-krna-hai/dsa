package Strings;
import java.util.Scanner;
public class coins {
    public static void main(String[] args) {
        int[] coins = {1, 2, 4}; // Mention the coins array
        int x = 11;              // Target sum
        int ans = minCoins(coins, x);
        System.out.println(ans == -1 ? -1 : ans);
    }

    public static int minCoins(int[] coins, int x) {
        if (x == 0) return 0;
        if (x < 0) return -1;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int subAns = minCoins(coins, x - coins[i]);
            if (subAns != -1) {
                min = Math.min(min, subAns + 1);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
