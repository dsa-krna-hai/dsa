package Strings;

public class printingRecursively {
    /*
    Given a string of alphabets, write a function that prints a new string which has
    all characters except "x"
    ex : abcxcbxaaax
    ouput: abccbaaa
     */
    public static void f(String str, int idx, String output){
        if(idx >= str.length()){
            System.out.println(output);
            return;
        }
        if(str.charAt(idx) != 'x'){
            f(str, idx+1, output + str.charAt(idx));

        }else {
            f(str, idx+1, output);
        }
    }

    public static void main(String[] args) {
        f("abcxcbxaaax", 0, "");
    }
}
