package com.day11_san;

public class CountSort {
    //its a non comparision sortring algorithm
    //steps
    //find largest element of arr
    //make a arr of length larget +1
    //here this array will contain the freq array where index no. is element of orginal arr
    //if new arr element value is zero then that index is not present in that array
    public static int[] countingSort(int[] input, int[] output, int k) {
        int counter[] = new int[k + 1];
        for (int i : input) {
            counter[i]++;
        }
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                output[ndx++] = i;
                counter[i]--;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int [ ]a = {1,3,62,62,4,6,8};
        int []b ={};
        System.out.println(countingSort(a,b,0).toString());
    }

    //time complexity is O(n+m) as here we only traversing thorugh 2 array
}


