package Arrays;

public class matrixMulti {
    public static void main(String[] args) {
        // Input matrices (hardcoded for simplicity)
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };  // 2x3 matrix

        int[][] mat2 = {
                {1, 4},
                {2, 5},
                {3, 6}
        };  // 3x2 matrix

        // Number of rows and columns
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int r2 = mat2.length;
        int c2 = mat2[0].length;

        // checking Matrix multiplication condition: columns of mat1 == rows of mat2
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        // Resultant matrix will be of size r1 x c2
        int[][] result = new int[r1][c2];

        // Matrix multiplication logic
        // Multiply row of mat1 with column of mat2
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Output
        System.out.println("Matrix 1:");
        printMatrix(mat1);
        System.out.println("\nMatrix 2:");
        printMatrix(mat2);
        System.out.println("\nProduct of Matrix 1 and Matrix 2:");
        printMatrix(result);
    }

    // Utility method to print any matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
