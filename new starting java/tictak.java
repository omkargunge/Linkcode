import java.util.*;

class tictak{
    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Initialize a 3x3 game board with empty spaces
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Player X starts the game
        char currentPlayer = 'X';

        // Counts total moves played
        int moves = 0;

        // Main game loop
        while (true) {

            // ---------------- DISPLAY BOARD ----------------
            System.out.println("\n------- TIC TAC TOE -------");

            for (int i = 0; i < board.length; i++) {
                System.out.println("-------------------------");
                System.out.print((i + 1)); // Display row number

                for (int j = 0; j < board[i].length; j++) {
                    System.out.print("|   " + board[i][j] + " ");
                }

                System.out.println("|");
            }
            System.out.println("-------------------------");

            // ---------------- TAKE INPUT ----------------
            System.out.println("Current Player: " + currentPlayer);

            System.out.print("Enter The Row Number (1-3): ");
            int row = sc.nextInt();

            System.out.print("Enter Column Number (1-3): ");
            int col = sc.nextInt();

            // Validate row and column range
            if (row < 1 || row > 3 || col < 1 || col > 3) {
                System.out.println("Invalid position! Please enter values between 1 and 3.");
                continue;
            }

            // Check if selected cell is already occupied
            if (board[row - 1][col - 1] != ' ') {
                System.out.println("Position already occupied! Try another cell.");
                continue;
            }

            // Place player's symbol on the board
            board[row - 1][col - 1] = currentPlayer;

            // Increase move count
            moves++;

            // ---------------- CHECK WINNER ----------------
            boolean gameWon = false;

            // Check all rows and columns
            for (int i = 0; i < 3; i++) {

                // Check row
                if (board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) {
                    gameWon = true;
                    break;
                }

                // Check column
                if (board[0][i] == currentPlayer &&
                    board[1][i] == currentPlayer &&
                    board[2][i] == currentPlayer) {
                    gameWon = true;
                    break;
                }
            }

            // Check primary diagonal
            if (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) {
                gameWon = true;
            }

            // Check secondary diagonal
            if (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer) {
                gameWon = true;
            }

            // If current player wins, display final board and exit
            if (gameWon) {

                System.out.println("\n------- FINAL BOARD -------");

                for (int i = 0; i < board.length; i++) {
                    System.out.print((i + 1));

                    for (int j = 0; j < board[i].length; j++) {
                        System.out.print("|   " + board[i][j] + " ");
                    }

                    System.out.println("|");
                }

                System.out.println("-------------------------");
                System.out.println("🎉 Player " + currentPlayer + " Wins!");
                break;
            }

            // ---------------- CHECK DRAW ----------------
            if (moves == 9) {
                System.out.println("Game Draw! No winner.");
                break;
            }

            // ---------------- SWITCH PLAYER ----------------
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        // Close scanner to prevent resource leak
        sc.close();
    }
}




