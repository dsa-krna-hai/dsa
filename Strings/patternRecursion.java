package Strings;

public class patternRecursion {
    // n=4, print the following pattern using recursion
     // ****
     // ****
     // ****
     // ****

public static void f(int row, int col, int n){
    if(row >n) return; // printing all the rows
    if(col >n) {
        System.out.println(); // going to next line
        f(row +1, 1,n); // all columns of given row are done, moving to next row
        return;
    }
    System.out.print("*");
    f(row, col+1, n);
}

public static void main(String[] args) {
    f(1,1,5);
}}