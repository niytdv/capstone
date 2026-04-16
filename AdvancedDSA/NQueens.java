public class NQueens {

    static int N = 4;

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        if (solve(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }

    // Backtracking function
    static boolean solve(int[][] board, int row) {

        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1; // place queen

                if (solve(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    // Check if safe to place queen
    static boolean isSafe(int[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Print board
    static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}