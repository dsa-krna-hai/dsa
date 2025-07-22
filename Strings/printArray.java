package Strings;

public class printArray {
    public static void f(int [] arr, int idx){ // prints everything from idx ->n
        //base case
        if(idx >= arr.length) return; // everything is printed
        System.out.println(arr[idx]); //self work
        f(arr, idx+1); // recursive assumption / delegation


    }

    public static void main(String[] args) {
        int [] arr= {31,22,12};
        f(arr, 0); // defining the range
    }
}
