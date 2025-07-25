package TandC;

public class TandC {
    // Arranging the time complexities from worst to best
    // (worst) + (high rate of growth)  n! -> 2^n -> n^3 -> n^2 -> n n^1/2
    // n logn -> n -> n^1/2 -> log n -> c (best) + (slow rate of growth)
    /*
    function f (n){
    let ans = 0;
    for (let i=1; i<n; i *=2){
     ans +=1;
     }
     return ans;
     ) :-> in this case worst case complexity = O(log n)
     pattern 1,2,4,8,16...
     at 1st iteration 2^0
     2nd iteration 2^1
     therefore at k th iteration 2^ k-1
     so we can say 2^k-1 < n
     log(2^k-1) < log (n) taking log on boeth sides
     so, k-1 = log n
     k = log n - 1 -> complexity = O(log n)
     */

    // t&c in RECURSIVE case
    // total instructions = instruction in every fn call x no. of times fn is called
    // CONDITION: instruction in every fn call is constant

    /*
    function f(n){
       if (n==1 || n==2) return n;
       return f(n-1) + f(n-2);
       }
     */
    // imagine it like a tree structure
    // so at first branch -> 2^0 function calls
    // at 2nd branch -> 2^1 function calls
    // at 3rd branch -> 2^2 function calls
    // therefore at nth branch approx 2^ (n-1)
    // hence, on solving this GP, we get 2^n - i.e. O(2^n)

    // POINT TO NOTE
    // in case of iterative it was O(n)
    // which denotes that recursive fibonacci is slower than the iterative
    //}
}
