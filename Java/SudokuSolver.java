public class SudokuSolver {
    public static void printBoard(int[][] board) {
        for (int[] i : board) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkSafety(int row, int col, int[][] solvedBoard, int x) {
        for (int i = 0; i < 9; i++) {
            if (solvedBoard[i][col] == x)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (solvedBoard[row][col] == x)
                return false;
        }
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (solvedBoard[i][j] == x)
                    return false;
            }
        }
        return true;
    }

    public static int findNum(int row, int col, int[][] solvedBoard) {
        for (int i = solvedBoard[row][col] + 1; i < 10; i++) {
            if (checkSafety(row, col, solvedBoard, i))
                return i;
        }
        return 0;
    }

    public static int[][] solve(int row, int col, int[][] board, int[][] solvedBoard) {

        if (board[row][col] == 0) {
            solvedBoard[row][col] = findNum(row, col, solvedBoard);
            if (solvedBoard[row][col] == 0) {
                while (true) {
                    if (col == 0) {
                        col = 8;
                        row--;
                    } else {
                        col--;
                    }
                    if (board[row][col] == 0)
                        break;
                }
                return solve(row, col, board, solvedBoard);
            }
        }
        if (col < 8) {
            solve(row, col + 1, board, solvedBoard);
        } else if (row < 8) {
            solve(row + 1, 0, board, solvedBoard);
        }
        return solvedBoard;
    }

    public static void main(String[] args) {
        int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
        System.out.println("Unsolved Board: \n");
        printBoard(board);
        int[][] solvedBoard = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
        solvedBoard = solve(0, 0, board, solvedBoard);
        System.out.println("\nSolved Board: \n");
        printBoard(board);
    }
}