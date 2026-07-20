// import java.util.*;
// public class tictactoe{
//     public static void main(String[] args) {
//         //board declare
//         Scanner sc=new Scanner(System.in);
//         char board[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
//         char currentPlayer='X';
//         boolean flag=true;
//         int moves=0;

//         while (flag){

//             //1.print the board
//             System.out.println("-----tic-tac-toe-----");

//             for(int i=0;i<board.length;i++){
//                 System.out.println("----------------");

//                 System.out.println((i+1));
//                 for(int j=0;j<board.length;j++){
//                     System.out.println("| "+board[i][j]);
//                 }
//                 System.out.println("|");
//             }
//             System.out.println("-----------------");

//             //2.take values from user
//             System.out.println("Current player  "+currentPlayer+" is playing...");
//             System.out.println("enter row number(1-3):");

//             int row=sc.nextInt();

//             if(row<1||row>3){
//                 System.out.println("invalid row number!");
//                 continue;
//             }
//              System.out.println("enter col number(1-3):");

//             int col=sc.nextInt();

//             if(col<1||col>3){
//                 System.out.println("invalid col number!");
//                 continue;
//         }
//         if(board[row-1][col-1]!=' '){
//             System.out.println("Position already occupied!");
//             continue;
//         }

//         board[row-1][col-1]=currentPlayer;
//         moves++;

//         //win conditions

//         for(int i=0;i<board.length;i++){
//             if((board[i][0]==currentPlayer&&board[i][1]==currentPlayer&&board[i][2]==currentPlayer)||
//             (board[0][i]==currentPlayer&&board[1][i]==currentPlayer&&board[2][i]==currentPlayer)){
//                 System.out.println("player "+currentPlayer+" wins");

//                 flag=false;
//                 break;
//             }
//         }
//         if(moves==9){
//             System.out.println("its Draw!");
//             break;
//         }

//        // 3.switch the player
//        currentPlayer=(currentPlayer=='X')?'O':'X';

//     }
// }

import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Initialize a 3x3 Tic-Tac-Toe board with empty spaces
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Player X starts the game
        char currentPlayer = 'X';

        // Variable to check whether the game has ended
        boolean gameOver = false;

        // Counts the total number of moves played
        int moves = 0;

        // Main game loop
        while (!gameOver) {

            // ------------------ Display the Board ------------------
            System.out.println("\n----- TIC-TAC-TOE -----");

            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + board[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");

            // ------------------ Take Player Input ------------------
            System.out.println("Player " + currentPlayer + "'s Turn");

            // Read row number
            System.out.print("Enter row (1-3): ");
            int row = sc.nextInt();

            // Validate row input
            if (row < 1 || row > 3) {
                System.out.println("Invalid row! Please enter a value between 1 and 3.");
                continue;
            }

            // Read column number
            System.out.print("Enter column (1-3): ");
            int col = sc.nextInt();

            // Validate column input
            if (col < 1 || col > 3) {
                System.out.println("Invalid column! Please enter a value between 1 and 3.");
                continue;
            }

            // Check if the selected cell is already occupied
            if (board[row - 1][col - 1] != ' ') {
                System.out.println("This position is already occupied. Try another one.");
                continue;
            }

            // ------------------ Place Player's Symbol ------------------
            board[row - 1][col - 1] = currentPlayer;

            // Increase move count
            moves++;

            // Variable to store whether the current player has won
            boolean win = false;

            // ------------------ Check Rows and Columns ------------------
            for (int i = 0; i < 3; i++) {

                // Check all rows
                if (board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) {
                    win = true;
                }

                // Check all columns
                if (board[0][i] == currentPlayer &&
                    board[1][i] == currentPlayer &&
                    board[2][i] == currentPlayer) {
                    win = true;
                }
            }

            // ------------------ Check Diagonals ------------------

            // Main diagonal
            if (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) {
                win = true;
            }

            // Secondary diagonal
            if (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer) {
                win = true;
            }

            // ------------------ Check for Winner ------------------
            if (win) {

                // Display the final board
                System.out.println("\n----- FINAL BOARD -----");

                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------");
                    for (int j = 0; j < 3; j++) {
                        System.out.print("| " + board[i][j] + " ");
                    }
                    System.out.println("|");
                }
                System.out.println("-------------");

                // Announce the winner
                System.out.println("Congratulations! Player " + currentPlayer + " wins!");

                // End the game
                gameOver = true;
            }

            // ------------------ Check for Draw ------------------
            else if (moves == 9) {

                // Display the final board
                System.out.println("\n----- FINAL BOARD -----");

                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------");
                    for (int j = 0; j < 3; j++) {
                        System.out.print("| " + board[i][j] + " ");
                    }
                    System.out.println("|");
                }
                System.out.println("-------------");

                // Announce draw
                System.out.println("The game is a Draw!");

                // End the game
                gameOver = true;
            }

            // ------------------ Switch Player ------------------
            else {
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }
        }

        // Close the Scanner object
        sc.close();
    }
}