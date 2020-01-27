package backtracking;

public class NQueenProblem {

    static  int N = 8;

    public static void main(String[] args) {


        int board[][] = new int[N][N];

        boolean solveNQueen = solveNQueen(board, 0);



        //printBoard(board);

    }

    private static void printBoard(int[][] board ) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j]);

            }
            System.out.println();
        }

        System.out.println("==============================");

    }

    private static boolean solveNQueen(int[][] board, int col) {
        //then return true */
        if (col == N)
        {
            printBoard(board);

            return true;
        }

    /* Consider this column and try placing
    this queen in all rows one by one */
        boolean res = false;
        for (int i = 0; i < N; i++)
        {
        /* Check if queen can be placed on
        board[i][col] */
            if ( isSafe(board, i, col) )
            {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;

                // Make result true if any placement
                // is possible
                res = solveNQueen(board, col + 1) || res;

            /* If placing queen in board[i][col]
            doesn't lead to a solution, then
            remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

    /* If queen can not be place in any row in
        this column col then return false */
        return res;

    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int i;
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        int j;
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        //* * Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < 4; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }
}
