package com.day8_san;

public class stringRecurrsion {
    public static void main(String[] args) {
        String s = "sanyog";
        subString("",s);
        System.out.println(skip("sssapp sdfsdf app"));

    }
    public static void subString(String s,String us){
        if (us.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = us.charAt(0);
        subString(s+ch,us.substring(1));
        subString(s,us.substring(1));

    }
    public static String skip(String us) {
        if (us.isEmpty()) {

            return "";
        }
        if (us.startsWith("app")) {
            return skip(us.substring(3));
        }else {
            return us.charAt(0) + us.substring(1);
         }

    }


}
