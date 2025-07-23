package Strings;

public class AliceBob {
    // take one digit at a time -> print corresponding alphabet
    // make pairs, check<=26 -> if true, print
    public static void main(String[] args) {
        String input = "1234";
        decode(input, "");
    }

    // Recursive function to decode the string
    public static void decode(String input, String output) {
        // Base Case: If input is empty, print the result
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        // Single digit
        char ch1 = input.charAt(0);
        if (ch1 != '0') {  // '0' has no valid mapping
            int num1 = ch1 - '0';  // convert char to int
            char letter1 = (char) ('A' + num1 - 1);
            decode(input.substring(1), output + letter1);
        }

        // Two digits
        if (input.length() >= 2) {
            String ch2 = input.substring(0, 2);
            int num2 = Integer.parseInt(ch2);
            if (num2 >= 10 && num2 <= 26) {
                char letter2 = (char) ('A' + num2 - 1);
                decode(input.substring(2), output + letter2);
            }
        }
    }
}
