package com.day10_san;

public class insertionSort    {
    public static void insertion(int [] arr){
        for (int i = 1; i < arr.length-1 ; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }arr[j+1]=curr;

        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,1,2,3,4,5};
        insertion(arr);
        for (int a : arr){
            System.out.println(a);
        }

        //prop of INSERTION sort
        //space comp is O(1)
        //Time comp - O(n^2)
        //if array is alrready or almoost sorted like only one elementy is unsorted thus Time  compl is O(n)
        //its a inplace and stable sort
        
    }
}
