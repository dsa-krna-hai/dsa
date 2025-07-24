package com.day5_s;

public class recursion_yt {
    //when function is called
    //whiele the func is called  and being executeds it stays is stack

    //when function fineshes executinf it is removed from of stack and flow of progream reaches back to where the function was called

    //when function calls itself its called recurssion
    //here it passes the different argument and calls itself again untill its task is complited
    //here we have a base codition that stops the function to  call itself again
    //if we call a funtion with different argument it is stored in different memory of stack
    //when the computer memory exedes the function calls it gives stack overflow

    //we can convert to recursion to iteration
    //space complexity  is not constant
    //first the main function is called then the other function and goes on and on
    //tail recursion is the last step to be called


    //steps to solve recursion
    //break the problem in smaller parts
    //write recurrence relation
    //draw the recursive tree
    //learn about the tree that how they are going to call the function

    //types of recurrence relation
    //linear - fibonac
    //divide and conquor - binary search


    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int p(int n) {
        if (n == 1) {
            return 1;
        }
        return n * p(n - 1);
    }

    public static int serch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;

        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > mid) {
            serch(arr, target, mid + 1, e);

        }
        return serch(arr, target, s, mid - 1);

    }
    static void nn(int n){
        if (n==0){
            return ;
        }
        nn(n-1);
        System.out.println(n);

    }
    public static  int summ(int n){
        int sum ;
        if (n==0){
            return 0;
        }sum=n%10;

        return sum+summ(n/10);
    }
    public static void revr(int n ){
        int base = 0;
        if (n==0){
            return ;
        }int rem = n%10;
        base = base *10 +rem;
        revr(n/10);
        System.out.println(base);
    }
    public static int calZero(int n,int c){
        if (n==0){
            return c;
        }
        if (n%2==0){
            return calZero(n/2,c+1);
        }return calZero(n-1,c+1);


    }



     public static void main(String[] args) {
//          System.out.println(fib(3));
//
//         System.out.println(p(4));
//         int [ ] arr = {1,2,3,4,5};
//         System.out.println(serch(arr,2,0,arr.length-1));
//         nn(4);
//         System.out.println(summ(155));
//
//         revr(1245);
         System.out.println(calZero(14,0));
     }
}
