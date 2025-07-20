package com.day2_s;

public class sort01 {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,0,0,1,1,1,1};
        int l=0;
        int r= arr.length-1;
        while(l<=r){
            if (arr[l]==0){
                l++;

            }else {
                int temp= arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}
