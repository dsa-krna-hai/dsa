package com.day9_san;

public class bubbleSort {
    //buuble sort
    //in every iteration swap the max element ot its correct postion
    //here we take first 2 elements checks which one is bigger and swap the bigger one and keep doing this till the max elemetn reached to last element position


    //BENIFIts of bubble sorted
    //we can check whether the arr is sorted as here we check swap condition if this condition is always fales the we know its sorted
    //best case O(n)
    //worst case O(n^2)
    //average case O(n^2)
    //if array is already sorted then its very effective as its now a best case
    //bubble sort is stable sort as here we keep in mind the previous array swapping based on some other condition

    public static void bubble(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }
    public static int KthlargestElement(int [] arr,int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }return arr[k] ;
    }

    public static void main(String[] args) {
        int []arr = {1,2,34,5,223,6,62,52};
        bubble(arr);
        for (int a : arr){
            System.out.println(a);
        }
        System.out.println(KthlargestElement(arr,3));
    }
}
