package com.day2_s;

public class subStrings {
    public static void main(String[] args) {
        String a = "sanju";
        for (int i = 0; i < a.length()-1; i++) {
            for (int j = a.length()-1; j >0; j--) {
                String ab=a.substring(i,j);
                System.out.println(ab);



            }

        }
    }

}
