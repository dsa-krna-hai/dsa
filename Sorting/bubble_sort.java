package Sorting;

public class bubble_sort {
    // has high no. of swaps
    // best case -> omega(n)
    // worst case -> O(n^2)
    // inplace -> yess
    // scalable -> yess
    public static void bubble( int[] arr){
        int n = arr.length;
        for ( int i =0; i<n-1; i++){ // this loop is for no. of times to repeat the process
            boolean isSwap= false;
            //if this remains false it means no swap in the iteration
            for (int j =0; j<n-i-1; j++){
                // this loop is for unsorted part
                if (arr[j]> arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true ;
                }
            }
            if(!isSwap) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,9,6,8,5,4,9};
        bubble(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
