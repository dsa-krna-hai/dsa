package com.day12_san.searching;
//here we take a sorted array
//here we divide the array until we found the target
//her we take 3 variable  start end mid
//in sorted array if target is greater than the elemet at mid index than we the start becomes mid and end remains the lenght of array
//if target is less than the mid element than the end becomes mid+1 and start remains 0
// so here after doing this constantly we will at the find the target elemnts index
//here time complexity of
//best case = 1
//worst case = logn (as here logn are the no. of times the divide of arry will take place)


public class binarySearch {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,7,8};
        int ans = binarySearchMethod(arr,6);
        System.out.println(ans);
    }
    public static int binarySearchMethod(int [] arr , int target){

        int start = 0;
        int end = arr.length-1;

//        if (arr.length % 2 == 0){
//            mid = arr.length/2;
//
//        }
//        else {
//            mid = (arr.length/2)+1;
//
//        }
        while(start<=end){
            int mid = (start+end )/2;
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;

            }
            else{
                return mid;
            }

        }


        return arr[start];
    }
}
