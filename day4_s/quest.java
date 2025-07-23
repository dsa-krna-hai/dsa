package com.day4_s;

public class quest {
    public static void main(String[] args) {
        char[] alphabetArray = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        System.out.println(count(23,0));


    }
//    public static void alice(char arr,int i,String out){
//        StringBuilder str = new StringBuilder();
//        StringBuilder append = str.append(arr[i]);
//        alice(str,i+1,out+ str[i]);
//
//
//
//    }
    static int minCostRec(int n, int[] height) {


        if (n == 1)
            return 0;


        if (n == 2)
            return Math.abs(height[n - 1] - height[n - 2]);

        return Math.min(minCostRec(n - 1, height)
                        + Math.abs(height[n - 1] - height[n - 2]),
                minCostRec(n - 2, height)
                        + Math.abs(height[n - 1] - height[n - 3]));
    }

    static int minCost(int[] height) {
        int n = height.length;
        return minCostRec(n, height);
    }

    //question form n to 1 count step
    public static int count(int n , int c){
        if (n==1){
            return c;
        }
        if (n%3==0){
            return count(n/3,c+1);
        } else if (n%2==0) {
            return count(n/2,c+1);

        }return count(n-1,c+1);
    }

    //question word search
    public class Solution {
        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;

            boolean[][] visited = new boolean[m][n];
            boolean result = false;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        result = barbaadbacktrack(board, word, visited, i, j, 0);
                        if (result) return true;
                    }
                }
            }

            return false;
        }

        private boolean barbaadbacktrack(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
            if (index == word.length()) {
                return true;
            }

            if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
                return false;
            }

            visited[i][j] = true;

            if (barbaadbacktrack(board, word, visited, i + 1, j, index + 1) ||
                    barbaadbacktrack(board, word, visited, i - 1, j, index + 1) ||
                    barbaadbacktrack(board, word, visited, i, j + 1, index + 1) ||
                    barbaadbacktrack(board, word, visited, i, j - 1, index + 1)) {
                return true;
            }

            visited[i][j] = false;
            return false;
        }

        //rat in maze
//        boolean solveMazeUtil(int maze[][], int x, int y,
//                              int sol[][])
//        {
//
//            if (x == N - 1 && y == N - 1) {
//                sol[x][y] = 1;
//                return true;
//            }
//
//
//            if (isSafe(maze, x, y) == true) {
//
//                sol[x][y] = 1;
//
//                if (solveMazeUtil(maze, x + 1, y, sol))
//                    return true;
//
//                if (solveMazeUtil(maze, x, y + 1, sol))
//                    return true;
//
//                sol[x][y] = 0;
//                return false;
//            }
//
//            return false;
//        }



        //n queen dimag kharab ho gya mera yt se smjhung dobara

    }





}
