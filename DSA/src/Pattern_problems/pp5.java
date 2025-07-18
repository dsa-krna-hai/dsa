package Pattern_problems;

public class pp5 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i <= n ? i : 2 * n - i;
            int spaces = n - stars;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * stars - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
