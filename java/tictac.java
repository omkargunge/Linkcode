import java.util.Scanner;

public class TIC_TAC_TOE1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO TIC_TAC_TOC");
        char board[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        char player='X';
        int moves=0;

        while(true){
            //print the board
            System.out.println("1 2 3");
            for(int i=0;i<board.length;i++) {
                System.out.println("-------------------");
                System.out.print(i+1);
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" | ");
                }
                System.out.println();
            }
            System.out.println("---------------");
            //play moves

            System.out.println("Player "+Player+" is Playing......");
            System.out.println("Enter row num:");
            int row=sc.nextInt();//7
            if(row<=0||row>=4){
                System.out.println("Invalid row num.....");
                continue;
            }
            System.out.println("Enter col num:");
            int col=sc.nextInt();//1
            if(col<=0||col>=4){
                System.out.println("Invalid col num");
                continue;
            }
            if(board[row-1][col-1]!=' '){
                System.out.println("Already occupied ");
                continue;
            }
            board[row-1][row-1]=player;
            moves++;
            player=(player=='X'?'O':'X');
        }
    }
}