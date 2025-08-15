public class sudoku_solver {
    public static void main(String[] args) {
        int[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        print(board, 0, 0);
    }

    public static void print(int[][] board, int row, int col) {
        if (row == board.length) {
            Display(board);
            return;
        }
        int nr = 0;
        int nc = 0;
        if (col == board[0].length - 1) {
            nr = row + 1;
            nc = 0;
        } else {
            nr = row;
            nc = col + 1;
        }
        if (board[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isitsafe(board, row, col, i)) {
                    board[row][col] = i;
                    print(board, nr, nc);
                    board[row][col] = 0;
                }
            }
        } else {
            print(board, nr, nc);
        }
    }

    public static boolean isitsafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
