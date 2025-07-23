package Strings;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {


        /* Stack memory -> static
        - function calls
        - primitive data values to a method
        - references to objects

        Heap memory -> dynamic
        - Java objects
        - JRE class

         */
        Scanner in= new Scanner (System.in);
//        System.out.println("Enter any no.");
//        int a = in.nextInt();
//        System.out.println(a);
//        System.out.println("Enter anything");
//        String b = in.next();
//        System.out.println(b);
//        System.out.println("Enter anything");
//        String c = in.nextLine();
//        System.out.println(c);

        // Given 2 integers a & b, write a recursive function to implement a**b
        System.out.println("Enter the vlaue of a: ");
        int a = in.nextInt();
        System.out.println("Enter the vlaue of b: ");
        int b = in.nextInt();
        System.out.println( a + " raised to power  " + b + " equals: " + exp(a,b));


        // code for sum of n natural numbers
        System.out.println("Enter any natural number:");
        int val = in.nextInt();
        System.out.println("The sum of " + val + "natural numbers is:" + natural(val));
        // calculating factorial
        System.out.println("The factorial of " + val + " numbers is:" + fact(val));

    }
    public static int natural( int n){
        if (n <= 0) return 0;
        return n+ natural(n-1);

    }
    public static int fact (int f){
        if(f==0 || f==1) return 1;
        return f* fact(f-1);

    }
    public static int exp(int a,int b){
        if (b==1) return a;
        return a * exp(a, b-1);
    }
    public static void reverse(){

    }
}
