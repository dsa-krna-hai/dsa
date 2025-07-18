package Arrays;
import java.util.ArrayList;
public class intersection_of_arrays {
    public static void main (String[] args) {
        int[] arr1 = {10, 20, 30, 30, 40, 50, 50, 60};
        int[] arr2 = {20, 40, 40, 60, 70};
        System.out.println(intersection(arr1, arr2));
    }
        public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
             ArrayList<Integer> ans = new ArrayList<>();
             int i=0;
             int j=0;
             while (i<arr1.length && j<arr2.length){
                 if (arr1[1]<arr2[j]){
                     i++;
                 }else if(arr1[i]> arr2[j]){
                     j++;
                 }else{
                     ans.add(arr1[i]);
                     i++;
                     j++;
                 }
             }
             return ans;

        }
    }

