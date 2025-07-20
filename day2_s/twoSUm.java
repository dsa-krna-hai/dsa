package com.day2_s;

public class twoSUm {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,6};
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >0 ; j--) {
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+arr[j]);
                }

            }
            
        }
    }
    
}
