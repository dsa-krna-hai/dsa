package Strings;

public class pp2 {
    /*
     Consider aboard of size 2*N (rows* columns) and tiles of size 2*1
     You have to count the no. of ways in Which tiling of this board is possible.
     You may place the tile vertically/horizontally
     */
    public static int f(int n) {
        // Base cases
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;

        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways = " + f(n)); // Output: 10
    }



}
