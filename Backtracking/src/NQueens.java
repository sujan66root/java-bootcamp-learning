public class NQueens {
    public static void main(String[] args) {
        int n = 4; // Change this to the desired board size
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        int[] board = new int[n]; // Initialize an array to represent the board
        placeQueens(board, 0, n); // Start placing queens on the board
    }

    public static void placeQueens(int[] board, int row, int n) {
        // Base case: If all queens are placed, print the board configuration
        if (row == n) {
            printBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) { // Check if it's valid to place a queen at this position
                board[row] = col; // Place the queen
                placeQueens(board, row + 1, n); // Recursively place queens in the next row
            }
        }
    }

    // Check if it's valid to place a queen at the given row and column position
    public static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if there is a queen in the same column or diagonals
            if (board[i] == col || Math.abs(row - i) == Math.abs(col - board[i])) {
                return false; // Conflict found, not valid to place a queen here
            }
        }
        return true; // No conflict found, valid to place a queen at this position
    }

    // Print the board configuration with queens represented as 'Q' and empty squares as '.'
    public static void printBoard(int[] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    System.out.print("Q "); // Queen is placed in this square
                } else {
                    System.out.print(". "); // Empty square
                }
            }
            System.out.println(); // Move to the next row
        }
        System.out.println(); // Empty line for better visualization
    }
}
