package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        if (checkVertical(board)) return true;
        return checkGorizontal(board);
    }

    public static boolean checkVertical(int[][] board) {
        boolean b = true;
        for (int i = 0; i < board.length; i++) {
            b = true;
            for (int z = 0; z < board[i].length; z++) {
                if (board[i][z] != 1) {
                    b = false;
                }
            }
            if (b) return true;
        }
        return b;
    }

    public static boolean checkGorizontal(int[][] board) {
        boolean b = true;
        for (int i = 0; i < board.length; i++) {
            b = true;
            for (int z = 0; z < board[i].length; z++) {
                if (board[z][i] != 1) {
                    b = false;
                }
            }
            if (b) return true;
        }
        return b;
    }
}
