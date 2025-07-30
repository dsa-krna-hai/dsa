package Sorting;
import java.util.Scanner;
public class inversion_count {
    public static int count =0; //making a global variable
    // INVERSION PAIR
//    if (a[i], a[j])
    //CONDn = i<j and a[i]  > a[j]

    //brute force technique : make all pairs and then filter out the inversion pairs

    // whole code of MERGE SORT
    public static void main(String[] args) {
        // input no. of test cases
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while (a>0){
            a--;
            count =0;
            int n = input.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n; i++) arr[i] = input.nextInt();
            mergesort(arr);

        }


        }
    }
    public static void mergesort(int [] arr){
        f(arr, 0,arr.length-1);
    }
    public static void merge2SortedArrays(int[] arr, int start, int mid, int end){
        int[] left = new int[mid - start +1];
        int[] right = new int[end-mid];
        int k=0;
        for(int i =start; i<= mid; i++){
            left [k++] = arr[i];
        }
        k=0; // NO NEED TO MENTION "INT" AGAIN
        for(int i =start; i<= mid; i++){
            right [k++] = arr[i];
        }
        int[] result = merge2SortedArrays(left, right);
        k=0;
        for(int i= start; i<= end; i++){
            arr[i]  = result[k++];
        }
    }
    public static void f(int[] arr, int start,int  end ){
        if(end> start) return;
        int mid = (start + end)/2;
        f(arr,start, mid);
        f(arr,mid+1, end);
        merge2SortedArrays(arr, start, mid, end);
    }
}
