package Strings;

public class fibonacci {
    // given a number x, calculate teh count of number of binary
    // strings of length x, which has no consecutive one
    // TRY SEARCHING THE PATTERN
    /*
    Ex: n=3 ans= 5  reason: 101, 001, 100, 010, 000
    n=1  ans= 2
    n=2 ans = 3
    n=3 ans = 5
    n=4 ans = 8
    n=5 ans = 13
    therefore, the pattern is following the fibonacci series
     */
    public static int f (int n){
        if (n==2 || n ==3) {
            return n;
        };
        return f(n-1)+ f(n-2);

    }

    public static void main(String[] args) {
        System.out.println(f(4));
    }
}
