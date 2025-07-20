package com.day2_s;

public class ascii_odd {
    public static void main(String[] args) {
        String s = "avmcdsg";
        StringBuilder ss = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = ss.charAt(i);
            if (i%2==0){
                ch=(char)(ch+1);
                ss.setCharAt(i,ch);

            }else {
                ch=(char)(ch+1);
                ss.setCharAt(i,ch);
            }



        }
        s = ss.toString();
        System.out.println(s);
    }
}
