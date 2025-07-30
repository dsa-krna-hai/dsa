package com.day11_san;

import java.util.Arrays;
import java.util.Random;

public class quickSort {
    //here we use the concept of randomization
    //here we pick a random element form array and call it pivot
    // we segregater elements in array into 2 parts such that left t\part has all the element smaller than pivot and right side has all the element larger than pivot
    //now repeat the process by dividing the array into 2 parts from that pivot and now select pivots for those smaller arays and do the same
    // repeat the process till we have a sorted array
    //its also called partition algo

    public static void quick(int [] arr,int low,int high){

        int s = low;
        int e = high;
        int mid = s+(e-s)/2;
        int p = arr[mid];


        while(s<=e){
            while (arr[s]<p){
                s++;
            }
            while (arr[e]>p){
                e--;
            }
            if (s>=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }
       quick(arr,low,e);
    }
}
