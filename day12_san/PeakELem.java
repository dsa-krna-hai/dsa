package com.day12_san;

public class PeakELem {
    //find peak element that is greater than its neighbors
    public static int peak(int[] arr) {
        int s = 0;
        int r = arr.length - 1;

        while (s < r) {
            int mid = (r + s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                r = mid;

            } else {
                s = mid+1;
            }

        }
        return s;
    }

    public static void main(String[] args) {
        int [ ] arr={1,3,2,4,5,6,6};
        int a =peak(arr);
        System.out.println(a);
    }
}

