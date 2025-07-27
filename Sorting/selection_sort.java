package Sorting;

public class selection_sort {
    // Sorting = arranging data into particular permutation
    // worst sorting approach ->
    // brute force -> make all the permutations/ order.. and then analyze the best out of them -> O(n!)
    public static void main(String[] args) {
        int[] a = {15, -1, 3, 8, 2, 6};
        // array is divided into 2 parts
        // where 1st half -> sorted(assume)
        // 2nd half -> randomly organized
        selectionsort(a);
        for ( int i =0; i<a.length; i++){
            System.out.println(a[i]+ " ");
        }
    }
        public static int getMinIdx(int[] arr, int start){
            int minIdx = start;
            for (int i = start +1; i<arr.length; i++){
                if (arr[i] < arr[minIdx]){
                    minIdx = i;
                }
            }
            return minIdx;
        }
        public static void selectionsort(int[] arr){
            for (int i =0; i<arr.length; i++){
                int minIdx = getMinIdx (arr,i);
                if (i != minIdx){
                    int temp = arr[minIdx];
                    arr[minIdx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


