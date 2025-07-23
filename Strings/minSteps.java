package Strings;

public class minSteps {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(minSteps(n));
    }

    public static int minSteps(int n) {
        if (n == 1) return 0;

        int steps = minSteps(n - 1); // Try subtracting 1

        if (n % 2 == 0) {
            int temp = minSteps(n / 2); // Try dividing by 2
            if (temp < steps) {
                steps = temp;
            }
        }

        if (n % 3 == 0) {
            int temp = minSteps(n / 3); // Try dividing by 3
            if (temp < steps) {
                steps = temp;
            }
        }

        return 1 + steps; // Add current step
    }
}
