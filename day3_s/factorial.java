package com.day3_s;

public class factorial {
    //here we use comcept of recuuresion where we pass the task to others that form chain to find that task smaller sub problems
    //n! = N(N-1)
    //
    // (n-1)!= (n-1)(n-2)!
      public static int f(int n){
            if (n==1){
                  return 1;
            }
            return n*f(n-1);
      }
      //recursive funciton for a^b

    public static int p(int a ,int b){
          if (b==1){
              return a;

          }return a*p(a,b-1);
    }
    public static void nn(int n){

            if (n==0){
                return;

            }
        nn(n-1);
            System.out.println(n);





    }
    public static int fib(int n ){
          if (n==0){
              return 0;

          } else if (n==1) {
              return 1;

          }

          return fib(n-2)+fib(n-1);
    }


      public static void main(String[] args) {
            int a=p(2,3);
            int b = f(4);
            nn(4);
          System.out.println(b );
            System.out.println(a);
          for (int i = 0; i < 5; i++) {
              int c= fib(i
              );
              System.out.println( c);

          }
      }
}
