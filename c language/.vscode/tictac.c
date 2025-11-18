#include<stdio.h>

int main() {
    char board[3][3] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    char currentplayer = 'X';
    int moves = 0, flag = 1;

    printf("-----Welcome to the Tic Tac Toe game------\n");

    while (flag) {
        // 1. Print the board
        printf("--------------------\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                printf("| %c ", board[i][j]);
            }
            printf("|\n--------------------\n");
        }

        // 2. Ask for player input
        printf("Player %c is playing...\n", currentplayer);
        
        int row, col;

        printf("Enter the row number (1-3): ");
        scanf("%d", &row);

        if (row < 1 || row > 3) {
            printf("Invalid row number....\n");
            continue;
        }

        printf("Enter the column number (1-3): ");
        scanf("%d", &col);

        if (col < 1 || col > 3) {
            printf("Invalid column number....\n");
            continue;
        }

        // 3. Check if the position is already taken
        if (board[row - 1][col - 1] != ' ') {
            printf("Position is already occupied.......\n");
            continue;
        }

        // 4. Mark the move
        board[row - 1][col - 1] = currentplayer;
        moves++;

        // 5. Check winning conditions

        // Check rows, columns and diagonals
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == currentplayer && board[i][1] == currentplayer && board[i][2] == currentplayer) {
                printf("Congratulations! Player %c wins!\n", currentplayer);
                flag = 0;
                break;
            }

            // Check columns
            if (board[0][i] == currentplayer && board[1][i] == currentplayer && board[2][i] == currentplayer) {
                printf("Congratulations! Player %c wins!\n", currentplayer);
                flag = 0;
                break;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentplayer && board[1][1] == currentplayer && board[2][2] == currentplayer) ||
            (board[0][2] == currentplayer && board[1][1] == currentplayer && board[2][0] == currentplayer)) {
            printf("Congratulations! Player %c wins!\n", currentplayer);
            flag = 0;
        }

        // 6. Check for draw
        if (moves == 9 && flag) {
            printf("It's a draw!\n");
            flag = 0;
        }

        // 7. Switch player
        if (flag) {
            currentplayer = (currentplayer == 'X') ? 'O' : 'X';
        }
    }

    return 0;
}
