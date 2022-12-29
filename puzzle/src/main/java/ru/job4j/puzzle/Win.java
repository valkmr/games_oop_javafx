package ru.job4j.puzzle;

public class Win {
    public static boolean checkHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1
                   && (checkHorizontal(board, index)) || checkVertical(board, index)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
