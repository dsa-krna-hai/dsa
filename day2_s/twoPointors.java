package com.day2_s;

public class twoPointors {
    //the 2 pointors have concept where we set 2 differemt pointers to represent the array elements

    //question
    //remove duplicate array elements
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,5,6,7,7,8};
        int point = 1;
        for (int i = 0; i < args.length; i++) {
            if (arr[i-1]!=arr[i]){
                arr[point]=arr[i];
                point++;


            }



        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
