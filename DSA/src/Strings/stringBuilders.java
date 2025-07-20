package Strings;

import java.util.ArrayList;

public class stringBuilders {
    public static void main(String[] args) {
        // string operations
        // IMMUTABILITY
        // In java, strings are immutable i.e. we can't change the value of the string once declared
        ArrayList<String> languages = new ArrayList<>();

        String first = "Java";
         String second = "Python";
         String third = "java";
//        languages.add("JavaScript");
//        System.out.println(languages);
//        String str = languages.get(1);
//        System.out.println(str);

        // adding
        String concat= first.concat(second);
        System.out.println(concat);

        // compare 2 strings
        boolean compare= first.equals(third);
        System.out.println(compare);
        boolean compare2 = (first == third);
        System.out.println(compare2);

        String a = new String("Hello123");
        String b = new String("Hello123");
        boolean c = (a==b);
        System.out.println(c);
        boolean d = a.equals(b);
        System.out.println(d);
        char ch = a.charAt(4);
        System.out.println(ch);
        System.out.println(a.substring(1,4));
        System.out.println(a.lastIndexOf('1'));
        System.out.println(a.startsWith("He")); // output= true/false

        // STRING BUILDERS -> mutable set of characters
        String str = new String ("Ananya");
        StringBuilder ab = new StringBuilder(str);
        System.out.println(ab.append("Sharma"));

        // insert
        //setCharAt
        //convert back to string using -> toString()

    }
}
