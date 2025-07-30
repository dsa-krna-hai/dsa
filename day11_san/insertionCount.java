package com.day11_san;

public class insertionCount {
     // invirsion pair is - when a[i] > a[j] but i<j

   //by brute force
    public static void inversion(int [] arr,int k){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i]>arr[j] && i<j){
                    k++;
                }

            }

        }
        System.out.println(k);
    }

    //by divide and conquor

    public static void main(String[] args) {
        int [ ]arr = {1,2,3,10,5};
        inversion(arr,0);
    }
}
