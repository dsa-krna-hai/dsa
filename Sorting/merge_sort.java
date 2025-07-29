package Sorting;

public class merge_sort {
    // f(arr, start, end)= f(arr, start, mid) => f(arr,mid+1,end) => merge (Arr,start,mid,end)
    // try writing it again**
    // in place -> NO
    public static void main(String[] args) {
        int[] arr={4,2,7,11,2,-3,6,8,0,2};
        mergesort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
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
