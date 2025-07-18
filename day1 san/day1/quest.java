package com.day1;

import java.util.ArrayList;

public class quest {
    //right angle triangle
    public static void main(String[] args) {
//        for(int i=1;i<4;i++){
//            for (int j = 0; j < i; j++) {
//                System.out.print('*');
//
//
//            }
//            System.out.println("");
//        }

        //reverse array
//
//        int arr[]={1,2,3,4,5};
//        for (int i = 0; i < arr.length-1; i++) {
//            System.out.print(arr[i]);
//            System.out.println();
//            int temp=arr[i];
//            arr[i]=arr[arr.length-i];
//            arr[arr.length-i]=temp;
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

//        //quest min element
//        int arr[]={1,2,3,4,5};
//        int min = arr[3];
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i]<min){
//                min=arr[i];
//
//            }
//
//        }
//        System.out.println(min);


//// quest rotating array at axis of k
//        int arr[]={1,2,3,4,5};
//        int k = 1;

//// quest  intersection of array
//        int arr[]={1,2,3,4,5};
//        int arr2[]={1,2,3,7,5};
//        ArrayList<Integer>ab=new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr[i]==arr2[j]){
//                    ab.add(arr[i]);
//                }
//
//            }
//
//        }
//       for(int i:ab){
//           System.out.println(i);
//       }

        //adding 2 array
//        int arr[]={1,2,3,4,5};
//        int arr2[]={1,2,3,4,5};
//
//        ArrayList<Integer> sum = new ArrayList<>();
//        int carry = 0;
//        int i = arr.length;
//        int j = arr2.length;
//
//        while (i>=0 || j>=0 ){
//
//            int summ = carry+arr[1]+arr[2];
//            carry=summ/10;
//            int remain = summ%10;
//            sum.add(0,remain);
//            i--;
//            j--;
//
//
//
//
//
//        }
//        if (carry!=0){
//            sum.add(0,carry);
//        }
//        for (int item :sum){
//            System.out.println(item);
//        }

        //quest running sum of array
//        int arr[]={1,2,3,4,5};
//        int sum = 0;
//        ArrayList<Integer> A = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            A.add(sum);
//
//        }
//        for(int item : A){
//            System.out.println(item);
//        }



//quest print wavy array
        int arr[][]={{1,2,35,4,5},{1,34,3,4,5},{1,2,3,4,5}};
        for (int i = 0; i < arr[0].length; i++) {
           if (i%2==0){
               for (int j = 0; j < arr.length; j++) {
                   System.out.println(arr[j][i]);

               }
           }else{
               for (int j = 0; j < arr.length; j++) {
                   System.out.println(arr[j][i]);

               }
           }

        }


    }
}


