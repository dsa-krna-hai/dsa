package Strings;

public class frogJump {
    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};
        int n = height.length;

        int answer = jump(n - 1, height);
        System.out.println("Minimum cost: " + answer);
    }

    public static int jump(int i, int[] height) {
        // Base case: starting stone has 0 cost
        if (i == 0) return 0;

        // Cost of jumping from previous stone
        int left = jump(i - 1, height) + abs(height[i] - height[i - 1]);

        // Cost of jumping from two steps behind
        int right = 10000000; // a large number to denote infinity
        if (i > 1) {
            right = jump(i - 2, height) + abs(height[i] - height[i - 2]);
        }

        // Return smaller of the two manually
        if (left < right) return left;
        else return right;
    }

    // Custom absolute value function
    public static int abs(int n) {
        if (n < 0) return -n;
        else return n;
    }
    }


