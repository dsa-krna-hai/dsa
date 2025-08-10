package com.day12_san;
//leniear search when we iterate to each value of array and check which index does the target resides
//time complexity is O(n)


public class BinarySearch {

    //to search element required index to find its index

    public static int binarySearch(int [] arr,int tar){
        int s = 0;
        int e = arr.length-1;
        while (e>-s){
            int m = s+(e-s)/2;
            if (arr[m]==tar){
                return m;
            }
            if (arr[m]>tar){
                e=m+1;


            }else {
                s=m-1;

            }



        }return -1;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,6};
        System.out.println(binarySearch(arr,3));
    }
}
