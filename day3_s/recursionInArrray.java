package com.day3_s;

public class recursionInArrray {
    //to read a array we have to apply a lo0op
    //using recursion we can bypass the loop

    public static void readArr(int[] arr,int ind){
        if (ind>=arr.length){
            return;
        }
        System.out.println(arr[ind]);
        readArr(arr,ind+1);
    }
    public static int  maxelem(int[] arr,int a){

        int b = 0;
         if (a>=arr.length){
             return b;
         } else if (arr[a]>=b) {
             b=arr[a];

         }

         maxelem(arr,a+1);
         return b;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
//        readArr(arr,4 );
        int aa = maxelem(arr,0);
        System.out.println(aa);
    }
}
