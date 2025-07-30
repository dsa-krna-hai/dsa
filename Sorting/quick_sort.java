package Sorting;

public class quick_sort {
    // randomization -> helps in maintaining efficiency
    // we introduce few elements in input via random
    // Divide & conquer

    public static void main (String[] args){
        int[] arr = {1,2,3,9,6,8,5,4,9};
        quicksort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }

    public static void swap(int[] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void partition(int[] arr, int l, int r, int X){
        int pivot =arr[X]; // our pivot element
        swap(arr, X, r); // swapping pivot element with the last one
        int m =l;
        for (int i =l; i<= r-1; i++){
            if(arr[i]< pivot){
                swap(arr,i,m);
                m++;
            }
        }
        swap(arr,m,r);
        return m;
    }

    public static void getRandom(int l , int r){
        return (int)((Math.random() * (r-1) + l));
    }
    public static void f(int[] arr, int l , int r ){
        if(l>r) return;
        int pi = getRandom(l,r);
        int x =partition(arr,l,r,pi);
        f(arr,l,x-1);
        f(arr, x+1,r);


    }
    public static void quicksort(int[] arr){
        f(arr, 0, arr.length-1);
    }
}
