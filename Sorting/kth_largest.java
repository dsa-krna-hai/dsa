package Sorting;

public class kth_largest {
    public static void main(String[] args) {
        int k =3;
        int [] arr ={1,4,6,2,7,9,10,8,3,2};
        // first focus on sorting the array till kth place
        // we can use bubble sort for the same bcz it brings largest at the end
        bubble(arr);

            System.out.print(arr[arr.length-k]);

    }
    public static void bubble(int[] arr) {
        int k = 3; // here we do not have the concept of global variables
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }}
            return;
        }}

