package Arrays;

public class setMatrixZero {
    // if an element is 0 -> setting elements of the corresponding row and column to 0
    // WORKING FOR SINGLE 0 ONLY !!
    //BRAIN STORM MORE TO GET THE CORRECT ANSWER
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        setZeroes(matrix); // modify matrix in-place

        System.out.println("Modified Matrix:");
        printMatrix(matrix);
    }

    // Method to set matrix zeroes
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Arrays to track which row and column should be zeroed
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Step 1: Identify all cells that are 0 and mark their row & col
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Set entire row to 0 if marked
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set entire column to 0 if marked
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Printing matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
