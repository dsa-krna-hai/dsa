package com.day8_san;

import java.util.ArrayList;

public class sorting {
    // arranging data in some perticular permutations
    // find all the permutaion and then selecting the sorted array is worst performing sorting algo as its time complexity is O(n!)


    //selection sort
    //  1) array is divided into 2 parts where one part is perfectly sorted and other half is not sorted
    // 2)the last element of sorted region is less thean or equal to mi element of usorted region
    //3) in every iteration we will scam the whole usorted region and get the index of min element
    // 4) now we will place this min element att the 0 index
    //5) now we have a sorted array at zero index and rest is unsorted
    //6) now repeat this to find first elemeent by usingg the unsorted array


    public static void main(String[] args) {
        int [] arr={1,5,6,7,4,2,3,4,5,6,7,7};
        selectsort(arr);
        for (int a : arr){
            System.out.println(a);
        }

    }


        public static int min(int [] arr) {
            int minn = 0;
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] < arr[minn]) {
                    minn = j;


                }

            }
            return minn;

        }
        public static void selectsort(int [] arr){
            for (int i = 0; i < arr.length; i++) {
                int minind = min(arr);
                if (i!=minind){
                    int temp =arr[minind];
                    arr[minind]=arr[i];
                    arr[i]=temp;
                }

            }
        }

}

