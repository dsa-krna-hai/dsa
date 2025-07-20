package com.day2_s;

public class boatSave {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,4,2};
        int limit=3;
        int res=0;
        int r = arr.length-1;
        int l =0;
        while(l<=r){
            if (arr[l]+arr[r]<=limit){
                res++;
                System.out.println(l+""+r);
            }
            r++;
            l--;
            System.out.println(res);


        }
    }
}
