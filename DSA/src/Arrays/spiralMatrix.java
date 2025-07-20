package Arrays;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15,16}
        };

        System.out.println("Spiral Order:");
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        if (matrix.length == 0) return;

        int top = 0;                          // starting row
        int bottom = matrix.length - 1;      // ending row
        int left = 0;                         // starting column
        int right = matrix[0].length - 1;    // ending column

        // Loop until all rows and columns are covered
        while (top <= bottom && left <= right) {

            // Step 1: Print top row → →
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;  // move top boundary down

            // Step 2: Print right column ↓ ↓
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;  // move right boundary left

            // Step 3: Print bottom row ← ← (check if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;  // move bottom boundary up
            }

            // Step 4: Print left column ↑ ↑ (check if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;  // move left boundary right
            }
        }
    }

}
