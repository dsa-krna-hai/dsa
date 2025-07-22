package Strings;

public class pp1 {
    /* GIven n friends, each one can remain single or can be paired up with some other friend.
    Each friend can be paired only once. Find out the total no. of ways in which friends can remain single or can be paired up
    ex : n=3 ans =4
    n=1 ans = 1
    n=2 ans = 2
    n=3 ans = 4
    n=4 ans = 10

    */
    public static int f(int n) {
        // Base cases
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;

        // Recurrence relation:
        // 1. Friend stays single => f(n-1)
        // 2. Friend pairs with (n-1) choices => (n-1) * f(n-2)
        return f(n - 1) + (n - 1) * f(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways = " + f(n)); // Output: 10
    }
    }

