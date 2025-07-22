package com.day3_s;

public class patternRecur {
    public static void str(int n,int totals){
        if (n<=0){
            return;
        }
        printst(totals);
        str(n-1,totals);

    }

    private static void printst(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");



        }
        System.out.println();
    }

    public static void main(String[] args) {
        str(4,4);
    }
}
