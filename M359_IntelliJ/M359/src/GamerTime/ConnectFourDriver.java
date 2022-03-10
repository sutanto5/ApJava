package GamerTime;

import java.util.Scanner;

public class ConnectFourDriver {

    public static String[][] board = new String[6][7];
    public static final String RED = "\u001b[31m";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        fillBoard();
        printBoard();
        Scanner scan = new Scanner(System.in);

        int counter = 0;


        while(true) {

            System.out.println("Choose a column");
            int column = scan.nextInt() - 1;


            while(!validCol(column)){
                System.out.println("Choose a column in between 1-7");
                column = scan.nextInt()-1;
            }
            int row = findRow(column);

            if(counter%2 == 0){
                board[row][column] = RED + 'O' + RESET;
            }else{
                board[row][column] = YELLOW + 'O' + RESET;
            }

            printBoard();

            if(checkFourInCol(column) || checkFourInRow(column) || checkFourInDiagonal(column)){
                System.out.println("Winner");
                System.exit(42);
            }

            counter++;
        }
    }


    /**
     * prints the chart
     */
    public static void printBoard() {
        System.out.println( "    1    2    3    4    5    6    7");

        for (int row = 0; row < board.length; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < board[0].length; col++) {

                System.out.print("| " + board[row][col] + " |");

            }
            System.out.println();
        }


    }

    public static void fillBoard(){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col< board[0].length; col++){
                board[row][col] = " ";
            }
        }
    }

    public static int findRow(int choice){
        for(int row = board.length-1; row >= 0; row--){
            if(board[row][choice] == " "){
                return row;
            }

        }
        //tell row is full
        return 0;
    }

    public static boolean validCol(int col){
        if(col > board[0].length -1 || col < 0 ){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean checkFourInCol(int col){
        int count = 0;
        for(int row = 0; row < board.length-2; row++){
            if(!board[row][col].equals(" ")) {
                if (board[row][col].equals(board[row + 1][col])) {
                    count++;

                } else {
                    count = 0;
                }

                if (count >= 2) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkFourInRow(int col){
        int count = 0;
        int row = findRow(col);
        for(int colAmount = 0; colAmount < board[0].length; colAmount++){
            if(!board[row][colAmount].equals(" ")) {
                if (board[row][colAmount].equals(board[row][colAmount + 1])) {
                    count++;

                } else {
                    count = 0;
                }

                if (count >= 2) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkFourInDiagonal(int col) {
        int count = 0;
        int row = findRow(col);
            for (int column = 0; column < board[0].length; column++) {
                if (!board[row][column].equals(" ")) {
                    if (board[row][column].equals(board[row + 1][column + 1])) {
                        count++;

                    } else {
                        count = 0;
                    }

                    if (count >= 2) {
                        return true;
                    }
                }
                if(row > 0) {
                    row--;
                }
                else{
                    return false;
                }
            }

        return false;
    }
}
