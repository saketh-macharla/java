package Section6;

import java.util.Scanner;

public class Project6_2_TicTacToe {
    static char[][] board=new char[3][3];
    static void initialize(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='-';
            }
        }
    }
    static void  printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static boolean isEmpty(int row,int col){
        if(board[row][col]=='-')
            return true;
        return false;
    }
    static void insert(char val,int row,int col){
        if(isEmpty(row,col)){
            board[row][col]=val;
        }
    }
    static boolean isWinner(char val,int row,int col){
        return (board[row][0] == val && board[row][1] == val && board[row][2] == val ||
                board[0][col] == val && board[1][col] == val && board[2][col] == val ||
                row == col && board[0][0] == val && board[1][1] == val && board[2][2] == val ||
                row + col == 2 && board[0][2] == val && board[1][1] == val && board[2][0] == val);
    }
    static boolean isDraw(){
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]!='-'){
                    count++;
                }
            }
        }
        return count==9;
    }
    public static void main(String[] args) {
        System.out.println("Lets Start the Game");
        initialize();
        int row,col;
        char val;
        System.out.println("First player choose 'X' or 'O' and select row or col");
        Scanner scanner=new Scanner(System.in);
        val=scanner.next().charAt(0);
        row=scanner.nextInt();
        col=scanner.nextInt();
        insert(val,row,col);
        while(!isDraw()){
            printBoard();
            if(isWinner(val,row,col)){
                System.out.println("Winner is "+val);
                printBoard();
                break;
            }
            System.out.println(val+" chance is over give chance to other player");
            val=scanner.next().charAt(0);
            row=scanner.nextInt();
            col=scanner.nextInt();
            insert(val,row,col);
        }


    }
}
