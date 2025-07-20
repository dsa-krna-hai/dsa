package Arrays;
import java.util.ArrayList;
public class transposeMatrix {
    public static void main (String[] args){
        int[][] arr= {
                {1, 2, 3},
                {4, 5, 6}
        };
        //  element  at x(,y) in i/p matrix = element at (y,x) in o/p matrix
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        // Printing transpose matrix
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

    }

}}
