package com.day5_s;

import java.util.ArrayList;

public class recursion_array_yt {
    //q find wheather array is sorted
    public static boolean arrSort(int [] arr,int inx){
        if (inx== arr.length-1){
            return true;
        }if (arr[inx]<arr[inx+1]){
            return arrSort(arr,inx+1);
        }return false;

    }
    //q find elemet of array
    public static int arrFind(int []arr,int x,int targ){
        if (x>arr.length-1){
            return -1;
        };
        if (arr[x]==targ){
            return x;
        }return arrFind(arr,x+1,targ);

    }
    //q find all element postition

    public static ArrayList<Integer>  arrFindall(int []arr,int x,int targ,ArrayList list){
        if (x>arr.length-1){
            return list;
        };
        if (arr[x]==targ){
            list.add(x);
        }return arrFindall(arr,x+1,targ ,list);

    }

    //taking arrayList as an argument here we can return the function call as an arraylist
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int [] arr = {1,2,3,45,5,5,5,6};

        System.out.println(arrSort(arr,0));
        System.out.println(arrFind(arr,0,45));
        System.out.println(arrFindall(arr,0,5,list));
        for (int item:list){
            System.out.println(item);
        }
    }


    //avoid taking arraylist as an argument
    //but each function call will create a new arraylist if we create it inside the body of the array
    //so even if a target is added in array list it will get emptied when next function is called
    //so we can add the data of arraylist called in initial function call to next function call so even if next function call create a new array list the previous outputs are added

    public static ArrayList<Integer>  arrFindallWithoutArgument(int []arr,int x,int targ){
        ArrayList<Integer >  list= new ArrayList<>();
        if (x>arr.length-1){
            return list;
        };
        //this will contain answer for that function only not for next ones
        if (arr[x]==targ){
            list.add(x);
        }
        ArrayList<Integer> coll = arrFindallWithoutArgument(arr,x+1,targ );
        list.addAll(coll);
        return list;

        //this coll list will have target element that are being found inside the each function call
        //this complete coll will be added to list when function stack is being emptied

    }

}
