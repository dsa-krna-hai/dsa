package com.day4_s;

public class permutation {
    //if there are 3 elements to be set on 3 space we have 3! ways to do that



        public static void main(String[] args) {
            String str = "ABC";
            boolean[] used = new boolean[str.length()];
            backtrack(str, "", used);
        }

        private static void backtrack(String str, String permutation, boolean[] used) {
            if (permutation.length() == str.length()) {
                System.out.println(permutation);
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                if (used[i]) continue;

                used[i] = true;
                backtrack(str, permutation + str.charAt(i), used);
                used[i] = false; // backtrack
            }
        }
    }


