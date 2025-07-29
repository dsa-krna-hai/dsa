package Sorting;

public class insertion_sort {
    // in place -> yess
    // stable -> yess
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,6,8,5,4,9};
        insertion(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void insertion(int[] arr){
        for (int i=1; i<arr.length; i++){
            int currentElement =arr[i];
            int j = i -1;
            while (j>= 0 && arr[j]> currentElement){
                arr[j+1] = arr[j]; // shifting the element // one step position
                j--;
            }
            arr[j+1] =currentElement;
        }
    }
}
