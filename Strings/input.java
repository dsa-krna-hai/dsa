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
        System.out.println("Enter any no.");
        int a = in.nextInt();
        System.out.println(a);
        System.out.println("Enter anything");
        String b = in.next();
        System.out.println(b);
        System.out.println("Enter anything");
        String c = in.nextLine();
        System.out.println(c);

    }
}
